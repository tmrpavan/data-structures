public class RemoveNthNodeFromTheEnd {
    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {
		if(head == null){
			return head;
		}

		LinkedListNode temp = head;
		
		while(0<n){
			temp = temp.next;
            n--;
		}

		if(temp == null){
			return head.next;
		}

		LinkedListNode tempTwo = head;
		
		
		while(temp.next != null){
			temp=temp.next;
			tempTwo=tempTwo.next;
		}
		
		tempTwo.next = tempTwo.next.next;
		
		return head;
    }
}

class LinkedListNode {
    public int data;
    public LinkedListNode next;
    // Constructor will be used to make a LinkedListNode type object
    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
