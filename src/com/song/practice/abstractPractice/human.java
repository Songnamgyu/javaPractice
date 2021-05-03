package com.song.practice.abstractPractice;

// 추상클래스 
public abstract class human {
	//추상 메소드 : 추상메소드는 몸통부분이 없다
	public abstract void think();
	
	//일반 메소드 
	public void choice() {
		System.out.println("항상 선택은 굿초이스");
	}

}
