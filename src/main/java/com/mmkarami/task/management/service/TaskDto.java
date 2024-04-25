package com.mmkarami.task.management.service;

public class TaskDto {

	private int id;

	private String title;

	private String description;

	private String from;

	private String to;

	public TaskDto(int id, String title, String description, String from, String to) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.from = from;
		this.to = to;
	}
	
	public TaskDto() {
	}

	public TaskDto(String title, String description, String from, String to) {
		this.title = title;
		this.description = description;
		this.from = from;
		this.to = to;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
}