package spring.example.mapstruct.example5.source;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
}
