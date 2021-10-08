package com.pdewey.languages.models;

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
import javax.validation.constraints.Size;

@Entity
@Table(name="languages")
public class Language {
	
	// ********** Primary Key ******************
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;
	
	// ********** Member Variables *************
	
	@NotBlank( message = "Language name cannot be blank." )
	@Size( min = 3, max = 20, message = "Language name must be between 3 and 20 characters." )
	private String name;
	
	@NotBlank( message = "Creator cannot be blank." )
	@Size( min = 3, max = 20, message = "Creator must be between 3 and 20 characters." )
	private String creator;
	
	@NotBlank( message = "Version cannot be blank." )
	private String version;
	
	@Column( updatable = false )
	private Date createdAt;
	
	private Date updatedAt;

	// ********** Constructors *****************
	
	public Language() {}
	
	public Language(
			@NotBlank @Size( min = 3, max = 20 ) String name,
			@NotBlank @Size( min = 3, max = 20 ) String creator,
			@NotBlank String version
			) {
		
			this.name = name;
			this.creator = creator;
			this.version = version;
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

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
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
	
	// ********** Create / Update **************
	
	@PreUpdate
	public void onUpdate() {
		this.updatedAt = new Date();
	}
	
	@PrePersist
	public void onCreate() {
		this.createdAt = new Date();
	}
	
	
	
	
}
