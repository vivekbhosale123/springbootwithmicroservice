package com.vdb.vo;

import com.vdb.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestTemplateVo {

    private Employee employee;

    private Department department;

}
