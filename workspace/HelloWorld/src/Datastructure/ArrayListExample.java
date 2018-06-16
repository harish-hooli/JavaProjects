package Datastructure;

import java.util.ArrayList;

public class ArrayListExample {
 public static void main (String[] args){
	 ArrayList arrLst = new ArrayList();
	 
	 //Add elements to Arraylist
	 arrLst.add("1");
	 arrLst.add("2");
	 arrLst.add("3");
	 
	 arrLst.add(1,"INSERTED ELEMENT");
	 
	 System.out.println("ArrayList contains...");
	 
	 for(int i=0; i < arrLst.size(); i++)
		 System.out.println(arrLst.get(i));
 }
}
