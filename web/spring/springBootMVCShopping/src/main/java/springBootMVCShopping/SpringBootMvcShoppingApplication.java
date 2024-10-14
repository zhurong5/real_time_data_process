package springBootMVCShopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // DB있으면 찾고 없음 안찾음
public class SpringBootMvcShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcShoppingApplication.class, args);
	}

}
