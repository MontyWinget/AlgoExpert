import java.util.*;

// O(n) time | O(1) space
class Program {
  public static void removeKthNodeFromEnd(LinkedList head, int k) {
    int counter = 1;
		LinkedList first = head;
		LinkedList second = head;
		while(counter <= k){
			second = second.next;
			counter += 1;
		}
		if(second == null){
			head.value = head.next.value;
			head.next = head.next.next;
			return;
		}
		while(second.next != null){
			second = second.next;
			first = first.next;
		}
		first.next = first.next.next;	
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}
