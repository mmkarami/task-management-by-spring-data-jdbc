package com.mmkarami.task.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mmkarami.task.management.service.TaskDto;
import com.mmkarami.task.management.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;

	@RequestMapping(path = "/task", method = RequestMethod.GET)
	public void addNewTask(@RequestParam String title, @RequestParam String description, @RequestParam String from,
			@RequestParam String to) {
		System.out.println(from);
		System.out.println(to);
		taskService.addNewTask(new TaskDto(title, description, from, to));
	}

	@RequestMapping(path = "/tasks", method = RequestMethod.GET)
	public List<TaskDto> getAllTasks() {
		return taskService.getAllTasks();
	}

	@RequestMapping(path = "/task/{id}", method = RequestMethod.DELETE)
	public void removeTaskById(@PathVariable Integer id) {
		taskService.removeTaskById(id);
	}

}