package com.cg.couriermanagement.service;

import com.cg.couriermanagement.entity.AppUserEntity;
import com.cg.couriermanagement.exception.AppUserException;
import com.cg.couriermanagement.exception.InvalidPasswordException;
import com.cg.couriermanagement.model.AppUser;

public interface IAppUserService {

	public AppUser register(AppUser appUser) throws AppUserException;
	public AppUserEntity login(int userId, String password)throws AppUserException, InvalidPasswordException;
	
}
