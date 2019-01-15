
public class selectionSort {
	public selectionSort(int[] list,char[]alphaList) {
		int i,j, minValue, minIndex, temp=0;
		char temp2;
		for(i =0;i<list.length;i++) {
			minValue = list[i];
			minIndex =i;
			for(j=i;j<list.length;j++) {
				if(list[j]>minValue) {
					minValue = list[j];
					minIndex = j;
				}
			}
			if(minValue>list[i]) {
				temp=list[i];
				temp2 = alphaList[i];
				list[i]=list[minIndex];
				alphaList[i]=alphaList[minIndex];
				list[minIndex]= temp;
				alphaList[minIndex]=temp2;
			}
		}
		for(int k=0;k<alphaList.length;k++) {
			System.out.println(alphaList[k]+" :"+list[k]);
		}
	}
}
