package spring.example.mapstruct.example5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.example.mapstruct.example5.mapper.DoctorMapper;
import spring.example.mapstruct.example5.source.Doctor;
import spring.example.mapstruct.example5.source.Patient;
import spring.example.mapstruct.example5.target.DoctorDto;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class Test5 {
    @Autowired
    private DoctorMapper doctorMapper;

    @PostConstruct
    private void init() {
        System.out.println("===Test5===");
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient(1, "Pablo", LocalDate.of(1997, 7, 7)));
        patients.add(new Patient(1, "Vlad", LocalDate.of(1996, 6, 6)));
        Doctor doctor = new Doctor(1, "Ai", patients);
        System.out.println(doctor);
        DoctorDto doctorDto = doctorMapper.toDto(doctor);
        System.out.println(doctorDto);
        System.out.println("===Test5===");
    }
}
