package com.mmkarami.task.management.service;

import java.util.List;

public interface TaskService {

	TaskDto getTaskById(Integer id);
	
	List<TaskDto> getAllTasks();
	
	void addNewTask(TaskDto taskDto);
	
	void removeTaskById(Integer id);
	
	List<TaskDto> getTasksByFromDate();
}