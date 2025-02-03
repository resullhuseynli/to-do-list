package com.to_do_list.to_do_list.repository;

import com.to_do_list.to_do_list.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoListRepository extends JpaRepository<Tasks, Long>{
}
