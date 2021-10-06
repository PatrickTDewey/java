package com.pdewey.models;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 5, max = 200)
	private String title;
	@Size(min = 20, max = 200)
	private String description;
	@Size(min = 3, max = 40)
	private String language;
	@Min(100)
	private Integer numberOfPages;
	// This will not allow the createdAt column to be updated after
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;

	// Constructors
	public Book() {

	}

	public Book(@Size(min = 5, max = 200) String title, @Size(min = 20, max = 200) String description, @Size(min = 3, max = 40) String language,
			@Min(100) Integer numberOfPages) {
		super();
		this.title = title;
		this.description = description;
		this.language = language;
		this.numberOfPages = numberOfPages;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	@PrePersist
	public void onCreate() {
		this.createdAt = new Date();
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	@PreUpdate
	public void onUpdate() {
		this.updatedAt = new Date();
	}

}
