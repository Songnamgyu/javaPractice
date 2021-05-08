package com.song.practice.thread;

public class Tank extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("Tank Gogo");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
