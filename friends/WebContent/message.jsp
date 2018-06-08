<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的信息</title>
<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" href="css/bootstrap-reboot.min.css" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/Member_info.css" />
		<link rel="stylesheet" href="css/footerCSS.css" />
		<link rel="stylesheet" href="css/headerCSS.css" />
	 <style type="text/css">
    /*鼠标悬停下拉事件*/
    div > .dropdown-menu{
        margin:0;  
    }
    div:hover > .dropdown-menu{
        display:block; 
    }
    div .dropdown-menu{
        font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
        font-size: 10px;
    }
    </style>
	
	</head>

	<body>
		<div class="" style="background-color: #f2f2f2; width:100%;">
		    <jsp:include page="header.jsp"></jsp:include>
		   <h3 style="margin-left:30px">消息中心</h3>
		   <div class="row" style="height:600px; margin-left:50px; width:90%;">
		    <div class="col-8" style="background-color: white ">
		     <span><a href="#" style="color:#C4ADC9;font-size: 1.5em;">消息</a></span>
		     <span><a href="#"  style="color:#C4ADC9;font-size: 0.8em;" >我发起的消息</a></span>
		       <hr style="margin-top:5px">
		     <div  class="row">
		       <div  class="col-3">
		       <img src="${User.o_photo}" style="width:180px; height:180px">
		         <p style="color:#C4ADC9;font-size: 0.6em;">${User.o_age}岁 ${User.os_city}市辖区</p>
		       </div>
		        <div class="col-7">
		         <span style="color:#C4ADC9;font-size: 0.9em;">发送给<a href="#">${User.o_name}</a>的消息</span>
		     
		        <p style="margin-top:100px">${User.messsge}</p>
		        </div>
		        <div class="col-2">
		      <a href="http://profile.zhenai.com/v2/zhenXin/zhenXinIndex.do?tipType=1&objectId=1996849568"> <button style="margin-top:100px" type="submit">深入沟通</button></a>
		        </div>
		     </div>
		  
		 
		    
		    </div>
		    <div class="col-4" style="">
		    
		    </div>
		   
		   
		   
		   </div>
		   
		    <jsp:include page="footer.jsp"></jsp:include>
		  </div>  
		
		<script src="js/jquery-3.3.1.min.js "></script>
		<script src="js/bootstrap.bundle.min.js"></script>
		<script src="js/bootstrap.min.js "></script>
		
   		
		
	</body>

</html>