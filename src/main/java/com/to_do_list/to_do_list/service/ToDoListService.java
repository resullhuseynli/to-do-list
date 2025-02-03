package com.to_do_list.to_do_list.service;

import com.to_do_list.to_do_list.dto.dtoActionsRequest;
import com.to_do_list.to_do_list.dto.dtoActionsResponse;
import com.to_do_list.to_do_list.model.Status;

import java.util.List;

public interface ToDoListService {

    void addNewTask(dtoActionsRequest request);

    List<dtoActionsResponse> getAllTasks();

    void deleteTask(Long id);

    void updateTaskStatus(Long id, Status status);
}
