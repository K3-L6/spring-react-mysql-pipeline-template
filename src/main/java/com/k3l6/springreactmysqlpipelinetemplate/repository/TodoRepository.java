package com.k3l6.springreactmysqlpipelinetemplate.repository;

import com.k3l6.springreactmysqlpipelinetemplate.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
