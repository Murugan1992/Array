package org.array;

import java.util.ArrayList;
import java.util.List;

public class Array {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<>();
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(90);
	
	int l1=l.get(0);
	
	System.out.println(l);
	System.out.println(l1);	
}
}
