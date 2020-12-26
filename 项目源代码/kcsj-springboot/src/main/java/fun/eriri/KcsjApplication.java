package fun.eriri;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fun.eriri.dao")
public class KcsjApplication {
    public static void main(String[] args) {
        SpringApplication.run(KcsjApplication.class);
    }
}
