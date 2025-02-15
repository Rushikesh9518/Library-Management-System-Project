package com.library.dto;


import java.time.LocalDateTime;
import java.util.UUID;

//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
public class BorrowHistoryDTO {
    private UUID id;
    private String title;
    private LocalDateTime borrowDate;
    private LocalDateTime returnDate;
    
	public BorrowHistoryDTO(UUID id, String title, LocalDateTime borrowDate, LocalDateTime returnDate) {
		super();
		this.id = id;
		this.title = title;
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
	}
   
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDateTime getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(LocalDateTime borrowDate) {
		this.borrowDate = borrowDate;
	}
	public LocalDateTime getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}
	




}

