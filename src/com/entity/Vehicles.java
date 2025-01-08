package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicles {

	@Id
	private String vehicle_No;
	private String maker;
	private String model;
	private String color;
	private String type;
	private long price;

	public Vehicles() {

	}

	public Vehicles(String vehicle_No, String maker, String model, String color, String type, long price) {
		super();
		this.vehicle_No = vehicle_No;
		this.maker = maker;
		this.model = model;
		this.color = color;
		this.type = type;
		this.price = price;
	}

	public String getVehicle_No() {
		return vehicle_No;
	}

	public void setVehicle_No(String vehicle_No) {
		this.vehicle_No = vehicle_No;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicles [vehicle_No=" + vehicle_No + ", maker=" + maker + ", model=" + model + ", color=" + color
				+ ", type=" + type + ", price=" + price + "]";
	}

}
