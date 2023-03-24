package com.cg.couriermanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="complaint")
@ToString
@Data
public class ComplaintEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int complaintId;
	private int consignmentNo;
	private String shortDescription;
	private String longDescripion;
	
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="customerId")
	private CustomerEntity costomer;

	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public int getConsignmentNo() {
		return consignmentNo;
	}

	public void setConsignmentNo(int consignmentNo) {
		this.consignmentNo = consignmentNo;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescripion() {
		return longDescripion;
	}

	public void setLongDescripion(String longDescripion) {
		this.longDescripion = longDescripion;
	}

	public CustomerEntity getCostomer() {
		return costomer;
	}

	public void setCostomer(CustomerEntity costomer) {
		this.costomer = costomer;
	}

	@Override
	public String toString() {
		return "ComplaintEntity [complaintId=" + complaintId + ", consignmentNo=" + consignmentNo
				+ ", shortDescription=" + shortDescription + ", longDescripion=" + longDescripion + ", costomer="
				+ costomer + "]";
	}

	public ComplaintEntity(int complaintId, int consignmentNo, String shortDescription, String longDescripion,
			CustomerEntity costomer) {
		super();
		this.complaintId = complaintId;
		this.consignmentNo = consignmentNo;
		this.shortDescription = shortDescription;
		this.longDescripion = longDescripion;
		this.costomer = costomer;
	}

	public ComplaintEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
