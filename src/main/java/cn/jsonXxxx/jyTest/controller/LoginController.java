package cn.jsonXxxx.jyTest.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jsonXxxx.jyTest.util.Verification;

@RequestMapping("/login")
@Controller
public class LoginController {

	@RequestMapping("/test")
	@ResponseBody
	public void LoginTest(HttpServletRequest request, HttpServletResponse response) {
		// 返回的状态
		int verification = Verification.verification(request, response);
		if (verification != Verification.SUCCESS) {
			return;
		}
	}
}
