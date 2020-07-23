package eureka.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
@EnableEurekaClient
@SpringBootApplication
public class DemoEurekaTollrateBillboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaTollrateBillboardApplication.class, args);
	}
}
