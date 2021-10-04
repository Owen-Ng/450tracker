
public class DuplicatesTortoiseHare {
	public static int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];
		
		// The reason why we using do loop instead of while loop is
		// the fact that slow and fast start at the same position 
		// which will prevent the execution of the while loop be executed once
		// because we are checking if fast and slow is not equal.
		// using do loop so that it is executed at least one
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];

		} while (nums[slow] != nums[fast]);

		fast = nums[0];

		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;

	}// Time : O(n)
		// Space: O(1)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
