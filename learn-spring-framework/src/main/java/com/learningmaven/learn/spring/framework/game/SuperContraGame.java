package com.learningmaven.learn.spring.framework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("SuperContra up");
	}

	@Override
	public void down() {
		System.out.println("SuperContra down");
	}

	@Override
	public void left() {
		System.out.println("SuperContra left");
	}

	@Override
	public void right() {
		System.out.println("SuperContra right");
	}
}