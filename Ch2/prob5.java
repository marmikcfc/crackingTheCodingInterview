import java.util.*;
/*
 You have two numbers represented by a linked list, where each node contains a
 single digit. The digits are stored in reverse order, such that the Ts digit is at the
 head of the list. Write a function that adds the two numbers and returns the sum
 as a linked list.
 EXAMPLE
 Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is, 617 + 295.
 Output: 2 -> 1 -> 9.That is, 912.
 FOLLOW UP
 Suppose the digits are stored in forward order. Repeat the above problem.
 EXAMPLE
 Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is, 617 + 295.
 Output: 9 -> 1 -> 2.That is, 912.
*/
 class Node {
 Node next = null;
 Integer data;

 public Node(Integer d) {
 data = d;
}

 void appendToTail(Integer d) {
 Node end = new Node(d);
 Node n = this;
 while (n.next != null) {
 n = n.next;
 }
 n.next = end;
 }


 void printList() {
 Node n = this;
 while (n != null) {
  System.out.print(n.data+"->");
  n = n.next;
 }

 }

 int linkedListToInteger(Node n,int count){
  int [] a = new int[count];
  int i =count-1;
  while (n != null) {
  a[i] = n.data;
  n = n.next;
  i--;
 }


 String s ="";
 for(i=0;i<count;i++){
  System.out.print(a[i]);
  s=s+a[i];
 }
 System.out.println();

  return Integer.parseInt(s);
 }

 int findCount(Node n){

  int count =0;
 while (n != null) {
  n = n.next;
  count++;
 }

 return count;
 }


 void findSum(Node n2) {
Node n1 = this;
int sum = linkedListToInteger(n1,findCount(n1)) + linkedListToInteger(n2,findCount(n2));
System.out.println("Sum = "+sum);

String s= Integer.toString(sum);
int count = s.length();
Node reverse = new Node(Character.getNumericValue(s.charAt(count-1)));
for(int i=s.length()-2;i>=0;i--){

  reverse.appendToTail(Character.getNumericValue(s.charAt(i)));

}

reverse.printList();

}

		
 }

 public class prob5{

 	public static void main(String args[]){

 		Node n1 = new Node(7);
    n1.appendToTail(1);
    n1.appendToTail(6);
    Node n2 = new Node(5);
    n2.appendToTail(9);
    n2.appendToTail(2);

 		
 		n1.printList();
 		System.out.println();
		n2.printList();
		System.out.println();
    n1.findSum(n2);
 	}
 }