package spring.example.mapstruct.example4.target;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class BookDTO {
    private String bookTitle;
    private Double bookPrice;
}
