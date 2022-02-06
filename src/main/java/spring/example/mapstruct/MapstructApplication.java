package spring.example.mapstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.example.mapstruct.example1.mapper.SimpleMapper;
import spring.example.mapstruct.example1.source.SimpleSource;
import spring.example.mapstruct.example1.target.SimpleTarget;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MapstructApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapstructApplication.class, args);
    }


}
