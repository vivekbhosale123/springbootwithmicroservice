package com.vdb.service;

import com.vdb.model.Employee;
import com.vdb.repository.EmployeeRepository;
import com.vdb.vo.Department;
import com.vdb.vo.RestTemplateVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Employee save(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public RestTemplateVo findById(int empId)
    {
        RestTemplateVo restTemplateVo=new RestTemplateVo();

        Employee employee=employeeRepository.findByEmpId(empId);

        restTemplateVo.setEmployee(employee);

        Department department=restTemplate.getForObject("http://DepartmentService:9191/departments/findbyid/"+employee.getDeptId(),Department.class);

        restTemplateVo.setDepartment(department);

        return restTemplateVo;
    }


}
