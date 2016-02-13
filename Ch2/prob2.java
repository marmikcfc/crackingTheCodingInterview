import java.util.*;
/*
 Implement an algorithm to find the kth to last element of a singly linked list.
*/
 class Node {
 Node next = null;
 String data;

 public Node(String d) {
 data = d;
}

 void appendToTail(String d) {
 Node end = new Node(d);
 Node n = this;
 while (n.next != null) {
 n = n.next;
 }
 n.next = end;
 }


 void printList() {
 Node n = this;
 int count =0;
 while (n != null) {
 System.out.print(n.data+" ");
  n = n.next;
  count++;
 }

 }



 void findkth(int k) {
 Node n = this;
 int count=0;
 Node ans = n;
  int found = 0; 


 while (n != null) {
 	
 	if(count >= k){

 		ans = ans.next;
 		found =1;
 	}
 	n=n.next;
 	count++;

  }

  if(found == 1 || count == k){
	  System.out.println(k+"th last node= "+ans.data);  	
  }
  else{
  	  System.out.println("Linked List aint big enough"+ "length of linked list"+count);
  }


 }

		
 }

 public class prob2{

 	public static void main(String args[]){

 		Node n = new Node("F");
 		n.appendToTail("O");
 		n.appendToTail("L");
 		n.appendToTail("L");
 		n.appendToTail("O");
 		n.appendToTail("W");
 		n.appendToTail(" ");

 		n.appendToTail("U");
 		n.appendToTail("P");



 		
 		n.printList();
 		System.out.println();
		n.findkth(13);
		n.findkth(9);

 	}
 }