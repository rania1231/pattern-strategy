package proxiad.rhamdi.kata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class KataApplication {

    public static void main(String[] args) {
        SpringApplication.run(KataApplication.class, args);
    }
    @Bean
    CommandLineRunner run(){
        return args -> {
            Context c =new Context();
            c.setStrategy(new StrategyImpl1());
            c.process();
            c.setStrategy(new StrategyImpl2());
            c.process();
        };
    }

}
