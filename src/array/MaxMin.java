package array;

import java.util.Arrays;

public class MaxMin {

    public static int[] minmax(int[] arr){
        int[] res=null;

        if(arr.length>0){
            res = new int[2];
            int min=0;
            int max=0;
            if(arr.length==1){
                min=arr[0];
                max=arr[0];
                res[0] = min;
                res[1] = max;
            }
            else{
                if(arr[0]>arr[1]){
                    max=arr[0];
                    min=arr[1];
                }
                else if(arr[1]>arr[0]){
                    max=arr[1];
                    min=arr[0];
                }
                else if(arr[0] == arr[1]){
                    max=arr[0];
                    min=arr[1];
                }

                for(int i=2;i<arr.length;i++){
                    if(arr[i]>max){
                        max=arr[i];
                    }
                    else if(arr[i]<min){
                        min=arr[i];
                    }
                }

                res[0]=min;
                res[1]=max;
            }
        }
        return res;
    }

    public static void main(String[] args){
        long startTime = System.nanoTime();
        //int arr[] = {99,4646,1,94,64,94,794,-3000};
        minmax(new int[]{99, 4646, 1, 94, 64, 94, 794, -3000});
        //System.out.println(Arrays.toString(minmax(arr)));
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
