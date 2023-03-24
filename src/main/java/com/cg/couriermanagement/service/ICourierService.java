package com.cg.couriermanagement.service;

import java.util.List;

import com.cg.couriermanagement.entity.CourierStatus;
import com.cg.couriermanagement.exception.CourierIdNotFoundException;
import com.cg.couriermanagement.exception.CustomerNotFoundException;
import com.cg.couriermanagement.model.CourierDTO;



public interface ICourierService {
public CourierDTO addCourier(CourierDTO courier) throws CustomerNotFoundException;
public CourierStatus checkOnlineStatus(int courierId) throws CourierIdNotFoundException;
public CourierDTO getCourierById(int courierId) throws CourierIdNotFoundException;
public List<CourierDTO> getAllCourierInfo();
}
