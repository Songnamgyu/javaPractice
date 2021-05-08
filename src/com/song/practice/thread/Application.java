package com.song.practice.thread;

public class Application {

	public static void main(String[] args) {

		/* 프로세스와 스레드 */
		/* 프로세스(process)란 실행중인 프로그램이라고 할 수 있다.
		 * 즉 사용자가 작성한 프로그램을 운영체제에 의해 메모리와 cpu를 할당받아 실행중인것을 말한다.
		 * 
		 * 
		 * 스레드(thread)란 프로세스 내에서 실제로 작업을 수행하는 주제를 말하며
		 * 모든 프로세스는 한개 이상의 스레드가 존재한다.
		 * 두개 이상의 스레드를 가지고 있는 프로세스를 멀티 스레드라고한다.
		 * */


		/* 스레드를 생성하는 방법 
		 * 1. Thread를 상속받는 방법
		 * 2. Runnable 인터페이스를 상속받는 방법*/


		//		Car car = new Car();
		//		Tank tank = new Tank();
		//		Plane plane = new Plane();
		//		
		//		//Thread 타입의 인스턴스 생성
		//		Thread t1 = car;
		//		Thread t2 = tank;
		//		//Runnable 을 상속받으면 Thread에다가 직접 넣어주지못해서 Thread생성자를 이용한다
		//		Thread t3 = new Thread(plane);

		Thread t1 = new Car();
		Thread t2 = new Tank();
		Thread t3 = new Thread(new Plane());
		
//		//run은  하나의 스택으로 끝남
//		t1.run();
//		t2.run();
//		t3.run();
		
		/*우선순위 설정 */
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		/* 우선순위 출력 */
		System.out.println("t1의 우선순위 : " + t1.getPriority());
		System.out.println("t2의 우선순위 : " + t2.getPriority());
		System.out.println("t3의 우선순위 : " + t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
		/* 지정한 스레드가 종료될 떄 까지 메인 메소드의 종료를 대기 시킨다.*/
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main end=========================");
	}

}
