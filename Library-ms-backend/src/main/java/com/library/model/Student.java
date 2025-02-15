package com.library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
@Entity
@Table(name = "users")
public class Student {

    @Id
    @GeneratedValue
    private UUID id;
    
    @Column(nullable = false)
    private String studentEnrollNo;
    
    public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getStudentEnrollNo() {
		return studentEnrollNo;
	}

	public void setStudentEnrollNo(String studentEnrollNo) {
		this.studentEnrollNo = studentEnrollNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<BorrowHistory> getBorrowHistory() {
		return borrowHistory;
	}

	public void setBorrowHistory(List<BorrowHistory> borrowHistory) {
		this.borrowHistory = borrowHistory;
	}

	public List<UUID> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(List<UUID> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	@Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;
    
    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private Long mobile;
   
    private String role;

    @Column(nullable = false, updatable = false)
    private String createdAt;

    @Column(nullable = false)
    private String updatedAt;
    
    
    @JsonIgnore
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<BorrowHistory> borrowHistory;
    
    @ElementCollection
    private List<UUID> borrowedBooks = new ArrayList<>();
}

