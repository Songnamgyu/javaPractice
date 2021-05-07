package com.song.practice.io.filterStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {
		/* 외부 데이터로부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열 로만 읽어오면
		 * 여러 데이터 타입을 취급하는경우 별도로 처리를 해주어야한다.
		 * 
		 * 데이터 자료형 별로 처리하는 기능을 추가한 보조스트림을 제공하고 있다.
		 * DataInputStream/DataOutputStream
		 * */

		DataOutputStream dout = null;

		try {
			dout = new DataOutputStream(new FileOutputStream("src/com/song/practice/io/filterStream/score.txt"));

			dout.writeUTF("홍길동");
			dout.writeInt(100);
			dout.writeChar('A');

			dout.writeUTF("아이유");
			dout.writeInt(99);
			dout.writeChar('A');

			dout.writeUTF("수지");
			dout.writeInt(100);
			dout.writeChar('S');
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(dout != null) {
				try {
					dout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		DataInputStream din = null;

		try {
			din = new DataInputStream(new FileInputStream("src/com/song/practice/io/filterStream/score.txt"));


			while(true) {
				System.out.println(din.readUTF() + "," + din.readInt() + "," + din.readChar());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 읽기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(din != null) {
				try {
					din.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
