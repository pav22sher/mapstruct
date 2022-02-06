package spring.example.mapstruct.example3.mapper;

import org.mapstruct.Mapper;
import spring.example.mapstruct.example3.target.CarDto;
import spring.example.mapstruct.example3.source.Car;

import java.util.List;

@Mapper
public interface CarMapper {
    List<CarDto> toCarDtos(List<Car> cars);
    CarDto toCarDto(Car car);
}
