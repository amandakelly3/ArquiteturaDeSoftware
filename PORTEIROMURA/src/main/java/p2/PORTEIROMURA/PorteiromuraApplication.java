package p2.PORTEIROMURA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PorteiromuraApplication {

	public static void main(String[] args) {
		SpringApplication.run(PorteiromuraApplication.class, args);
	}

}
