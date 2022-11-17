package p2.TODEOLHO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TodeolhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodeolhoApplication.class, args);
	}

}
