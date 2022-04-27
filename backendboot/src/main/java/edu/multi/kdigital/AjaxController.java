package edu.multi.kdigital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController//  - ajax  전용컨트롤링용 붙일시 @ResponseBody 붙었던거 삭제
@Controller
public class AjaxController {
	
	@RequestMapping("/helloajax")
	//@ResponseBody
	public MemberDTO test() {		
		return new MemberDTO("ID", "PASSWORD"); //json 자동변환(스프링부트 내장되어 있음)
	}
}
