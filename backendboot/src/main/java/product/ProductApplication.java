package product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan(basePackageClasses = ProductController.class)
public class ProductApplication {

	public static void main(String[] args) {
		System.out.println("===스프링부트 실행시작===");
		SpringApplication.run(ProductApplication.class, args); //필수 - 내장톰캣 서버 시작키워드
		System.out.println("===스프링부트 실행중===");
	}

}
