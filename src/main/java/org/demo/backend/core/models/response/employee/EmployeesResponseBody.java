package org.demo.backend.core.models.response.employee;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmployeesResponseBody {
    public String status;
    public List<Employee> data;

    @Getter
    @Setter
    public class Employee {
        public String id;
        public String employee_name;
        public String employee_salary;
        public String employee_age;
        public String profile_image;
    }
}
