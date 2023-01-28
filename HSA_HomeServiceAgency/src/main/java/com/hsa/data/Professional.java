package com.hsa.data;

public class Professional {
	private int id; 
	private String name = null;
	private String email = null;
	private int rating ;
	private String gender;
	private int serviceId;
	private String phone;
	private String altPhone;
	
	public Professional(int id, String name, String email, int rating, String gender, String phone, String altPhone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.rating = rating;
		this.gender = gender;
		this.phone = phone;
		this.altPhone = altPhone;
	}
	public Professional(int id, String name, String email, int rating, String gender, int serviceId, String phone,
			String altPhone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.rating = rating;
		this.gender = gender;
		this.serviceId = serviceId;
		this.phone = phone;
		this.altPhone = altPhone;
	}
	public Professional(int id, String name, String email, int rating, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.rating = rating;
		this.gender = gender;
	}
	public Professional(int id, String name, String email, int rating, String gender, int serviceId) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.rating = rating;
		this.gender = gender;
		this.serviceId = serviceId;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAltPhone() {
		return altPhone;
	}
	public void setAltPhone(String altPhone) {
		this.altPhone = altPhone;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Professional [id=" + id + ", name=" + name + ", email=" + email + ", rating=" + rating + ", gender="
				+ gender + ", serviceId=" + serviceId + ", phone=" + phone + ", altPhone=" + altPhone + "]";
	}
	
}
