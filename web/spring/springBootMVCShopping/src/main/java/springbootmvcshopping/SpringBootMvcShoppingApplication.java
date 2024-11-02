package springbootmvcshopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springbootmvcshopping.command.LoginCommand;
import springbootmvcshopping.service.goods.MainGoodsListService;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // DB없으면 안찾음 있으면 찾음
@SpringBootApplication
@Controller
public class SpringBootMvcShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcShoppingApplication.class, args);
	}
	@Autowired
	MainGoodsListService mainGoodsListService;
	@GetMapping("/")
	public String index(LoginCommand logincommand
			//,@RequestParam(value="page", required = false , defaultValue = "1") Integer page
			//,Model model
			) {
		//mainGoodsListService.execute(page, model);
		return "thymeleaf/index";
	}
	@PostMapping("/")
	public ModelAndView index(int page, Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("jsonView");
		mainGoodsListService.execute(page, model);
		return mav;
	}

}
