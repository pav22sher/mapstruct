package spring.example.mapstruct.example2.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import spring.example.mapstruct.example2.target.EmployeeDTO;
import spring.example.mapstruct.example2.source.Employee;

@Mapper
public interface EmployeeMapper {
    @Mappings({
            @Mapping(target="id", source="dto.employeeId"),
            @Mapping(target="name", source="dto.employeeName")
    })
    Employee toEntity(EmployeeDTO dto);
    @Mappings({
            @Mapping(target="employeeId", source="entity.id"),
            @Mapping(target="employeeName", source="entity.name")
    })
    EmployeeDTO toDTO(Employee entity);
}
