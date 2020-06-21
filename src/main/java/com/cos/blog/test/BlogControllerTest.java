package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

  //스프링이 com.cos.blog 패기지 이하를 스캔 함 단
  //특정 어노테이션이 붙어있는 클래스  파일을 new 해서(Ioc)스프링컨테이너에서 관리합니다.
@RestController
public class BlogControllerTest {
	
	@GetMapping("/test/hello")
	public String Hello() {
		System.out.println("console log나는 누구?");
		return "<H1>Hello Spring boot나는 누구인가</H1>";
	}
	@GetMapping("/data/ClaimHistory")
	private String ClaimHistory() {
		System.out.println("Private 함수는 외부로 매핑이 가능한가?");
		return "{\r\n" + 
				"   \"Accept-Language\": \"en-US,en;q=0.8\",\r\n" + 
				"   \"Host\": \"headers.jsontest.com\",\r\n" + 
				"   \"Accept-Charset\": \"ISO-8859-1,utf-8;q=0.7,*;q=0.3\",\r\n" + 
				"   \"Accept\": \"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\"\r\n" + 
				"}";
	}
	
	
}
