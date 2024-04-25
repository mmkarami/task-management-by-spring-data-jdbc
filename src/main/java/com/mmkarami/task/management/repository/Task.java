package com.mmkarami.task.management.repository;

import java.time.LocalDate;

public class Task {

	private Integer id;

	private String title;

	private String description;

	private LocalDate from;

	private LocalDate to;
	
	public Task() {
	}

	public Task(String title, String description, LocalDate from, LocalDate to) {
		this.title = title;
		this.description = description;
		this.from = from;
		this.to = to;
	}

	public Task(Integer id, String title, String description, LocalDate from, LocalDate to) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.from = from;
		this.to = to;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}
}