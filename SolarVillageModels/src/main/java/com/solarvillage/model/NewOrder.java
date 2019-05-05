package com.solarvillage.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class NewOrder implements java.io.Serializable {

	@org.kie.api.definition.type.Label("Customer Name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label("Customer Address")
	private java.lang.String address;
	@org.kie.api.definition.type.Label("Is customer member of HOA")
	private java.lang.Boolean hoaMember;
	@org.kie.api.definition.type.Label("Date of HOA meeting")
	private java.util.Date hoaMeetingDate;

	public NewOrder() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.Boolean getHoaMember() {
		if (this.hoaMember == null) {
			return false;
		} else {
			return this.hoaMember;
		}
	}

	public void setHoaMember(java.lang.Boolean hoaMember) {
		this.hoaMember = hoaMember;
	}

	public java.util.Date getHoaMeetingDate() {
		return this.hoaMeetingDate;
	}

	public void setHoaMeetingDate(java.util.Date hoaMeetingDate) {
		this.hoaMeetingDate = hoaMeetingDate;
	}

	public NewOrder(java.lang.String name, java.lang.String address,
			java.lang.Boolean hoaMember, java.util.Date hoaMeetingDate) {
		this.name = name;
		this.address = address;
		this.hoaMember = hoaMember;
		this.hoaMeetingDate = hoaMeetingDate;

	}

}