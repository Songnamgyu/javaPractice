package com.song.practice.collection;

public class BookVO {

	private String name;
	private String title;
	private int price;
	
	
	public BookVO() {}


	public BookVO(String name, String title, int price) {
		super();
		this.name = name;
		this.title = title;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public String getTitle() {
		return title;
	}


	public int getPrice() {
		return price;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "BookVO [name=" + name + ", title=" + title + ", price=" + price 
				+"]";
	}
	
	
	
}
