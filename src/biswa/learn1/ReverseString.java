package biswa.learn1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String reverseStr = reverseString(str);
		System.out.println(str);
		System.out.println(reverseStr);
	}
	
	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		char[] charArray = str.toCharArray();
		int l = charArray.length;
		for (int i=0 ; i< l/2 ; i++){
			System.out.println(i);
			char temp = charArray[i];
			charArray[i] = charArray[l-i-1];
			charArray[l-i-1] = temp;
		}
		String reverseStr = String.copyValueOf(charArray);
		return reverseStr;
	}

	
}
