package com.song.practice.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		/* 입출력 스트림 개요 */
		/* 우리는 프로그래밍을 할 때 많은 종류의 데이터를 다루어야 한다.
		 * 하지만 데이터는 프로그램 내부에도 있을 수 있지만, 프로그램 외부의 데이터를 가져와서 사용해야 할 수 도있다.
		 * 또한 프로그램에서 생성한 데이터를 외부로 출력 할 수 도 있다.
		 * 
		 * 외부 데이터란 프로그램 외부에 존재하는 모든 데이터를 의미한다.
		 * 외부데이터는 하드디스크상 파일이 될 수 도있고, 네트워크 상에 존재하는 자원이 될 수 도 있다.
		 * 
		 * 외부 데이터를 대상으로 작업을 할 떄 가장 먼저 해야할일은 자바프로그램과 데이터를 연결하는 것이다.
		 * 프로그램과 외부데이터가 연결되는 길을 Stream(스트림) 이라고 한다.
		 * 스트림은 단방향이기 때문에 데이터를 읽어오기위한 길을 입력 스트림,
		 * 데이터를 출력하기 위한 길은 출력 스트림이라고 부른다.
		 * 
		 * 입출력과 관련된 API는 java.io패키지에서 제공한다.
		 * API문서에서 목록을 확인하면 대부분 InputStream/OutputStream, Reader/Writer로 끝난다.
		 * 이러한 클래스 모두 외부데이터를 읽어오는  기능을 가진 스트림이다.
		 * 
		 * 그 중 InputStream과 Reader는 데이터를 읽어오는 입력스트림이고
		 * OutputStream, Writer는 데이터를 내보내는 출력스트림이다.
		 * 
		 * 또한 InputStream과 OutputStream은 데이터를 1바이트단위로 입출력하고
		 * Reader와 Writer 계열은 글자(2바이트 혹은 3바이트) 단위로 작업을 한다.
		 * 
		 * 자바 프로그램과 연결되는 외부 데이터타입이 무엇인지 클래스의 이름을 보고 유추가 가능하다.
		 * inputStream/OutputStream/Reader/Writer 를 뺴고 남은 단어가 외부데이터 타입이다.
		 * 
		 * 예) FileInputStream은 InputStream을 제거하고 남은 단어가 File이므로 외부데이터가 File인걸 알 수 있다. 
		 * 
		 * */

		// File InputStream
		FileInputStream fin = null;

		// FileInputStream은 대상파일의 정보가 있어야지 인스턴스를 생성할 수 있고 빈생성자로는 인스턴스를 생성하지 못한다.

		try {
			fin = new FileInputStream("src/com/song/practice/io/stream/testInputStream.txt");

			int value;
			// 대입된 value값이 -1이 될때까지 -1은 데이터를 끝날때 음수-1을 반환한다.(flag신호)
			/* read() : 파일에 기록된 다음 바이트를 순차적으로 읽어온다. 더 이상 읽을 데이터가 없는경우 -1로 반환*/
			//			while((value = fin.read()) != -1) {
			//				System.out.println("value : " + (char)value );
			//			}

			/* length는 long타입이므로 int로 형변환*/
			int fileSize = (int) new File("src/com/song/practice/io/stream/testInputStream.txt").length();
			byte[] bar = new byte[fileSize];

			fin.read(bar);

			for(int i = 0; i < bar.length; i++) {
				System.out.println("bar[ " + i + " ] :" + bar[i]);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 못찾았으요");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fin != null) {
				try{
					/*자원 반납을 해야하는 이유*/
					/* 1. 장기간 실행중인 스트림을 닫지않으면 다양한 리소스에 누수(leak)가 발생한다.
					 * 2. 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 있느 데이터를 강제로 전송해야한다.
					 *    만약 잔류데아터가 남은상황에서 추가로 스트림을 사용한다면 데드락(deadlock)상태가 된다.
					 *    판단하기 어렵고 의도하지 않은 상황에서도 이런 현상이 발생 할 수 있기 때문에 
					 *    마지막에 flush()를 무조건 실행해주는 것이 좋다.
					 *    close() 메소드는 	자원을 반납하여 flush() 해주기 때문에 close()만 제대로 해주더라도 
					 *    이러한 현상이 발생할 가능성이 낮춰준다.
					 *    따라서 close() 메소드는 외부 자원을 사용하는 경우 마지막에 반드시 호출해주어야한다.
					 *    */
					
					fin.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
