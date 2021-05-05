package com.song.practice.io.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {

			/* FileReader */
			/* FileInputStream과 방법이 거의 동일하다.
			 * 단, byte단위가 아니라 character 단위로 읽어들이는 부분이 차이점이다.
			 * 따라서 1바이트 ,2바이트, 3바이트 여부와 상관없이 글자 단위로 읽어들이기 떄문에
			 * 한글을 정상적으로 읽어 들일 수 있다.
			 * */
	
	
			FileReader fr = null;
			try {
				fr = new FileReader("src/com/song/practice/io/stream/testReader.txt");
				
				int value;
				while((value = fr.read()) != -1) {
					
					System.out.print((char)value);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
