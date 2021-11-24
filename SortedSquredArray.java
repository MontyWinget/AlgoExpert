import java.util.*;
// O(n) time | O(n) space
class Program {

  public int[] sortedSquaredArray(int[] array) {
    int[] squared = new int[array.length];
		
		int shorterValueIdx = 0;
		int largerValueIdx = array.length-1;
		
		for(int i = array.length-1; i >= 0; i--){
			int shorterValue = array[shorterValueIdx];
			int largerValue = array[largerValueIdx];
			
			if(Math.abs(shorterValue) > Math.abs(largerValue)){
				squared[i] = shorterValue*shorterValue;
				shorterValueIdx += 1;
			}else{
				squared[i] = largerValue*largerValue;
				largerValueIdx -= 1;
			}
		}
		
    return squared;
  } 
}
