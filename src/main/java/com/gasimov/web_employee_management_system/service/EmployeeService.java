package com.gasimov.web_employee_management_system.service;

import com.gasimov.web_employee_management_system.model.Employee;
import com.gasimov.web_employee_management_system.repository.EmployeeRepository;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
