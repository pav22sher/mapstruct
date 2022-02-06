package spring.example.mapstruct.example5.target;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {
    private int id;
    private String name;
    private List<PatientDto> patientDtoList;
}
