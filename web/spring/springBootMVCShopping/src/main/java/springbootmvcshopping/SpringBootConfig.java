package springbootmvcshopping;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component // config 파일
public class SpringBootConfig {
	
	// security에 의한 로그인 화면을 사용하지 않게 설정
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) 
			throws Exception {
		httpSecurity.formLogin().disable().csrf().disable();
		return httpSecurity.build();
	}
	
	// 암호화하기 위한 객체생성
	//PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}