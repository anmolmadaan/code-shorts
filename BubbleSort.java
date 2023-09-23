public class BubbleSort {
    public static void main(String[] args) {
        int[] ints = {2,8,5,6,3,1,45,23,12};
        bubbleSort(ints);
        for (int i : ints) {
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] intArray){
        for(int i=0;i<intArray.length-1;i++){
            boolean isSwap = false;
            for(int j=0;j<intArray.length-1-i;j++){
                if(intArray[j]>intArray[j+1]){
                    int temp = intArray[j];
                    intArray[j]=intArray[j+1];
                    intArray[j+1]=temp;
                    isSwap = true;
                }
            }
            if(!isSwap)
                break;
        }
    }
}
