package com.song.practice.thread.demon;

import javax.swing.JOptionPane;

public class Application {

	public static void main(String[] args) {
		/* 데몬은 리눅스 , 유닉스 계열의 운영체제에서 백그라운드에서 동작하는 프로그램을 말한다.
		 * 이와 비슷하게 동작하도록 만든것을 데몬스레드라고한다.
		 * 메인 스레드가 종료되어도 스레드 실행내용을 	마저 실행한다.
		 * 데몬스레드로 생성한 스레드를 등록하면 메인스레드가 종료될 떄 데몬스레드도 종료된다.*/
		
		Thread t = new CountDown();
		
		t.setDaemon(true);
		
		t.start();
		
		//사용자 입력을 대기하게 만드는 것
		System.out.println(JOptionPane.showInputDialog("아무 문자열이나 입력해줘"));
		
		System.out.println("메인스레드 종료 ");
	}
}
