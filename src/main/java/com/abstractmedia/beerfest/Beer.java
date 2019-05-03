package com.abstractmedia.beerfest;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Beer implements Serializable {

	private static final long serialVersionUID = -1723798766434132067L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String type;
	private float alchPerc;
	
	
	public Beer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Beer(Integer id, String name, String type, float alchPerc) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.alchPerc = alchPerc;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getAlchPerc() {
		return alchPerc;
	}
	public void setAlchPerc(float alchPerc) {
		this.alchPerc = alchPerc;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Beer [id=" + id + ", name=" + name + ", type=" + type + ", alchPerc=" + alchPerc + "]";
	}

	
	
	
	
}
