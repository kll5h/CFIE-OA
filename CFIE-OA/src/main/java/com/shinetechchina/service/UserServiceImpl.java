package com.shinetechchina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shinetechchina.entity.User;
import com.shinetechchina.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.shinetechchina.service.UserService#save(com.shinetechchina.entity
	 * .User)
	 */
	@Override
	public User save(User user) throws IllegalArgumentException {
		if (null == user) {
			throw new IllegalArgumentException();
		}

		return userRepository.save(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shinetechchina.service.UserService#findById(java.lang.Long)
	 */
	@Override
	public User findById(Long id) throws IllegalArgumentException {
		if (null == id || id.longValue() < 1L) {
			throw new IllegalArgumentException();
		}

		return userRepository.findOne(id);
	}

}
