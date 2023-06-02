import java.util.ArrayList;
import java.util.List;

public class MaximumSubArrayWithIndexes {

    public static void main(String[] args) {
        int [] nums = {9};

        int [] result = solving(nums);
        System.out.println("Sum is : " + result[0] + " ,Start index is : " + result[1]
                + " ,End index is : " + result[2]);

    }
    public static int[] solving (int[] nums){
        int[] sum={0,0,0};
        List<Integer> arr = new ArrayList<>();
        int max = 0;
        for (int i =0;i< nums.length;i++){

            sum[0]+=nums[i];

            if (sum[0]<0) {
                arr.add(i+1);
                sum[0] = 0;
            }

            max = Math.max(sum[0],max);
            if (max == sum[0]) {
                sum[2] = i;
            }

        }
        if (arr.size() !=0){
            for (int i = 0;i<arr.size();i++){
                if (arr.get(i)<sum[2])
                    sum[1]=arr.get(i);
            }
        }
        sum[0]=max;
        return sum;
    }

}
