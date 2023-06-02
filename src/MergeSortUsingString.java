public class MergeSortUsingString {

    public static void main(String[] args) {

        String arr1 = "21365426521236220103";

        String res = sorting(arr1);

        System.out.println(res);

    }

    public static String sorting(String merge){

        int median = merge.length()/2;
        String left = merge.substring(0,median);
        String right = merge.substring(median);

        if (left.length()>1)
            left = sorting(left);
        if (right.length()>1)
            right = sorting(right);

        return merging(left,right);

    }

    public static String merging(String arr1,String arr2) {

        String res = "";
        int index1=0,index2=0,i=0;

        while (index1 < arr1.length() && index2 < arr2.length()){

            if (arr1.charAt(index1) < arr2.charAt(index2)){
                res +=arr1.charAt(index1++);
                i++;}
            else{
                res +=arr2.charAt(index2++);
                i++;}

        }
        if (index1< arr1.length()) {
            while (index1 < arr1.length()){
                res +=arr1.charAt(index1++);
                i++;}
        }
        else if (index2< arr2.length()) {
            while (index2 < arr2.length()){
                res +=arr2.charAt(index2++);
                i++;}
        }
        return res;
    }

}
