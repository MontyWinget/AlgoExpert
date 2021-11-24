import java.util.*;
// O(n) time | O(1) space
class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		
		int arrIdx = 0;
		int subIdx = 0;
		
		while(arrIdx < array.size() && subIdx < sequence.size()){
			if(array.get(arrIdx) == sequence.get(subIdx)){
				subIdx += 1;
			}
			arrIdx += 1;
		}
		
    return subIdx == sequence.size();
  }
}
