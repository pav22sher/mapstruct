package spring.example.mapstruct.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.example.mapstruct.example1.mapper.SimpleMapper;
import spring.example.mapstruct.example1.source.SimpleSource;
import spring.example.mapstruct.example1.target.SimpleTarget;

import javax.annotation.PostConstruct;

@Component
public class Test1 {
    @Autowired
    private SimpleMapper simpleMapper;

    @PostConstruct
    private void init() {
        System.out.println("===Test1===");
        SimpleSource simpleSource = new SimpleSource();
        simpleSource.setName("SourceName");
        simpleSource.setDescription("SourceDescription");
        System.out.println(simpleSource);
        SimpleTarget simpleTarget = simpleMapper.toTarget(simpleSource);
        System.out.println(simpleTarget);
        System.out.println("===Test1===");
    }
}
