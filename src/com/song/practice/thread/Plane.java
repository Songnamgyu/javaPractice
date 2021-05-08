package com.song.practice.thread;

public class Plane implements Runnable {

	//단일 상속만 지원하기 때문에 Thread 클래스를 상속받지 못하는 경우  Runnable 인터페이스를 구현한다.
	@Override
	public void run() {
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("Airplane Flow");
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
