package spring.example.mapstruct.example2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.example.mapstruct.example2.mapper.EmployeeMapper;
import spring.example.mapstruct.example2.target.EmployeeDTO;
import spring.example.mapstruct.example2.source.Employee;

import javax.annotation.PostConstruct;

@Component
public class Test2 {
    @Autowired
    private EmployeeMapper employeeMapper;

    @PostConstruct
    private void init() {
        System.out.println("===Test2===");
        Employee entity = new Employee();
        entity.setId(1);
        entity.setName("Pablo");
        System.out.println(entity);
        EmployeeDTO dto = employeeMapper.toDTO(entity);
        System.out.println(dto);
        System.out.println("===Test2===");
    }
}
