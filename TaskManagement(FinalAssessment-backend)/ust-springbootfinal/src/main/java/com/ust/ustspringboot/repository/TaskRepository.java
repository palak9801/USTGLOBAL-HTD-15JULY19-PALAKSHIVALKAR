package com.ust.ustspringboot.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ust.ustspringboot.dto.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
	
	
	@Transactional
	@Modifying
	@Query("update Task t set t.task_end_date=:task_end_date where t.task_id=:task_id")
	public void update(@Param("task_id")int task_id, @Param("task_end_date")Date task_end_date);

}
