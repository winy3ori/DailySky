package example.dailysky_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling   // 스케줄링 기능 활성화
public class DailySkyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailySkyProjectApplication.class, args);
    }

}
