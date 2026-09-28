import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (seen.contains(nums[i])) {
                return true;
            }

            seen.add(nums[i]);
        }

        return false;
    }
    
    //dry run
    public static void main(String[] args) {
    
        int[] test1 = {1,2,3,1};
        int[] test2 = {1,2,3,4,5};
        int[] test3 = {1,1};
        int[] test4 = {};
        int[] test5 = {7};

        System.out.println(containsDuplicate(test1));
        System.out.println(containsDuplicate(test2));
        System.out.println(containsDuplicate(test3));
        System.out.println(containsDuplicate(test4));
        System.out.println(containsDuplicate(test5));

    }
}