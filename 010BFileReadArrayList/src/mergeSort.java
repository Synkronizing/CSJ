
public class mergeSort {
	private int[] array;
    private char[] alphaArray;
    private int[] tempMergArr;
    private char[] tempMergArr2;
    private int length;
	public mergeSort(char[] alphaList, int[] intList) {
		int[] inputArr = intList;
        char[] inputal = alphaList;

        sort(inputArr,inputal);
        for(int i=0;i<inputal.length;i++){
            System.out.println(inputal[i]+"  : " +inputArr[i]);

        }
    }

     
    public void sort(int inputArr[],char inputal[]) {
        this.array = inputArr;
        this.alphaArray = inputal;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        this.tempMergArr2 = new char[length];
        doMergeSort(0, length - 1);
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
            tempMergArr2[i]= alphaArray[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] >= tempMergArr[j]) {
            	alphaArray[k]=tempMergArr2[i];
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                alphaArray[k]=tempMergArr2[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            alphaArray[k]=tempMergArr2[i];
            k++;
            i++;
        }
 
    }
}
