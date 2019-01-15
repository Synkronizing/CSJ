import java.util.ArrayList;

public class sorter {
	public sorter(char[] alphaList, int[] intList) {
	for(int p=0;p<alphaList.length - 1;p++) {
				
				for(int o=0;o<alphaList.length-1-p;o++) {
					char temp;
					int temp2=0;
				
					if(intList[o]<intList[o+1]) {
						temp = alphaList[o];
						temp2 = intList[o];
						alphaList[o]=alphaList[o+1];
						intList[o]=intList[o+1];
						alphaList[o+1]=temp;
						intList[o+1]=temp2;
						
					}
				}
			}
		for(int i=0;i<alphaList.length;i++) {
			System.out.println(alphaList[i]+" :"+intList[i]);
		}
	}
}
