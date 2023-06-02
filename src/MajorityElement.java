import java.util.HashMap;
import java.util.Map;

// this solution i got it to get training using divide and conquer technique (DAC)

public class MajorityElement {


    // Container of occurrences of each value in array
    public static Map<Integer, Integer> elements = new HashMap<>();

    // Driver function

    public static void main(String[] args) {

        // example of given array
        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        solving(arr, 0, arr.length);

        // used for printing each value with its occurrence in given array
        elements.forEach((k, v) -> System.out.println("Key is : " + k + " Value is : " + v));
    }

    //Logical Function

    public static void solving(int[] nums, int beg, int end) {
        int median = (end - beg) / 2 + beg;

        if (median - beg > 1)
            solving(nums, beg, median);

        if (end - median > 1)
            solving(nums, median, end);

        if (end - median == 1)
            if (elements.containsKey(nums[median]) == true)
                elements.put(nums[median], elements.get(nums[median]) + 1);
            else
                elements.put(nums[median], 1);
        if (median - beg == 1)
            if (elements.containsKey(nums[beg]) == true)
                elements.put(nums[beg], elements.get(nums[beg]) + 1);
            else
                elements.put(nums[beg], 1);
    }
}
