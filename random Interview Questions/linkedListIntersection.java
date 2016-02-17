import java.util.*;
/*
Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
*/
 class Node {
 Node next = null;
 String data;

 public Node(String d) {
 data = d;
}

 void appendToTail(Node end) {

// Node end = new Node(d);
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

 int getLen() {
 Node n = this;
 int count =0;
 while (n != null) {
  n = n.next;
  count++;
 }

 return count;

 }


 void getIntersectingNode(Node n2) {
 Node n1 = this;
 int len1=n1.getLen();
 int len2=n2.getLen();
 int offSet=Math.abs(len2 - len1);
 System.out.println("offSet "+offSet);
 if(len1 > len2){
 while (n1 != null && offSet>0) {
   n1 = n1.next;
  offSet--;
 }
 }

 else{
 while (n2 != null && offSet>0) {
   n2 = n2.next;
  offSet--;
 }
 }


 if(len1 > len2){
 while (!n1.equals(n2)) {
   n1 = n1.next;
   n2 = n2.next;
 }
 }

System.out.println("Common Node" +  n2.data);


 }



 }

 public class linkedListIntersection{

 	public static void main(String args[]){

 		Node n = new Node("A");
 		Node n1 = new Node("B");
 		Node n2 = new Node("C");
 		Node n3 = new Node("D");
 		Node n4 = new Node("E");
 		Node n5 = new Node("F");
 		n.appendToTail(n1);

 		n.appendToTail(n2);
 		n.appendToTail(n3);
 		n.appendToTail(n4);
 		n.appendToTail(n5);

 		Node n6 =new Node("L");
 		Node n7 = new Node("M");
 		Node n8 = new Node("N");
 		n5.appendToTail(n6);
 		n5.appendToTail(n7);
 		n5.appendToTail(n8);
 		System.out.println();

 		Node n11 =new Node("X");
 		Node n12 = new Node("Y");
 		Node n13 = new Node("Z");
 		Node n14 = new Node("P");
 		Node n15 = new Node("Q");
 		Node n16 = new Node("R");
 		n11.appendToTail(n12);
		n11.appendToTail(n13);
		n11.appendToTail(n5);
		n11.appendToTail(n14);
		n11.appendToTail(n15);
		n11.appendToTail(n16);

 		System.out.println("#######################################");
 		n.printList();

 		System.out.println();

 		System.out.println("#######################################");
		n11.printList();

		n.getIntersectingNode(n11);


 		
 		

 	}
 }