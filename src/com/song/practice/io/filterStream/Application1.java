package com.song.practice.io.filterStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {
		
		/* java.io 패키지의 입출력 스트림 클래스들은  기본 스트림과 필터 스트림으로 분류 할 수 이싿.
		 * 기본 스트림은 외부데이터에 직접 연결되는 스트림이고
		 * 필터 스트림은 외부데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용할수 있는 스트림이다.
		 * 주로 성능 향상을 목적으로 사용 되며 생성자를 보면 구분이 가능하다
		 * 생성자쪽에서 매개변수로 다른 스트림을 이용하는 클래스를 필터스트림이라고 볼 수 있다.
		 * */
		
		/* 버퍼를 이용해서 성능을 향상시키는 보조스트림 */
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("src/com/song/practice/io/filterStream/testBuffered.txt"));
			
			bw.write("안녕하세요\n");
			bw.write("반갑습니다.\n");
			
//			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO: handle exception
				}
			}
		}
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("src/com/song/practice/io/filterStream/testBuffered.txt"));
			
			//readLine = 줄단위로 읽어서 반환타입을 문자열로 반환해준다
			String temp;
			while((temp = br.readLine()) != null ){
				System.out.println(temp);
			}
			
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
