package com.mahesh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "Item")
public class Item {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="firstname")
	private String firstName;

	@Column(name="lastname")
	private String lastName;

	@Column(name="itemnumber")
	private int itemNumber;

	@Column(name="units")
	private String units;

	@Column(name="makeorbuy")
	private String makeOrBuy;

	@Column(name="thumbnail")
	private byte thumbnail;

	@Column(name="revision")
	private int revision;

	@Column(name="createddate")
	private java.sql.Date createdDate;

	@Column(name="createdby")
	private String createdBy;

	@Column(name="modifieddate")
	private java.sql.Date modifiedDate;

	@Column(name="modifiedby")
	private String modifiedBy;


	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	public String getMakeOrBuy() {
		return makeOrBuy;
	}

	public void setMakeOrBuy(String makeOrBuy) {
		this.makeOrBuy = makeOrBuy;
	}

	public byte getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(byte thumbnail) {
		this.thumbnail = thumbnail;
	}

	public int getRevision() {
		return revision;
	}

	public void setRevision(int revision) {
		this.revision = revision;
	}

	public java.sql.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.sql.Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public java.sql.Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(java.sql.Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}


	@Override
	public String toString() {
		return "Item [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", itemNumber=" + itemNumber
				+ ", units=" + units + ", makeOrBuy=" + makeOrBuy + ", thumbnail=" + thumbnail + ", revision=" + revision
				+ ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate
				+ ", modifiedBy=" + modifiedBy + "]";
	}

		

}
