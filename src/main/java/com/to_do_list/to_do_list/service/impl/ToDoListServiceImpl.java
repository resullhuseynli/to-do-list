package com.to_do_list.to_do_list.service.impl;

import com.to_do_list.to_do_list.dto.dtoActionsRequest;
import com.to_do_list.to_do_list.dto.dtoActionsResponse;
import com.to_do_list.to_do_list.model.Status;
import com.to_do_list.to_do_list.model.Tasks;
import com.to_do_list.to_do_list.repository.ToDoListRepository;
import com.to_do_list.to_do_list.service.ToDoListService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoListServiceImpl implements ToDoListService {

    @Autowired
    private ToDoListRepository toDoListRepository;

    @Override
    public void addNewTask(dtoActionsRequest request) {

        Tasks tasks = new Tasks();
        dtoActionsResponse dtoActionsResponse = new dtoActionsResponse();
        BeanUtils.copyProperties(request, tasks);
        tasks.setStatus(request.getStatus());
        toDoListRepository.save(tasks) ;
        BeanUtils.copyProperties(tasks, dtoActionsResponse);

    }


    @Override
    public List<dtoActionsResponse> getAllTasks() {

        List<Tasks> alltasks = toDoListRepository.findAll();
        List<dtoActionsResponse> dtoActionsResponseList = new ArrayList<>();
        for (Tasks task : alltasks) {
            dtoActionsResponse dtoActionsResponse = new dtoActionsResponse();
            BeanUtils.copyProperties(task, dtoActionsResponse);
            dtoActionsResponseList.add(dtoActionsResponse);

        }

        return dtoActionsResponseList;
    }

    @Override
    public void deleteTask(Long id) {
        toDoListRepository.deleteById(id);
    }

    @Override
    public void updateTaskStatus(Long id, Status status) {
        Tasks task = toDoListRepository.findById(id).orElseThrow();
        task.setStatus(status);
        toDoListRepository.save(task);
    }
}
