package com.hustlion.java_console_spring;


/**
 * 示例 bean
 * @author Hustlion (hustlionm@qq.com)
 *
 */
public class HelloWorld {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

}
