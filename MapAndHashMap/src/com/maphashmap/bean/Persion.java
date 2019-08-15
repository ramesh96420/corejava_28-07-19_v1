package com.maphashmap.bean;

public class Persion {

	private Integer id;
	private String persionName;
	private String city;
	
	public Persion(Integer id, String persionName, String city) {
		super();
		this.id = id;
		this.persionName = persionName;
		this.city = city;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPersionName() {
		return persionName;
	}
	public void setPersionName(String persionName) {
		this.persionName = persionName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Persion [id=" + id + ", persionName=" + persionName + ", city=" + city + "]";
	}
	
	
	
}
