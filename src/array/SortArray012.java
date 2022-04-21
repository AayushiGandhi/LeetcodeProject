package array;

import java.util.Arrays;

public class SortArray012 {

    public static int[] sortArray(int[] arr){
        int c0=0;
        int c1=0;
        int end = arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
        }

        int temp=0;
        for(int i=0;i<end;i++){
            if(i==c0){
                temp=1;
            }
            if(i==c0+c1){
                temp=2;
            }
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        long startTime = System.nanoTime();

        sortArray(new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});
        //System.out.println(Arrays.toString(sortArray(new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1})));

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
