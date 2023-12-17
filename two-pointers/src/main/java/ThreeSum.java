import java.util.Arrays;

public class ThreeSum {
	public boolean threeSum(int[] nums, int target) {
		if(nums.length < 3){
			return false;
		}
		
		Arrays.sort(nums);
		
		for(int i=nums.length-1; i > 1; i--){
			if(twoSum(target-nums[i], nums, i+1)){
				return true;
			}
		}
		return false;		
    }
	
	public boolean twoSum(int target, int[] nums, int length) {
		if (length < 3) {
			return false;
		}

		int start = 0;
		int end = length - 2;

		while (start < end) {
			int twoSum = nums[start] + nums[end];
			if (twoSum == target) {
				return true;
			} else if (twoSum > target) {
				end--;
			} else {
				start++;
			}
		}

		return false;
	}
}
