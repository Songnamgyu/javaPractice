package com.song.practice.io.file;

import java.io.File;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		
		/* File을 이용한 스트림 사용하기 앞서 File 클래스의 기본 사용방법 확인 */
		
		/* JDK 1.0 부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스이다.
		 * 대상 파일에 대한 정보로 인스턴스를 생성하고
		 * 파일의 생성, 삭제 등등의 처리를 수행하느 기능을 제공하고 있다.
		 * */
		
		/* 대상 파일이 존재하지않아도 인스턴스를 생성 할 수 있다. */
		File file = new File("src/com/song/practice/io/file/test.txt");
		try {
			//파일이 존재하지않음.createdNewFile()호출해보기, boolean타입이므로 한번 호출할때 파일이 없고 잘생성되면 true로 반환
			boolean createSuccess = file.createNewFile();
			
			System.out.println("createSuccess : " + createSuccess);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일의 크기 : " + file.length() + "byte");
		System.out.println("파일의 경로 : " + file.getPath());
		System.out.println("현재 파일의 상위 경로 : " +  file.getParent());
		/* 절대 경로란 최상위 루트 위치부터의 경로를 말한다.*/
		System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
		
		/* 파일 삭제 */
		boolean deleteSuccess = file.delete();
		System.out.println("deleteSuccess : " + deleteSuccess);
	}

}
