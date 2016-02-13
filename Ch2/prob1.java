import java.util.*;

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

 void removeDuplicate() {
 Node n = this;
 Node prev = null;
 HashMap <String,Integer> h = new HashMap<String,Integer>();
 while (n != null) {
// System.out.print(n.data+" ");

 	if(h.containsKey(n.data)){
 		prev.next=n.next;
 	}
 	else{
 
 		h.put(n.data,1);
 		prev = n;
 
 	}

 	n=n.next;

 }

 }


 void removeDuplicateLessSpace() {
 Node n = this;
 Node prev = null;

 while (n.next != null) {
 	 Node n1 = n.next;
 	 prev=n;
 	while(n1 != null){

 		if(n1.data.equals(n.data)){
 		prev.next=n1.next;
 	}
 	else{
 
 		prev = n1;
 
 	}

 	n1=n1.next;

 	}
 	
 	n=n.next;
  }

 }



 }

 public class prob1{

 	public static void main(String args[]){

 		Node n = new Node("F");
 		n.appendToTail("F");

 		n.appendToTail("O");
 		n.appendToTail("L");
 		n.appendToTail("L");
 		n.appendToTail("O");
 		n.appendToTail("W");
 		n.appendToTail(" ");
 		n.appendToTail("L");
 		n.appendToTail("U");
 		n.appendToTail("P");
 		n.appendToTail("P");

 		
 		n.printList();
 		n.removeDuplicate();
 		System.out.println();
		n.printList();
 		
 		System.out.println();
		System.out.println("##############################################");
		
 		Node n2 = new Node("F");
 		n2.appendToTail("F");
 		n2.appendToTail("O");
 		n2.appendToTail("L");
 		n2.appendToTail("L");
 		n2.appendToTail("O");
 		n2.appendToTail("W");
 		n2.appendToTail(" ");
 		n2.appendToTail("L");
 		n2.appendToTail("U");
 		n2.appendToTail("P");
 		n.appendToTail("P");
 		
 		n2.printList();
 		n2.removeDuplicateLessSpace();
 		System.out.println();
		n2.printList();


 	}
 }