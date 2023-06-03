import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int [] arr1 = {99,3,66,5,0,1,5,7,4};

        sorting(arr1,0, arr1.length);

        Arrays.stream(arr1).forEach(x -> System.out.print(x + " "));

    }

    public static void sorting(int[] merge,int start ,int end){

        int median = (end-start)/2 + start;

        if (median-start >1)
            sorting(merge,start,median);
        if (end-median>1)
            sorting(merge,median,end);

        merging(merge,start,median,end);

    }

    public static void merging(int[] arr,int start,int median,int end) {
        int [] temp = temporary(arr,start,end);

        int index1 = start, index2 = median, i = start;

        while (index1 != median && index2 != end) {
            if (temp[index1] < temp[index2])
                arr[i++] = temp[index1++];
            else
                arr[i++] = temp[index2++];
        }

        while (index1 < median){
            arr[i] = temp[index1++];
            i++;}

        while (index2 < end){
            arr[i] = temp[index2++];
            i++;}

    }

    public static int[] temporary(int [] arr,int start,int end){
        int[] temp = new int[arr.length];
        for (int i =start;i<end;i++){
            temp[i] = arr[i];
        }
        return temp;
    }
}
