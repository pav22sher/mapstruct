package spring.example.mapstruct.example2.target;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDTO {
    private int employeeId;
    private String employeeName;
}
