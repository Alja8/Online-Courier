 package com.cg.couriermanagement.entity;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="courier_office")
@ToString
@Data
public class CourierOfficeOutletEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int officeId;
	private LocalTime openingTime;
	private LocalTime closingTime;
	
	@OneToMany(mappedBy = "empId")
	private List<OfficeStaffMemberEntity> officeStaffMembers;

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

	public List<OfficeStaffMemberEntity> getOfficeStaffMembers() {
		return officeStaffMembers;
	}

	public void setOfficeStaffMembers(List<OfficeStaffMemberEntity> officeStaffMembers) {
		this.officeStaffMembers = officeStaffMembers;
	}

	@Override
	public String toString() {
		return "CourierOfficeOutletEntity [officeId=" + officeId + ", openingTime=" + openingTime + ", closingTime="
				+ closingTime + ", officeStaffMembers=" + officeStaffMembers + "]";
	}

	public CourierOfficeOutletEntity(int officeId, LocalTime openingTime, LocalTime closingTime,
			List<OfficeStaffMemberEntity> officeStaffMembers) {
		super();
		this.officeId = officeId;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
		this.officeStaffMembers = officeStaffMembers;
	}

	public CourierOfficeOutletEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
