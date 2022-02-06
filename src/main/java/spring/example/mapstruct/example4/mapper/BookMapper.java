package spring.example.mapstruct.example4.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import spring.example.mapstruct.example4.source.Book;
import spring.example.mapstruct.example4.target.BookDTO;

@Mapper
public interface BookMapper {
    @Mappings({
            @Mapping(source = "title", target = "bookTitle"),
            @Mapping(source = "price", target = "bookPrice")
    })
    BookDTO toDto(Book entity);

    @InheritInverseConfiguration
    Book toEntity(BookDTO dto);
}
