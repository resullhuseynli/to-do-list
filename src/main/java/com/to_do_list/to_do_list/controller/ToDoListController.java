package com.to_do_list.to_do_list.controller;

import com.to_do_list.to_do_list.dto.dtoActionsRequest;
import com.to_do_list.to_do_list.dto.dtoActionsResponse;
import com.to_do_list.to_do_list.model.Status;
import com.to_do_list.to_do_list.service.ToDoListService;
import com.to_do_list.to_do_list.service.impl.ToDoListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/tasks")
public class ToDoListController {

    @Autowired
    private ToDoListServiceImpl taskService;

    @GetMapping
    public String getTasks(Model model) {
        List<dtoActionsResponse> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "task-list";
    }

    @PostMapping
    public String addTask(@ModelAttribute dtoActionsRequest task, Model model) {
        taskService.addNewTask(task);
        model.addAttribute("tasks", taskService.getAllTasks());
        return "redirect:/tasks";
    }

    @PostMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id, Model model) {
        taskService.deleteTask(id);
        model.addAttribute("tasks", taskService.getAllTasks());
        return "redirect:/tasks";
    }

    @PostMapping("/update-status/{id}")
    public String updateTaskStatus(@ModelAttribute Status status, @PathVariable Long id, Model model) {
        taskService.updateTaskStatus(id, status);
        model.addAttribute("tasks", taskService.getAllTasks());
        return "redirect:/tasks";
    }
}
