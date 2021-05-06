package com.song.practice.io.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

	public static void main(String[] args) {
		
		/*FileWriter
		 * 프로그램의 데이터를 파일로 내보내기 위한 스트림이다.
		 * 1글자 단위로 데이터를 처리한다.
		 * */
		FileWriter fw = null;
		
		try {
			/* 두번 째 인자로 true를 전달하면 이어쓰기가 된다.
			 * false는 이어쓰기가 아닌 덮어쓰기이며, 기본값은 false이다.*/
			fw = new FileWriter("src/com/song/practice/io/stream/testWriter.txt", true);
			
			fw.write(97);
			
			/*버퍼에 잔류되어있기때문에  flush를 해줘야 내보내기가 된다 그래야지만 txt에 내보낸 글자가 보여짐
			 * flush말고 close로해도 가능해진다.*/
			
			
			/*문자 기반 스트림은 char 자료형으로 내보내기도 가능하다*/
			fw.write('A');
			/*혹은 char 배열도 가능하다*/
			fw.write(new char[] {'a','p','p','l','e'});
			/*문자열도 가능*/
			fw.write("복습하고 있습니다");
			
			//			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO: handle exception
				}
			}
		}
	}
}
