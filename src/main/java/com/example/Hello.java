package com.example;

public class Hello {
	private HelloProperties helloProperties;

	public Hello(HelloProperties helloProperties) {
		super();
		this.helloProperties = helloProperties;
	}
	
	public String sayHi() {
		return helloProperties.getMsg();
	}
}
