package com.example.orders.model;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shipments")
public class Shipment {

	@Id
	private String id;
	private Customer customer;
	private String sid;
	private Date enterDate;
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
	private String status;
	private String scac;
	private ArrayList<Accessorial> accessorial;
	private ArrayList<Reference> references;
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

	private String activeFlg;
	private Date updateDate;
	private String updateUser;
	private int version;
	
	public Shipment() {
		
	}

	public Shipment(Order ord) {
		this.customer = ord.getCustomer();
		this.sid = ord.getUniqueIdentifier();
		if (ord.getPlanPickupDateMin() != null) {
			this.planPickupDateMin = ord.getPlanPickupDateMin();
		}
		if (ord.getPlanPickupDateMax() != null) {
			this.planPickupDateMax = ord.getPlanPickupDateMax();
		}
		if (ord.getPlanArrivalDateMin() != null) {
			this.planArrivalDateMin = ord.getPlanArrivalDateMin();
		}
		if (ord.getPlanArrivalDateMax() != null) {
			this.planArrivalDateMax = ord.getPlanArrivalDateMax();
		}
		if (ord.getActualPickupDateMin() != null) {
			this.actualPickupDateMin = ord.getActualPickupDateMin();
		}
		if (ord.getActualPickupDateMax() != null) {
			this.actualPickupDateMax = ord.getActualPickupDateMax();
		}
		if (ord.getActualArrivalDateMin() != null) {
			this.actualArrivalDateMin = ord.getActualArrivalDateMin();
		}
		if (ord.getActualArrivalDateMax() != null) {
			this.actualArrivalDateMin = ord.getActualArrivalDateMin();
		}
		if (ord.getOrigin() != null) {
			this.origin = ord.getOrigin();
		}
		if (ord.getDestination() != null) {
			this.destination = ord.getDestination();
		}
		this.quantity = ord.getQuantity();
		this.actualQuanity = ord.getQuantity();
		this.status = ord.getStatus();
		this.scac = customer.getDefaultScac();
		this.accessorial = ord.getAccessorial();
		this.references = ord.getReferences();
		this.activeFlg = ord.getActiveFlg();
		this.updateDate = ord.getUpdateDate();
		this.updateUser = ord.getUpdateUser();
		this.version = ord.getVersion();
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @return the enterDate
	 */
	public Date getEnterDate() {
		return enterDate;
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
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the scac
	 */
	public String getScac() {
		return scac;
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
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @param enterDate
	 *            the enterDate to set
	 */
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}

	/**
	 * @param planPickupDateMin
	 *            the planPickupDateMin to set
	 */
	public void setPlanPickupDateMin(Date planPickupDateMin) {
		this.planPickupDateMin = planPickupDateMin;
	}

	/**
	 * @param planPickupDateMax
	 *            the planPickupDateMax to set
	 */
	public void setPlanPickupDateMax(Date planPickupDateMax) {
		this.planPickupDateMax = planPickupDateMax;
	}

	/**
	 * @param planArrivalDateMin
	 *            the planArrivalDateMin to set
	 */
	public void setPlanArrivalDateMin(Date planArrivalDateMin) {
		this.planArrivalDateMin = planArrivalDateMin;
	}

	/**
	 * @param planArrivalDateMax
	 *            the planArrivalDateMax to set
	 */
	public void setPlanArrivalDateMax(Date planArrivalDateMax) {
		this.planArrivalDateMax = planArrivalDateMax;
	}

	/**
	 * @param actualPickupDateMin
	 *            the actualPickupDateMin to set
	 */
	public void setActualPickupDateMin(Date actualPickupDateMin) {
		this.actualPickupDateMin = actualPickupDateMin;
	}

	/**
	 * @param actualPickupDateMax
	 *            the actualPickupDateMax to set
	 */
	public void setActualPickupDateMax(Date actualPickupDateMax) {
		this.actualPickupDateMax = actualPickupDateMax;
	}

	/**
	 * @param actualArrivalDateMin
	 *            the actualArrivalDateMin to set
	 */
	public void setActualArrivalDateMin(Date actualArrivalDateMin) {
		this.actualArrivalDateMin = actualArrivalDateMin;
	}

	/**
	 * @param actualArrivalDateMax
	 *            the actualArrivalDateMax to set
	 */
	public void setActualArrivalDateMax(Date actualArrivalDateMax) {
		this.actualArrivalDateMax = actualArrivalDateMax;
	}

	/**
	 * @param origin
	 *            the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @param destination
	 *            the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param actualQuanity
	 *            the actualQuanity to set
	 */
	public void setActualQuanity(int actualQuanity) {
		this.actualQuanity = actualQuanity;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param scac
	 *            the scac to set
	 */
	public void setScac(String scac) {
		this.scac = scac;
	}

	/**
	 * @param activeFlg
	 *            the activeFlg to set
	 */
	public void setActiveFlg(String activeFlg) {
		this.activeFlg = activeFlg;
	}

	/**
	 * @param updateDate
	 *            the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @param updateUser
	 *            the updateUser to set
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(int version) {
		this.version = version;
	}

	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}

	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}

}
