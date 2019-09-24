package com.mycompany.comptimemanager.model.entity;

public abstract class BaseEntity {
	private static Integer autoIncrementId = 1;
	private Integer Id;
	
	public BaseEntity () {
		this.setId();
	}
	
	public void setId() {
		this.Id = autoIncrementId++;
	}
	
	public Integer getId() {
		return Id;
	}
}
