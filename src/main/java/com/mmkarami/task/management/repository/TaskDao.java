package com.mmkarami.task.management.repository;

import java.time.LocalDate;
import java.util.List;

public interface TaskDao extends Dao<Task> {

	List<Task> findByFrom(LocalDate localDate);
}