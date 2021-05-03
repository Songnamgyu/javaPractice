package com.song.practice.abstractPractice;

public class Genius extends human {
	
	// 추상클래스의 일반메소드를 호출하기위해서 기본생성자를 호출
	// 추상클래스는 인스턴스를 생성하지못함 그래서 일반 클래스에 human을 상속받은후  기본생성자를 만들어 그 안에 부모클래스인 추상클래스의 일반 메소드를 호출
	public Genius() {
		super.choice();
	}
	// 추상클래스를 상속했으므로 추상메소드 오버라이딩
	@Override
	public void think() {
		// TODO Auto-generated method stub
		System.out.println("나는야 천재");
		
	}

}
