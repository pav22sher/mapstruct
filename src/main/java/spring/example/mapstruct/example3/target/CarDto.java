package spring.example.mapstruct.example3.target;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CarDto {
    private String model;
    private int year;
}
