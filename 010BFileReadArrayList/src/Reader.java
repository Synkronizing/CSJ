import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Reader {

	public static void main(String[] args) {
		String fileName = "/home/compsci/eclipse-workspace/txtfiles/Kennedy_Cuba_Crisis.txt";
		String line;
		ArrayList<String> aList = new ArrayList<String>();
		ArrayList<Character> allChars = new ArrayList<Character>();
		String alpha = "abcdefghijklmnopqrstuvwxyz0123456789.,:;?\"-[]'";
		char[] alphaList = new char[alpha.length()];
		int[] intList = new int[alpha.length()];
		ArrayList<Integer> intList2 = new ArrayList<Integer>();
		ArrayList<Character> alphaList2 = new ArrayList<Character>();
		int unknown=0;
		
		
	
	try {
		BufferedReader input = new BufferedReader(new FileReader(fileName));
		if(!input.ready()) {
			input.close();
			throw new IOException();
			
		}
		while((line = input.readLine()) != null) {
			aList.add(line);
		
		}
		input.close();
		
	}catch(IOException e) {
		System.out.println("Error: "+ e);
	}
	//test - did it work?
		int sz = aList.size();
		for(int i=0; i<sz;i++) {
			System.out.println(aList.get(i).toString());
		}
		
	
	String listString = String.join("", aList).toLowerCase();
	for(int a=0;a<listString.length();a++) {
		allChars.add(listString.charAt(a));
	}
	for(int b=0; b<alpha.length();b++) {
		int occur = Collections.frequency(allChars, alpha.charAt(b));
		alphaList[b] = alpha.charAt(b);
		intList[b] = occur;
		alphaList2.add(alpha.charAt(b));
		intList2.add(occur);
		
			//System.out.println(alphaList[b] + " = "+String.valueOf(intList[b]));
	}
	
	for(int c=0;c<listString.length();c++) {
		int notCount=0;
		String charlist = Character.toString(listString.charAt(c));
		for(int d=0;d<alpha.length();d++) {
			String alphaChar = Character.toString(alpha.charAt(d));
			if(!charlist.equals(alphaChar)) {
				notCount++;
			}
			
		}
		if(notCount==alpha.length()) {
			unknown++;
		}
		
	}
	
	//sorter mySorter = new sorter(alphaList, intList);
	//insertionSort insertion = new insertionSort(alphaList,intList);
	//insertionSort insertionArrayList = new insertionSort(intList2, alphaList2);
	//mergeSort merge = new mergeSort(alphaList,intList);
	quickSort quick = new quickSort(intList,alphaList);
	//selectionSort select = new selectionSort(intList,alphaList);
	/*
	for(int i=0;i<alphaList.length;i++) {
		System.out.println(alphaList[i]+" :"+intList[i]);
	}
	for(int i=0;i<alphaList.length;i++) {
		System.out.println(alphaList2.get(i)+" :"+intList2.get(i));
	}
	*/
	
	System.out.println("Unknown = "+ unknown);

}
}