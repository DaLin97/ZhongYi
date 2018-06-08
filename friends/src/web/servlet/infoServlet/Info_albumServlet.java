package web.servlet.infoServlet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bean.User;
import service.infoService.info_albumService;
import service.infoService.impl.info_albumServiceImpl;

@WebServlet("/albumServlet")
public class info_albumServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取tomcat下的up目录的路径 已修改为D盘下的up文件夹与tomcat下的up目录的路径共存
		String tomPath = getServletContext().getRealPath("/PhotoAlbum");
		String path = "/PhotoAlbumUP";
		// 临时文件目录 已修改为D盘下的tmp文件夹
		String tmpPath = "/PhotoAlbumUPtmp";
		// 检查我们是否有文件上传请求
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		// 1,声明DiskFileItemFactory工厂类，用于在指定磁盘上设置一个临时目录
		DiskFileItemFactory disk = new DiskFileItemFactory(1024 * 10, new File(tmpPath));
		// 2,声明ServletFileUpload，接收上边的临时文件。也可以默认值
		ServletFileUpload up = new ServletFileUpload(disk);
		up.setFileSizeMax(10 * 1024 * 1024);
		// 3,解析request
		try {
			List<FileItem> list = up.parseRequest(request);
			// 如果就一个文件，
			FileItem file = list.get(0);
			// 获取文件名：
			String fileName = file.getName();
			/*
			 * 对于不同的用户的test.txt文件，不希望覆盖， 后台处理：给用户添加一个唯一标记！
			 */
			// a.随机生成一个唯一标记
			
			
			
			
			
			
			String username = null;
			User attribute = (User) request.getSession().getAttribute("user");
			System.out.println(attribute.getUsername());
			if(attribute.getUsername() != null){
				username = attribute.getUsername();
			}else{
				username = "001";
			}
			//3.封装成User
			User user = new User();
			user.setUsername(username);
			
			
			info_albumService album = new info_albumServiceImpl();
			User useralbum = album.queryAlbum(user); 
			/*String id = useralbum.getUuid();//获取UUID*/			
			String id = UUID.randomUUID().toString();
			
			// 与文件名拼接
			fileName = id + fileName;
			// 获取文件的类型：
			String fileType = file.getContentType();
			// 获取文件的字节码：
			InputStream in = file.getInputStream();
			// 文件大小
			Integer size = file.getInputStream().available();
			String s = size.toString();
			// 声明输出字节流
			OutputStream out = new FileOutputStream(path + "/" + fileName);
			OutputStream out1 = new FileOutputStream(tomPath + "/" + fileName);
			// 文件copy到本地
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = in.read(b)) != -1) {
				out.write(b, 0, len);
				out1.write(b, 0, len);
			}
			out.flush();
			out.close();

			// //声明输出字节流
			// out = new FileOutputStream(tomPath+"/"+fileName);
			//
			//
			// //文件copy到服务器
			// byte [] b1 = new byte[1024];
			// int len1 = 0;
			// while((len=in.read(b1))!=-1){
			// out.write(b1, 0, len1);
			// }
			// out.flush();
			// out.close();

			// 保存唯一文件名
			String novelsrc = fileName;

			// 删除上传生成的临时文件

			file.delete();

			// 显示数据
			// response.setContentType("text/html;charset=UTF-8");
			// PrintWriter pw = response.getWriter();
			// pw.println("文件名："+fileName);
			// pw.println("文件类型："+fileType);
			// pw.println("<br/>文件大小（byte）："+size);
			System.out.println("上传成功");
			
			user.setAlbum(fileName);
			boolean album2 = album.updateAlbum(user);
			if(album2){//修改成功
				request.setAttribute("change", "修改成功");
				request.getRequestDispatcher("/TOalbum").forward(request, response);// 转发
			}else{
				request.setAttribute("change", "修改失败");
				request.getRequestDispatcher("/TOalbum").forward(request, response);// 转发
			}
			
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}