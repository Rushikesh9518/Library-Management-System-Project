package com.library.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
@Entity
@Table(name = "books")
public class Books {

    @Id
    @GeneratedValue
    private UUID id; 
    
    private String bookId;

    @Column(nullable = false)
    private String title;

    public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(Integer publishedYear) {
		this.publishedYear = publishedYear;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public List<BorrowHistory> getBorrowHistory() {
		return borrowHistory;
	}

	public void setBorrowHistory(List<BorrowHistory> borrowHistory) {
		this.borrowHistory = borrowHistory;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String status; // 'available' or 'borrowed'

    @Column(nullable = false)
    private Integer publishedYear;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt; 

    @Column(nullable = false)
    private LocalDateTime updatedAt; 
    
    @Column(nullable = false)
    private Integer quantity;
    
    @JsonIgnore
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<BorrowHistory> borrowHistory;

    @Version
    private int version;


}
