package springbootmvcshopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import springbootmvcshopping.command.LoginCommand;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // DB없으면 안찾음 있으면 찾음
@SpringBootApplication
@Controller
public class SpringBootMvcShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcShoppingApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index(LoginCommand loginCommand) {
		return "thymeleaf/index";
	}

}
