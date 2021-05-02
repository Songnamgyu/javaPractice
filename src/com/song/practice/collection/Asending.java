package com.song.practice.collection;

import java.util.Comparator;

public class Asending implements Comparator<BookVO> {

	@Override
	public int compare(BookVO o1, BookVO o2) {
		int result = 0;

		if(o1.getPrice() > o2.getPrice()) {

			result = 1;
		}else if(o1.getPrice() < o2.getPrice()) {
			result = -1;
		}else {
			result = 0;
		}
		return result;
	}


}


