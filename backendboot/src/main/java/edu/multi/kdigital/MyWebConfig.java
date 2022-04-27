package edu.multi.kdigital;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//현재파일 웹설정포함파일 servlet-context.xml
@Configuration
public class MyWebConfig implements WebMvcConfigurer {
	
	//<resources mapping="/resources/**" location="/resources/" />
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//현재부트 프로젝트 외부 파일 브라우저 url 접근 설정 localhost:8081/upload/images/***.jpg
		registry.
		addResourceHandler("/upload/**").
		addResourceLocations("file:///c:/upload/");
		// -- 스프링부트 기본내장 업로드 용량 제한은 1mb
	}
	
	
}
