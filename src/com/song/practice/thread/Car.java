package com.song.practice.thread;

public class Car extends Thread{
	
	@Override
	//run 자체가 또 다른 흐름을 가지고 있는 메인 메소드라고 생각하면 된다.
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("car Driving");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
