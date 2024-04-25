package com.mmkarami.task.management.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmkarami.task.management.repository.Task;
import com.mmkarami.task.management.repository.TaskDao;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDao taskDao;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public TaskDto getTaskById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TaskDto> getAllTasks() {UUID
		List<Task> tasks = taskDao.findAll();
		return tasks.stream().map(task -> modelMapper.map(task, TaskDto.class)).collect(Collectors.toList());
	}

	@Override
	public void addNewTask(TaskDto taskDto) {
		Task task = modelMapper.map(taskDto, Task.class);
		System.out.println(taskDto.getFrom());
		System.out.println(task.getFrom());
		taskDao.save(task);
	}

	@Override
	public void removeTaskById(Integer id) {
		taskDao.deleteById(id);
	}

	@Override
	public List<TaskDto> getTasksByFromDate() {
		// TODO Auto-generated method stub
		return null;
	}
}