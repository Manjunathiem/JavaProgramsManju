package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Arraylisteexample {

	public void test(){
		
		LinkedList<String> a = new LinkedList<String>();
		a.add("ddd");
		a.add("Manju");
		a.add("test");
		a.add("google");
		System.out.println("List before sorting" + a);
		Iterator it = a.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylisteexample obj = new Arraylisteexample();
		obj.test();
	}

}
