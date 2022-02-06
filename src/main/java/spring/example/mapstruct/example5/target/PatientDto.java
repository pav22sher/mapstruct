package spring.example.mapstruct.example5.target;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PatientDto {
    private int id;
    private String name;
    private String dateOfBirth;
}
