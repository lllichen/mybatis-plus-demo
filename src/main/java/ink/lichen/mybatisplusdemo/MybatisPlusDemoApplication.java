package ink.lichen.mybatisplusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan("ink.lichen.mybatisplusdemo.mapper")
public class MybatisPlusDemoApplication {

    @Autowired
    Test test;

    public static void main(String[] args) {


        SpringApplication.run(MybatisPlusDemoApplication.class, args);
    }
}

@Component
class Test{

    String name ;

    public Test() {
        this.name = "test";
        System.out.println(name);
    }
}

