Solution 1 :
import java.util.*;
// O(n^2) time | O(1) space
class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    for(int i = 0; i < array.length; i++){
			int firstNum = array[i];
			for(int j = i + 1; j < array.length; j++){
				int secondNum = array[j];
				int sum = firstNum + secondNum;
				if(sum == targetSum && i != j){
					return new int[] {firstNum, secondNum};
				}
			}
		}
		
    return new int[0];
  }
}

Solution 2:
import java.util.*;
// O(n log n) time | O(1) space
class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    
		Arrays.sort(array);
		
		for(int i = 0; i < array.length; i++){
			int left = 0;
			int right = array.length - 1;
			while(left < right){
				int sum = array[left] + array[right];
				if(sum == targetSum){
					return new int[] {array[left], array[right]};
				}else if(sum < targetSum){
					left++;
				}else{
					right--;
				}
			}
				
		}
    return new int[0];
  }
}


Solution 3:
import java.util.*;
// O(n) time | O(1) space
class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Set<Integer> nums = new HashSet<>();
		
		for(int num : array){
			int potentialMatch = targetSum - num;
			if(nums.contains(potentialMatch)){
				return new int[] {potentialMatch, num};
			}else{
				nums.add(num);
			}
		}
		
    return new int[0];
  }
}
