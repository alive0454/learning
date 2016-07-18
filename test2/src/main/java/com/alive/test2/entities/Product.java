package com.alive.test2.entities;


import java.io.Serializable;
public class Product implements Serializable{
	
	
	private static final long serialVersionUID=1L;
	private int id;
	private String name;
	private double price;
	
	
	public Product(){
	}
	public Product(String name,double price){
		super();
		this.setName(name);
		this.setPrice(price);
	}
	
	public Product(int id,String name,double price){
		super();
		this.setId(id);
		this.setName(name);
		this.setPrice(price);
	}
	
	@Override
	public String toString(){
		return "±àºÅ(id)£º" + this.getId() + "£¬Ãû³Æ(name)£º" + this.getName() + "£¬¼Û¸ñ(price)£º" + this.getPrice();
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
