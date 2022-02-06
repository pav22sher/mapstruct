package spring.example.mapstruct.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.example.mapstruct.example3.mapper.CarMapper;
import spring.example.mapstruct.example3.target.CarDto;
import spring.example.mapstruct.example3.source.Car;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Test3 {
    @Autowired
    private CarMapper carMapper;

    @PostConstruct
    private void init() {
        System.out.println("===Test3===");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 2005));
        cars.add(new Car("Audi", 2011));
        cars.add(new Car("Lada", 2020));
        List<CarDto> carDtos = carMapper.toCarDtos(cars);
        System.out.println();
        cars.forEach(System.out::println);
        System.out.println();
        carDtos.forEach(System.out::println);
        System.out.println();
        System.out.println("===Test3===");
    }
}
