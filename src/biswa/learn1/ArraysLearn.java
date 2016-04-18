package biswa.learn1;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysLearn {
	public static void main (String[] args) throws IOException{
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.println("enter numbers of list one by one");
		for (int i = 0; i<7; i++){
			System.out.println("enter element number: " + i);
			int num = System.in.read();
			numbers.add(num);
		}
		System.out.println(numbers);
		System.out.println("enter the number you want to search");
		//int searchNum = System.in.read();
		String[] names = new String[5];
		Arrays.fill(names, "bis");
		for(String str : names){
			//System.out.println(str);
		}
	}
}
