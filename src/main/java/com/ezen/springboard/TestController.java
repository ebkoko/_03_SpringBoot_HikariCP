package com.ezen.springboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController // @Controller + @ResponseBody => 리턴값이 뷰로 가지않는다.
@RequestMapping("/user")
public class TestController {
	@GetMapping("/join")
	public ModelAndView getBoardList() { // ModelAndView가 뷰로 찾아가게 함
		// 화면으로 가져갈 데이터는 Model, 화면이름은 View에 설정되어 해당 화면을 찾아감
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/join");
		
		return mv;
	}
}
