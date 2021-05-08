package com.song.practice.thread.demon;

public class CountDown extends Thread{
	
	@Override
	public void run() {
		for(int i = 0 ; i < 50; i++) {
			try {
				Thread.sleep(500);
				System.out.println("i : " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
