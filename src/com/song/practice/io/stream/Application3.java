package com.song.practice.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {

		/*FileOutputStream
		 * 프로그램 데이터를 파일로 내보내기 위한 용도의 스트림이다
		 * 1바이트 단위로 데이터를 처리한다*/

		FileOutputStream fout = null;

		try {
			/* OutputStream의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다.*/
			fout = new FileOutputStream("src/com/song/practice/io/stream/testOutputStream.txt");

			/*write()을 이용한 내보내기*/
			fout.write(97);

			/*byte배열로 내보내기*/
			byte[] bar = new byte[] {98, 99, 100, 101, 102, 10};
			fout.write(bar);

			/*bar배열에서 1번인덱스부터 3의길이만큼 내보내기*/
			fout.write(bar, 1, 3 );	

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) {
				try {
					fout.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
