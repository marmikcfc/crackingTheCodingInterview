import java.util.*;
/*
 Implement an algorithm to delete a node in the middle of a singly linked list, given
only access to that node
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



 void deleteNth(Node n1) {
 Node n = this;
 int found =0;;


 while (n.next != null) {
 	
 	if(n.data.equals(n1.data)){
  
  n = n1;
  found = 1;
      if( n == null ){
      n = null;

    }
    else{
      Node temp= n.next;
      n.data=temp.data;
      n.next=temp.next;
     }
  break;
 	}
 	n=n.next;

  }

  if(found == 0){
  	  System.out.println("Node not present in linkedlist");
  }


 }

		
 }

 public class prob3{

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

    Node n1 = new Node("L");
		n.deleteNth(n1);

    n.printList();

 	}
 }