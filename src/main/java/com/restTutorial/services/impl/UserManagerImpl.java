package com.restTutorial.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.restTutorial.dao.UserDao;
import com.restTutorial.models.Favorites;
import com.restTutorial.models.Saved;
import com.restTutorial.models.User;
import com.restTutorial.services.UserManager;

@Service("userManager")
@Transactional
public class UserManagerImpl extends GenericManagerImpl<User, Long> implements UserManager {

	private UserDao userDao;
	
	@Autowired
	public UserManagerImpl(UserDao dao) {
		super(dao);
		this.userDao = dao;
	}

	public User getUserById(Long id) {
		return userDao.get(id);
	}
	
	public List<User> searchForUserByName(String name) {
		return userDao.searchForUserByName(name);
	}

	public List<Favorites> searchForUserFavorites(Long userId) {
		return userDao.searchForUserFavorites(userId);
	}
	
	public List<Saved> searchForUserSaved(Long userId) {
		return userDao.searchForUserSaved(userId);
	}

	public Favorites getFavorites(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Favorites save(Favorites favorite) {
		// TODO Auto-generated method stub
		return null;
	}
}