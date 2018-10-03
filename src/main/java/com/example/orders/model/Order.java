package com.example.orders.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
public class Order {
	
	@Id
	private String id;
	@Transient
	private String cusDunsNumber;
	private Customer customer;
	private String uniqueIdentifier;
	private Date createDate;
	private Date planPickupDateMin;
	private Date planPickupDateMax;
	private Date planArrivalDateMin;
	private Date planArrivalDateMax;
	private Date actualPickupDateMin;
	private Date actualPickupDateMax;
	private Date actualArrivalDateMin;
	private Date actualArrivalDateMax;
	private String origin;
	private String destination;
	private int quantity;
	private int actualQuanity;
	private ArrayList<LineItem> lineItems;
	private ArrayList<Accessorial> accessorial;
	private ArrayList<Reference> references;
	private String status;
	private String activeFlg;
	private Date updateDate;
	private String updateUser;
	private int version;
	
	public Order () {
		this.activeFlg = "Y";
		this.updateDate = new Date();
		this.updateUser = "user";
		this.version = 1;
	}
	
	public Order(Order order) {
		
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the cusDunsNumber
	 */
	public String getCusDunsNumber() {
		return cusDunsNumber;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the uniqueIdentifier
	 */
	public String getUniqueIdentifier() {
		return uniqueIdentifier;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @return the planPickupDateMin
	 */
	public Date getPlanPickupDateMin() {
		return planPickupDateMin;
	}

	/**
	 * @return the planPickupDateMax
	 */
	public Date getPlanPickupDateMax() {
		return planPickupDateMax;
	}

	/**
	 * @return the planArrivalDateMin
	 */
	public Date getPlanArrivalDateMin() {
		return planArrivalDateMin;
	}

	/**
	 * @return the planArrivalDateMax
	 */
	public Date getPlanArrivalDateMax() {
		return planArrivalDateMax;
	}

	/**
	 * @return the actualPickupDateMin
	 */
	public Date getActualPickupDateMin() {
		return actualPickupDateMin;
	}

	/**
	 * @return the actualPickupDateMax
	 */
	public Date getActualPickupDateMax() {
		return actualPickupDateMax;
	}

	/**
	 * @return the actualArrivalDateMin
	 */
	public Date getActualArrivalDateMin() {
		return actualArrivalDateMin;
	}

	/**
	 * @return the actualArrivalDateMax
	 */
	public Date getActualArrivalDateMax() {
		return actualArrivalDateMax;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @return the actualQuanity
	 */
	public int getActualQuanity() {
		return actualQuanity;
	}

	/**
	 * @return the lineItems
	 */
	public ArrayList<LineItem> getLineItems() {
		return lineItems;
	}

	/**
	 * @return the accessorial
	 */
	public ArrayList<Accessorial> getAccessorial() {
		return accessorial;
	}

	/**
	 * @return the references
	 */
	public ArrayList<Reference> getReferences() {
		return references;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
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
	 * @param cusDunsNumber the cusDunsNumber to set
	 */
	public void setCusDunsNumber(String cusDunsNumber) {
		this.cusDunsNumber = cusDunsNumber;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @param uniqueIdentifier the uniqueIdentifier to set
	 */
	public void setUniqueIdentifier(String uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @param planPickupDateMin the planPickupDateMin to set
	 */
	public void setPlanPickupDateMin(Date planPickupDateMin) {
		this.planPickupDateMin = planPickupDateMin;
	}

	/**
	 * @param planPickupDateMax the planPickupDateMax to set
	 */
	public void setPlanPickupDateMax(Date planPickupDateMax) {
		this.planPickupDateMax = planPickupDateMax;
	}

	/**
	 * @param planArrivalDateMin the planArrivalDateMin to set
	 */
	public void setPlanArrivalDateMin(Date planArrivalDateMin) {
		this.planArrivalDateMin = planArrivalDateMin;
	}

	/**
	 * @param planArrivalDateMax the planArrivalDateMax to set
	 */
	public void setPlanArrivalDateMax(Date planArrivalDateMax) {
		this.planArrivalDateMax = planArrivalDateMax;
	}

	/**
	 * @param actualPickupDateMin the actualPickupDateMin to set
	 */
	public void setActualPickupDateMin(Date actualPickupDateMin) {
		this.actualPickupDateMin = actualPickupDateMin;
	}

	/**
	 * @param actualPickupDateMax the actualPickupDateMax to set
	 */
	public void setActualPickupDateMax(Date actualPickupDateMax) {
		this.actualPickupDateMax = actualPickupDateMax;
	}

	/**
	 * @param actualArrivalDateMin the actualArrivalDateMin to set
	 */
	public void setActualArrivalDateMin(Date actualArrivalDateMin) {
		this.actualArrivalDateMin = actualArrivalDateMin;
	}

	/**
	 * @param actualArrivalDateMax the actualArrivalDateMax to set
	 */
	public void setActualArrivalDateMax(Date actualArrivalDateMax) {
		this.actualArrivalDateMax = actualArrivalDateMax;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param actualQuanity the actualQuanity to set
	 */
	public void setActualQuanity(int actualQuanity) {
		this.actualQuanity = actualQuanity;
	}

	/**
	 * @param lineItems the lineItems to set
	 */
	public void setLineItems(ArrayList<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	/**
	 * @param accessorial the accessorial to set
	 */
	public void setAccessorial(ArrayList<Accessorial> accessorial) {
		this.accessorial = accessorial;
	}

	/**
	 * @param references the references to set
	 */
	public void setReferences(ArrayList<Reference> references) {
		this.references = references;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
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
