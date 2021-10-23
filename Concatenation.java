package test5;// nikhil did

import java.util.*;

// WAP input= "   Hello   " + "world    is   great " //output = Hello world is great
public class Concatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String ");
		String firstString = sc.nextLine();
		Concatenation objConcatenation = new Concatenation();
		firstString = objConcatenation.removeExtraSpace(firstString);
		System.out.println("Enter the second String ");
		String secondString = sc.nextLine();
		secondString = objConcatenation.removeExtraSpace(secondString);
		System.out.print(firstString + " " + secondString);

	}

	public String removeExtraSpace(String ch) {

		boolean spaceStarted = false;
		boolean charStarted = false;
		String d = "";
		char[] charArray = ch.toCharArray();
		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] != ' ') {// , , , , ,n,i,k,h,i,l, , , ,i,s, , , ,a
				charStarted = true;
				if (spaceStarted == true) {
					d = d + " ";
				}
				d = d + charArray[i];
				spaceStarted = false;
			} else {
				if (charStarted) {
					spaceStarted = true;
				}
			}

		}
		return d;
	}

}
