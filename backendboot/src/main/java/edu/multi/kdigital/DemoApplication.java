package edu.multi.kdigital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import other.OtherController;
import upload.UploadController;

//부트 프로젝트 시작하는 파일
//1. 자동으로 톰캣 서버 내장된게 시작
//2. @ 어노테이션 스캔(설정필요)
//실행 - run as - spring boot app로 실행

@SpringBootApplication
@ComponentScan //(basePackageClasses = HelloController.class) /* servlet-context.xml*/
@ComponentScan(basePackageClasses = OtherController.class)
@ComponentScan(basePackageClasses = UploadController.class)
//@ComponentScan(basePackages =  {"upload"})
@ComponentScan(basePackageClasses = MemberMybatisController.class)
@MapperScan(basePackageClasses = MemberDAO.class)
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("===스프링부트 실행시작===");
		SpringApplication.run(DemoApplication.class, args); //필수 - 내장톰캣 서버 시작키워드
		System.out.println("===스프링부트 실행중===");
	}

}
