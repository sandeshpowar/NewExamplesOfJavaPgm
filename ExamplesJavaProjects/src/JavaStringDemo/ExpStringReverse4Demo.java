package JavaStringDemo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ExpStringReverse4Demo {
public static void main(String[] args) {
	
/*	
	1. Convert the input string into the character array by using toCharArray() built in method.
	reverse a string in java with example
	2. Then add the characters of the array into the LinkedList object . We used LinkedList because it maintains the insertion order of the input values.
	3. Java also has  built  in reverse() method for the Collections class . Since Collections class reverse() method takes a  list object , to reverse the list , we will pass the LinkedList object which is a type of list of characters.
	4. We will create the ListIterator object by using the listIterator() method on the LinkedList object.
	ListIterator object is used to iterate over the list.
	5. ListIterator object will help us to iterate over the reversed list and print it one by one to the output screen.*/
	//using collection 
	
	
	String str="Welcome";
	
	char[] arr=str.toCharArray();
	List<Character> l=new LinkedList<>();
	for (Character c1 : arr) {
		l.add(c1);
	}
	Collections.reverse(l);
	ListIterator<Character> i=l.listIterator();
	while (i.hasNext()) {
		System.out.print(i.next());
		
	}
	
	
	
}
}
