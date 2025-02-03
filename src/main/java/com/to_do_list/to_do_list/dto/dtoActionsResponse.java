package com.to_do_list.to_do_list.dto;

import com.to_do_list.to_do_list.model.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class dtoActionsResponse {

    private Long id;

    private String description;

    private Date deadline;

    private Status status;

}
