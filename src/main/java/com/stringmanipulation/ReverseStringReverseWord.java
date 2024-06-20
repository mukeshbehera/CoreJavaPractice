package com.stringmanipulation;

public class ReverseStringReverseWord {

	public static void main(String[] args) {

		String str = "My Name is Khan And I am Not a Terrorist";


		//reverse string (tsirorreT a toN ma I dnA nahK si emaN yM)
		String[] reverseString = str.split("");
		for (int i = reverseString.length - 1; i >= 0; i--) {
			System.out.print(reverseString[i]);
		}

//		System.out.println();
//		for(int i=str.length()-1; i>=0; i--){
//			System.out.print(str.charAt(i));
//		}

		System.out.println("");


		//reverse word (Terrorist a Not am I And Khan is Name My)
		String[] reverseWord = str.split(" ");
		for (int i = reverseWord.length - 1; i >= 0; i--) {
			System.out.print(reverseWord[i]+" ");
		}
		System.out.println();


		// reverse only letters of the words
		// (yM emaN si nahK dnA I ma toN a tsirorreT)
		String[] wordArr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String s : wordArr){
			String[] charArr = s.split("");
			for(int i = charArr.length-1; i>=0; i--){
				sb.append(charArr[i]);
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}
}
