import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;

public class Bubbles {

	public static void main(String[] args) {
		int[] list = {5,8,1,6,9,2};
		list = SelectionSort(list);
		
		for(int i =0;i<list.length ;i++) {
			System.out.print(list[i]);
		}
		list = insertionSort(list);
		System.out.println("");
		for(int k = 0;k<list.length ;k++) {
			System.out.print(list[k]);
		}
		

	}
	public static int[] bubbleSort(int[] list){
		int i,j,temp=0;
		for(i=0;i<list.length -1;i++) {
			for(j=0;j<list.length-i-1;j++) {
				if(list[j]>list[j+1]) {
					temp = list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		
	}
		return list;
	}
	public static int[] insertionSort(int[] list) {
		int i,j,key,temp;
		for(i=1;i<list.length;i++) {
			key = list[i];
			j = i-1;
			while(j>=0&& key >list[j]) {
				temp = list[j];
				list[j]=list[j+1];
				list[j+1]=temp;
				j--;
			}
		}
		return list;
	}
	public ArrayList<Integer> insertionSort(ArrayList<Integer> list) {
		int i,j,key,temp;
		for(i=1;i< list.size();i++) {
			key = list.get(i);
			j=i-1;
			while(j>=0&& key<list.get(j)) {
				temp = list.get(j);
				list.set(j,  list.get(j+1));
				list.set(j +1, temp);
				j--;
			}
		}
		return list;
	}
	public void mergeSort (int[] list, int lowIndex, int highIndex) {
		if(lowIndex == highIndex) {
			return;
		}
		else {
			int midIndex = (lowIndex + highIndex)/2;
			mergeSort(list, lowIndex,midIndex);
			mergeSort(list,midIndex+1,highIndex);
			
		}
	}
	public static int[] SelectionSort(int[] list) {
		int i,j, minValue, minIndex, temp=0;
		for(i =0;i<list.length;i++) {
			minValue = list[i];
			minIndex =i;
			for(j=i;j<list.length;j++) {
				if(list[j]<minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			if(minValue<list[i]) {
				temp=list[i];
				list[i]=list[minIndex];
				list[minIndex]= temp;
			}
		}
		return(list);
	}
}
