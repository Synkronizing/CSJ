import java.util.ArrayList;

public class insertionSort {

	public insertionSort(char[] alphaList, int[] intList) {
		int o,p,key,temp;
		char temp2;
		for(o=1;o<alphaList.length;o++) {
			key = intList[o];
			p = o-1;
			while(p>=0&& key >intList[p]) {
				temp = intList[p];
				intList[p]=intList[p+1];
				intList[p+1]=temp;
				temp2 = alphaList[p];
				alphaList[p] = alphaList[p+1];
				alphaList[p+1] = temp2;
				p--;
			}
		}
		for(int i=0;i<alphaList.length;i++) {
			System.out.println(alphaList[i]+" :"+intList[i]);
		}
	}
	
	public insertionSort(ArrayList<Integer> intList2, ArrayList<Character> alphaList2) {
		int i,j,key,temp;
		char temp2;
		for(i=1;i< alphaList2.size();i++) {
			key = intList2.get(i);
			j=i-1;
			while(j>=0&& key>intList2.get(j)) {
				temp = intList2.get(j);
				temp2 = alphaList2.get(j);
				intList2.set(j,  intList2.get(j+1));
				intList2.set(j +1, temp);
				alphaList2.set(j, alphaList2.get(j+1));
				alphaList2.set(j+1,  temp2);
				j--;
			}
		}
		for(int k=0;k<alphaList2.size();k++) {
			System.out.println(alphaList2.get(k)+" :"+intList2.get(k));
		}
	}
	
}
