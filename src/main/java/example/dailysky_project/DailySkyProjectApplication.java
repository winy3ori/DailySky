package example.dailysky_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DailySkyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailySkyProjectApplication.class, args);
    }

}
