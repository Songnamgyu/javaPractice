package com.song.practice.io.filterStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application2 {

	public static void main(String[] args) {
		
		/* 형변환 보조 스트림 */
		/* 기본스트림이 byte 기반 스트팀이고 , 보조스트림이 char기반 스트림경우 사용한다.
		 * */
	
		/* 표준 스트림 
		 * 자바에서는 콘솔이나 키보드 같은 표준 입력 장치로부터 데이터를 입출력하기위한 스트림을
		 * 표준스트림 형태로 제공하고 있다. System 클래스의 in, out, err가 대상 데이터의 스트림을 의미한다.
		 * System.in (inputStream) : 콘솔로부터 데이터를 입력 받는다.
		 * System.out (PrintWriter) : 콘솔로 데이터를 출력한다.
		 * System.err (PrintWriter) : 콘솔로 데이터를 출력한다.
		 * 
		 * 즉 자주 사용되는 자원에 대해 미리 스트림을 생성해두었기 때문에 개발자가 별도로  스트림을 생성하지 않는다.
		 * */
	
		
		/* 이런 표준 스트림 중 콘솔로부터 읽어오는 기반 스트림이 InputStream인데
		 * Buffer를 이용해서 성능을 향상시키고 싶은 경우에 형변환 보조스트림을 사용할 수 있다. 
		 * */
	
		//BufferedStream은 char기반 스트림 , System.in은 byte기반 스트림 그래서 두개를 맞춰줄 inputStreamReader이 필요하다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("문자열 입력 : ");
			String value =  br.readLine();
			System.out.println("value : " + value);
			
			System.out.println("숫자 입력 ");
			int value2 = Integer.parseInt(br.readLine());
			System.out.println("value2 = " + (value2 * value2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java oracle Jdbc");			 
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e2) {
					// TODO: handle exception
				}
			}
		}
	}

	
	
	
	
}
