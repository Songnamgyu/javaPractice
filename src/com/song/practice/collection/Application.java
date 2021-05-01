package com.song.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("오늘의 날씨");
		list.add(123);
		list.add("a");
		list.add(new Date());
		
		System.out.println("list : " + list);
		
		list.add(1, "이상해");
		System.out.println("수정 후 list : " + list);
		
		list.remove(1);
		System.out.println(list);
		
		System.out.println("list size  : " + list.size());
		
       for(int i = 0; i < list.size(); i ++) {
    	   System.out.println("list [" + i + "] : " + list.get(i) );
       }
       
       
       List<String> sList = new ArrayList<>();
       sList.add("java");
       sList.add("python");
       sList.add("JS");
       sList.add("JQuery");
       sList.add("C++");
       sList.add("mysql");
       sList.add("Oracle");
       
       Collections.sort(sList);
       System.out.println(sList);
       
       sList = new LinkedList<>(sList);
       Iterator<String> deSlist = ((LinkedList<String>)sList).descendingIterator();
       List<String> ab = new ArrayList<>();
       while(deSlist.hasNext()) {
    	   ab.add(deSlist.next());
       }
       System.out.println(ab);

	}
}
