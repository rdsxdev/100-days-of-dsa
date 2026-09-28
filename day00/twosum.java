import java.util.HashMap;
class TwoSum {
    //dry run
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i]; 
            int partner = target - current;

            if (map.containsKey(partner)) {
                return new int[]{map.get(partner), i};
            }
            map.put(current, i);
        }
        return new int[]{};
}
}
