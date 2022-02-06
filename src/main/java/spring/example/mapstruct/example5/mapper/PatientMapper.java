package spring.example.mapstruct.example5.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import spring.example.mapstruct.example5.source.Patient;
import spring.example.mapstruct.example5.target.PatientDto;

@Mapper
public interface PatientMapper {
    @Mapping(source = "dateOfBirth", target = "dateOfBirth", dateFormat = "dd/MM/yyyy")
    PatientDto toDto(Patient patient);
}
