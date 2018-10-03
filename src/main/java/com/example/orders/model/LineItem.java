package com.example.orders.model;

public class LineItem {

	private String type;
	private String description;
	private int plannedQuantity;
	private int actualQuantity;
	private String unit;
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the plannedQuantity
	 */
	public int getPlannedQuantity() {
		return plannedQuantity;
	}
	/**
	 * @return the actualQuantity
	 */
	public int getActualQuantity() {
		return actualQuantity;
	}
	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param plannedQuantity the plannedQuantity to set
	 */
	public void setPlannedQuantity(int plannedQuantity) {
		this.plannedQuantity = plannedQuantity;
	}
	/**
	 * @param actualQuantity the actualQuantity to set
	 */
	public void setActualQuantity(int actualQuantity) {
		this.actualQuantity = actualQuantity;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
		
}
