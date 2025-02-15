package com.library.model;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
@Entity
@Table(name = "borrow_history")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class BorrowHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false)
    private Books book;

    public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	public LocalDateTime getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(LocalDateTime borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public LocalDateTime getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(LocalDateTime returnedDate) {
		this.returnedDate = returnedDate;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Column(nullable = false)
    private LocalDateTime borrowedDate;

    private LocalDateTime returnedDate;

    @Version
    private int version; 

    // Optimistic Locking field
   // This field will track the version of the entity
}
