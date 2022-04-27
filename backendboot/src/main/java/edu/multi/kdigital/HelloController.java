package edu.multi.kdigital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//http://localhost:8081/helloboot - boot는 기본적으로 컨텍스트가 없음
@Controller
public class HelloController {
	@RequestMapping("/helloboot")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", "헬로우 부트 프로젝트");
		mv.setViewName("hello");
		return mv;
	}
}



