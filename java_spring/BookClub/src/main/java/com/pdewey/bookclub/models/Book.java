package com.pdewey.bookclub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "books")
public class Book {
	// ********** Member Variables ****************

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 5, max = 200, message = "Title must be between 5 and 200 characters.")
	private String title;

	@Size(min = 2, max = 30, message = "Author must be between 2 and 30 characters.")
	private String author;


	@Size(min = 2, max = 200, message = "My thoughts must be between 2 and 200 characters.")
	private String myThoughts;


	@Column(updatable = false) // *This will not allow the createdAt column to be updated after*
	private Date createdAt;

	private Date updatedAt;
	
	// ********** Relationships ****************
	
	@ManyToOne( fetch = FetchType.LAZY )
	@JoinColumn( name = "user_id" )
	private User user;

	// ********** Constructors ********************

	public Book() {

	}


	// ********** Getters and Setters *************
	
	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getMyThoughts() {
		return myThoughts;
	}


	public void setMyThoughts(String myThoughts) {
		this.myThoughts = myThoughts;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

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


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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
