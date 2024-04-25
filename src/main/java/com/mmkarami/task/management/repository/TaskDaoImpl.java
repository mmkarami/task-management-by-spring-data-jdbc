package com.mmkarami.task.management.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDaoImpl implements TaskDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Task findById(Integer id) {

		return jdbcTemplate.queryForObject("SELECT * FROM TASK WHERE ID = ?",
				(rs, rowNum) -> new Task(rs.getInt("id"), rs.getString("title"), rs.getString("description"),
						rs.getTimestamp("from_date").toLocalDateTime().toLocalDate(),
						rs.getTimestamp("to_date").toLocalDateTime().toLocalDate()),
				id);
	}

	@Override
	public List<Task> findAll() {
		return jdbcTemplate.query("SELECT * FROM TASK",
				(rs, rowNum) -> new Task(rs.getInt("id"), rs.getString("title"), rs.getString("description"),
						rs.getTimestamp("from_date").toLocalDateTime().toLocalDate(),
						rs.getTimestamp("to_date").toLocalDateTime().toLocalDate()));
	}

	@Override
	public void save(Task task) {
		jdbcTemplate.update("INSERT INTO TASK (TITLE, DESCRIPTION, FROM_DATE, TO_DATE) VALUES (?, ?, ?, ?)", task.getTitle(),
				task.getDescription(), task.getFrom(), task.getTo());
	}

	@Override
	public void deleteById(Integer id) {
		jdbcTemplate.update("DELETE FROM TASK WHERE ID = ?", id);
	}

	@Override
	public List<Task> findByFrom(LocalDate localDate) {
		return jdbcTemplate.query("SELECT * FROM TASK WHERE FROM  = ?",
				(rs, rowNum) -> new Task(rs.getInt("id"), rs.getString("title"), rs.getString("description"),
						rs.getTimestamp("from_date").toLocalDateTime().toLocalDate(),
						rs.getTimestamp("to_date").toLocalDateTime().toLocalDate()),
				localDate);
	}

}