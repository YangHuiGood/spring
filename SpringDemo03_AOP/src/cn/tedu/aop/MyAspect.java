package cn.tedu.aop;

import org.springframework.stereotype.Component;

@Component
public class MyAspect {
	public void before(){
		System.out.println("before...");
	}
}
