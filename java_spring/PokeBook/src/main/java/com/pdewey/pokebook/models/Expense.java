package com.pdewey.pokebook.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
@Table(name="expenses")
public class Expense {
	
	// ********** Member Variables *************
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	@NotBlank( message = "Expense name cannot be empty." )
	@Size( min = 2, max = 20, message = "Expense name must be between 2 and 20 characters " )
	private String name;
	
	@NotBlank( message = "Vendor must not be empty." )
	@Size( min = 2, max = 15, message = "Vendor must be between 2 and 15 characters." )
	private String vendor;
	
	@NotNull( message = "Amount must not be empty." )
	@Positive( message = "Amount must be greater than zero." )
	private double amount;
	
	@NotBlank( message="Description must not be empty." )
	@Size( min = 8, max = 200, message = "Description must be between 8 and 200 characters." )
	private String description;
	
	@Column( updatable = false)
	private Date createdAt;
	
	private Date updatedAt;
	
	// ********** Constructors *****************
	
	public Expense() {}
	
	public Expense(
			@NotNull @Size( min = 2, max = 20 ) String name,
			@NotNull @Size( min = 2, max = 15) String vendor,
			@NotNull @Positive Integer amount,
			@NotNull @Size( min = 8, max = 200 ) String description
			) {
		
			this.name = name;
			this.amount = amount;
			this.description = description;
	}
	
	// ********** Getters and Setters **********
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getVendor() {
		return vendor;
	}
	
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	// ********** Update And Create ************
	
	@PreUpdate
	public void onUpdate() {
		this.updatedAt = new Date();
	}
	
	@PrePersist
	public void onCreate() {
		this.createdAt = new Date();
	}

	
	
}
