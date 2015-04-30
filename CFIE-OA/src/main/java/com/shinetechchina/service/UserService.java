package com.shinetechchina.service;

import com.shinetechchina.entity.User;

public interface UserService {

	public User save(User user) throws java.lang.IllegalArgumentException;

	public User findById(Long id) throws java.lang.IllegalArgumentException;
}
