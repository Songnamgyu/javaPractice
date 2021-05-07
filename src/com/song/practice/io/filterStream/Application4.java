package com.song.practice.io.filterStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.song.practice.io.filterStream.vo.MemberVO;

public class Application4 {

	public static void main(String[] args) {
		
		/* 객체 단위로 입출력을 하기로 위한 ObjectInputStream/ ObjectOutputStream을 살펴보자 */

		MemberVO[] outputMembers = {
				new MemberVO("user01", "pass01", "홍길동", "hong777@hong.com", 25, "남", 2506.5),
				new MemberVO("user02", "pass02", "아이유", "iu@edam.com", 29, "여" ,10000),
				new MemberVO("user03", "pass03", "이유나", "yuna@braveGirs.com", 29, "여" , 9999)
		};
		
		ObjectOutputStream objOut = null;
		
		try {
			objOut = new ObjectOutputStream(new FileOutputStream("src/com/song/practice/io/filterStream/testObject.txt"));
			
			for(int i = 0; i < outputMembers.length; i++) {
				 objOut.writeObject(outputMembers[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(objOut != null) {
				try {
					objOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		MemberVO[] inputMembers = new MemberVO[3];
		ObjectInputStream objIn = null;
		
		try {
			objIn = new ObjectInputStream(new FileInputStream("src/com/song/practice/io/filterStream/testObject.txt"));
			
			for(int i = 0; i < inputMembers.length; i++) {
			System.out.println(inputMembers[i] = (MemberVO) objIn.readObject()); 
			}
			
			for(MemberVO m : inputMembers) {
				System.out.println(m);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (objIn != null) {
				try {
					objIn.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
