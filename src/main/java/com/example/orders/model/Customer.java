package com.example.orders.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customers")
public class Customer {
	
	@Id
	private String id;
	private String name;
	private String adapter;
	private String address;
	private String defaultScac;
	private String dunsNumber;
	private String activeFlg;
	private Date updateDate;
	private String updateUser;
	private int version;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the adapter
	 */
	public String getAdapter() {
		return adapter;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return the defaultScac
	 */
	public String getDefaultScac() {
		return defaultScac;
	}
	/**
	 * @return the dunsNumber
	 */
	public String getDunsNumber() {
		return dunsNumber;
	}
	/**
	 * @return the activeFlg
	 */
	public String getActiveFlg() {
		return activeFlg;
	}
	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}
	/**
	 * @return the updateUser
	 */
	public String getUpdateUser() {
		return updateUser;
	}
	/**
	 * @return the version
	 */
	public int getVersion() {
		return version;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param adapter the adapter to set
	 */
	public void setAdapter(String adapter) {
		this.adapter = adapter;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @param defaultScac the defaultScac to set
	 */
	public void setDefaultScac(String defaultScac) {
		this.defaultScac = defaultScac;
	}
	/**
	 * @param dunsNumber the dunsNumber to set
	 */
	public void setDunsNumber(String dunsNumber) {
		this.dunsNumber = dunsNumber;
	}
	/**
	 * @param activeFlg the activeFlg to set
	 */
	public void setActiveFlg(String activeFlg) {
		this.activeFlg = activeFlg;
	}
	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	/**
	 * @param updateUser the updateUser to set
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}
	
}
