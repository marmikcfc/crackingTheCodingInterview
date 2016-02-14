import java.util.*;
/*
 Given a circular linked list, implement an algorithm which returns the node at
the beginning of the loop.
DEFINITION
Circular linked list: A (corrupt) linked list in which a node's next pointer points
to an earlier node, so as to make a loop in the linked list.
EXAMPLE
Input: A ->B->C->D->E- > C [the same C as earlier]
Output: C

*/
 class Node {
 Node next = null;
 String data;

 public Node(String d) {
 data = d;
}

 void appendToTail(String d,boolean circ) {
 Node end = new Node(d);
 Node n = this;
 Node circNode=null;
 int count = 0;
 while (n.next != null) {
 if(count == 5){
  circNode = n;
  System.out.println("Circle at"+circNode.data);
  count++;
 }

 n = n.next;
 count++;
 }
 n.next = end;
 if(circ == true){

  end.next=circNode;
 }
 }


 void printList() {
 Node n = this;
 while (n != null) {
 System.out.print(n.data+" ");
  n = n.next;
 }

 }

  void findCircNode() {
 Node n = this;

//We start slow pointer from 2nd node

 n=n.next;
 int count =0;
 Node n1=this;
 //we start fast pointer from third node 
 n1=n1.next;
 n1=n1.next;
 while (n != null) {
  
  if(n.data.equals(n1.data)){
    n=n.next;
    count++;
    if(count == 1){

      System.out.println("currently N1 at"+n1.data);
      System.out.println("Currently N at"+n.data);
    }
    if(count == 2){

      System.out.println("Cycle at"+n1.data);
      break;
    }
  }
  else{

  n = n.next;
  n1 = n1.next;
  n1=n1.next;

  }

 }

 }

}

 public class prob6{

  public static void main(String args[]){

    Node n = new Node("A");
    n.appendToTail("B",false);
    n.appendToTail("C",false);
    n.appendToTail("D",false);
    n.appendToTail("E",false);
    n.appendToTail("F",false);
    n.appendToTail("G",false);
    n.appendToTail("H",true);    
   
    System.out.println();
    n.findCircNode();
    


  }
 }