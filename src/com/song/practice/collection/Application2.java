package com.song.practice.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class Application2 {

	public static void main(String[] args) {
		
		List<BookVO> bookList = new ArrayList<>();
		
		bookList.add(new BookVO("어푸", "아이유", 20));
		bookList.add(new BookVO("롤링", "쁘걸", 30));
		bookList.add(new BookVO("기브러브", "악뮤", 15));
		
		for(BookVO book : bookList) {
			System.out.println("book : " + book);
		}
		
		/* bookList.sort(new Asending()); */
		bookList.sort(new Comparator<BookVO>() {

			@Override
			public int compare(BookVO o1, BookVO o2) {
				// TODO Auto-generated method stub
				return o1.getPrice() > o1.getPrice() ? 1 : -1;
			}
		});
		
		System.out.println("=========오름차순=========");
		for(BookVO books : bookList) {
			System.out.println(books);
		}
		
		
		bookList.sort(new Comparator<BookVO>() {

			@Override
			public int compare(BookVO o1, BookVO o2) {
				// TODO Auto-generated method stub
				return o1.getTitle().compareTo(o2.getTitle());
				
			}
			
		});
		for(BookVO bookss : bookList) {
			System.out.println("제목 오름차순 : " + bookss);
	}

	}
}
