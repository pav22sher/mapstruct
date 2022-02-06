package spring.example.mapstruct.example5.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import spring.example.mapstruct.example5.source.Doctor;
import spring.example.mapstruct.example5.target.DoctorDto;

@Mapper(uses = {PatientMapper.class})
public interface DoctorMapper {
    @Mapping(source = "doctor.patientList", target = "patientDtoList")
    DoctorDto toDto(Doctor doctor);
}
