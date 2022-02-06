package spring.example.mapstruct.example1.mapper;

import org.mapstruct.Mapper;
import spring.example.mapstruct.example1.source.SimpleSource;
import spring.example.mapstruct.example1.target.SimpleTarget;

@Mapper
public interface SimpleMapper {
    SimpleTarget toTarget(SimpleSource source);
    SimpleSource toSource(SimpleTarget target);
}
