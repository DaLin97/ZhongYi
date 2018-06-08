package service;

import java.util.List;

import bean.User;

public interface SearchService {

	List<User> LookupNinameId(String searchIdNiName);

}
