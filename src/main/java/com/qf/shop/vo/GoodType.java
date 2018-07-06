package com.qf.shop.vo;

public class GoodType {

	private int id;
	private String name;
	private int parentId;
	private String pic;
	
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
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	@Override
	public String toString() {
		return "GoodType [id=" + id + ", name=" + name + ", parentId="
				+ parentId + ", pic=" + pic + "]";
	}
	
}
