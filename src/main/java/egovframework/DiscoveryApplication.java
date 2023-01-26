package egovframework;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DiscoveryApplication.class, args);

	}

}
