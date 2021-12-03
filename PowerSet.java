import java.util.*;

// O(n*2^n) time | O(n*2^n) space
class Program {
  public static List<List<Integer>> powerset(List<Integer> array) {
   	List<List<Integer>> subsets = new ArrayList<List<Integer>>();
		subsets.add(new ArrayList<Integer>());
		for(Integer ele : array){
			int length = subsets.size();
			for(int i = 0; i < length; i++){
				List<Integer> currentSet = new ArrayList<Integer>(subsets.get(i));
				currentSet.add(ele);
				subsets.add(currentSet);
			}
		}
		
    return subsets;
  }
}
