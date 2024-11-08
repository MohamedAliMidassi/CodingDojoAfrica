package com.example.demo.models;



import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message="Username must not be empty.") //the white space is not considered as a character. 
	@Size(min=2, max=200, message="Username must conatain more then 20 carcteres ")
	private String userName;
	
	@NotEmpty(message="Email must not be empty.") //the white space is not considered as a character. 
	@Email(message="Email must be valid!")
	private String email;

	@NotEmpty(message="Password must not be empty.") //the white space is not considered as a character. 
	@Size(min=8, max=200, message="Password must be between 8 nd 200 characters!")
	private String password;
	
	@Transient // Ignore input and not place into DB
	@NotEmpty(message="Confirm Password must not be empty.") //the white space is not considered as a character. 
	@Size(min=8, max=200, message="Confirm Password must be between 8 nd 200 characters!")
	private String confirmPassword;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	
	@OneToMany(mappedBy="owner", fetch=FetchType.LAZY)
	private List<Book> postedBy;


	public User() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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


	public List<Book> getPostedBy() {
		return postedBy;
	}


	public void setPostedBy(List<Book> postedBy) {
		this.postedBy = postedBy;
	}
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
}
