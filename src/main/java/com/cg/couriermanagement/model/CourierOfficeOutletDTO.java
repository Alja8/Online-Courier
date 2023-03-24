package com.cg.couriermanagement.model;

import java.time.LocalTime;


import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class CourierOfficeOutletDTO {
	private int officeId;
	private LocalTime openingTime;
	private LocalTime closingTime;
	public int getOfficeId() {
		return officeId;
	}
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	public LocalTime getOpeningTime() {
		return openingTime;
	}
	public void setOpeningTime(LocalTime openingTime) {
		this.openingTime = openingTime;
	}
	public LocalTime getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}
	
	
}
