import java.util.*;
/*
 Write code to partition a linked list around a value x, such that all nodes less than
 x come before all nodes greater than or equal to x
*/
 class Node {
 Node next = null;
 int data;

 public Node(int d) {
 data = d;
}

 void appendToTail(int d) {
 Node end = new Node(d);
 Node n = this;

 if(n == null){
  n = end;
 }
 else{
   while (n.next != null) {
   n = n.next;
 }
 n.next = end;
 }

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



 public void partition(int x){
 
 Node firstHead = null;
 Node secondHead = null;
 Node n = this;
 Node firstHeadNode=null;
  Node secondHeadNode=null;

 if(n == null)
  System.out.println("print Nothing");

 while(n != null){
 Node next = n.next;
 
 if(n.data < x){
 if(firstHead == null){

    firstHead = n;
    firstHeadNode=firstHead;
  }
  else{
    firstHead.next = n;
    firstHead = n;    
  } 

}
 else{
  if(secondHead == null){
    secondHead = n;
    secondHeadNode=secondHead;
  }
  else{
    secondHead.next = n;
   secondHead = n;    
  }

 }

 
 n = next;
 }
while(firstHeadNode !=null){
  System.out.println(firstHeadNode.data+" ");
  firstHeadNode = firstHeadNode.next;
 }

  System.out.println(" ");

while(secondHeadNode !=null){
  System.out.println(secondHeadNode.data+" ");
  secondHeadNode = secondHeadNode.next;
 }

  System.out.println(" ");



 /*
 while(n != null){
 Node next = n.next;
 
 if(n.data < x){
 n.next = firstHead;
 firstHead = n;
 }
 else{
 n.next = secondHead;
 secondHead = n;
 }
 
 n = next;
 }
 
 if(firstHead == null)
 return secondHead;
 else{
 n = firstHead;
 while(n.next != null){
 n = n.next;
 }
 
 n.next = secondHead;
 
 return firstHead;
 }*/
 }


		
 }

 public class prob4{

 	public static void main(String args[]){
    Node n2=new Node(6);
 		Node n = new Node(2);
 		n.appendToTail(1);
 		n.appendToTail(3);
 		n.appendToTail(4);
    n.appendToTail(8);
    n.appendToTail(5);
    n.appendToTail(9);
 		n.appendToTail(n2.data);
 		n.appendToTail(7);



 		
 		n.printList();
 		System.out.println();
   n.partition(n2.data);
   n.printList();


 	}
 }