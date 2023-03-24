package com.cg.couriermanagement.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.couriermanagement.entity.AppUserEntity;
import com.cg.couriermanagement.entity.Role;
import com.cg.couriermanagement.exception.AppUserException;
import com.cg.couriermanagement.exception.InvalidPasswordException;
import com.cg.couriermanagement.model.AppUser;
import com.cg.couriermanagement.repository.AppUserRepo;

@Service
public class IAppUserServiceImpl implements IAppUserService{

	@Autowired
	private AppUserRepo appUserRepo;
	
	@Override
	public AppUser register(AppUser appUser) throws AppUserException{
		// TODO Auto-generated method stub
		Optional<AppUserEntity> existingAppUser= appUserRepo.findById(appUser.getUserId());		
	    if (existingAppUser.isPresent()) {
	        throw new AppUserException("App User Already exists");
	    } 
	    
	    else {
	    	//convert AppUser Model to AppUser Entity      741006550000053
	    	AppUserEntity appUserEntity = new AppUserEntity();
			BeanUtils.copyProperties(appUser, appUserEntity);
			appUserEntity.setRole(Role.CUSTOMER);
			
			AppUserEntity newAppUserEntity = appUserRepo.save(appUserEntity);
			//convert AppUser Entity  to AppUser Model
	        AppUser newUser = new AppUser();
	        BeanUtils.copyProperties(newAppUserEntity, newUser);
	        newUser.setRole(com.cg.couriermanagement.model.Role.CUSTOMER);
	        return newUser;
	    }
	}


	@Override
	public AppUserEntity login(int userId, String password)throws AppUserException, InvalidPasswordException{
		// TODO Auto-generated method stub
		
		if(appUserRepo.findById(userId).isPresent()) {
			AppUserEntity appUserEntity = appUserRepo.findById(userId).get();
			if(appUserEntity.getPassword().equals(password)) {
				AppUserEntity save = this.appUserRepo.save(appUserEntity);
				return save;
			}
			else {
				throw new InvalidPasswordException("Invalid Password");
			}
		}
		else {
			throw new AppUserException("User Does not Exist!");
			
			
		}
	}

}


















//AppUserEntity appUserEntity = new AppUserEntity();
//BeanUtils.copyProperties(appUser, appUserEntity);
//
//AppUserEntity newAppUserEntity = repo.save(appUserEntity);
////convert AppUser Entity  to AppUser Model
//AppUser newUser = new AppUser();
//BeanUtils.copyProperties(newAppUserEntity, newUser);
//
//return newUser;
//	
//	AppUserResponse userResponse= new AppUserResponse();
//    userResponse.setUserName(appuser.getUserName());
//    userResponse.setPassword(appuser.getPassword());
//    userResponse.setRole(appuser.getRole());
//    userResponse.setMobileNumber(appuser.getMobileNumber());
//    return userResponse;
//}