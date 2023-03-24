package com.cg.couriermanagement.entity;

public enum CourierStatus {
	 
INITIATED("INITIATED"),
INTRANSIT("TRANSIT"),
DELIVERED("DELIVERED"),
REJECTED("REJECTED");
 
private String courierStatus;
CourierStatus(String courierStatus){
this.courierStatus = courierStatus;
}
public String getCourierStatus() {
return courierStatus;
}


}
