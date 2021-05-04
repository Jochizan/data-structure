/**
 * @(#)keep_tidy.java
 *
 *
 * @author 
 * @version 1.00 2021/5/4
 */

import java.util.*;

public class keep_tidy {

	static Scanner in = new Scanner(System.in);
	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<Integer>(2);
		arr.add(1);
		arr.add(107);
		Collections.sort(arr);
		
		int temporal;
		System.out.println("Ingrese un valor: ");
		temporal = in.nextInt();
			
		for (int i = 0; i < arr.size(); ++i) {
			if (arr.get(i) >= temporal){
				arr.add(i, temporal);
				break;}}									
		System.out.println(arr.toString());
	}
}