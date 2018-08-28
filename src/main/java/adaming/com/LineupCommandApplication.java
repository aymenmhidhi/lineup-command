package adaming.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class LineupCommandApplication {

	public static void main(String[] args) {
		SpringApplication.run(LineupCommandApplication.class, args);
	}
}
