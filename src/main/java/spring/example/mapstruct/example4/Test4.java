package spring.example.mapstruct.example4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.example.mapstruct.example4.mapper.BookMapper;
import spring.example.mapstruct.example4.source.Book;
import spring.example.mapstruct.example4.target.BookDTO;

import javax.annotation.PostConstruct;

@Component
public class Test4 {
    @Autowired
    private BookMapper bookMapper;

    @PostConstruct
    private void init() {
        System.out.println("===Test4===");
        Book entity = new Book("Идиот", 300.0);
        BookDTO dto1 = bookMapper.toDto(entity);
        System.out.println(dto1);
        Book entity1 = bookMapper.toEntity(dto1);
        System.out.println(entity1);
        System.out.println("===Test4===");
    }
}
