package com.to_do_list.to_do_list.dto;

import com.to_do_list.to_do_list.model.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class dtoActionsRequest {

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date deadline;

    private Status status;

}