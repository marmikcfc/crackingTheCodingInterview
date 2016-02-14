import java.util.*;
/*
 Implement a function to check if a linked list is a palindrome.
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
 while (n != null) {
 System.out.print(n.data+" ");
  n = n.next;
 }

 }

  boolean isPalindrome() {

 Node n = this;
 int count = 0;
 while (n != null) {
  n = n.next;
  count++;
 }
    System.out.println();
 int length = count;
 count = 1;
  n = this;
 boolean isEven;
 if(length%2 == 0)
  isEven = true;
 else
  isEven = false;
  
   Stack st = new Stack();

 while (n != null) {
 if(isEven){

  if(count <= length/2){

    st.push(n.data);

  }

  else{
    if(!n.data.equals(st.pop().toString()))
            return false;

  }

 }

 else{

   if(count <= length/2){

    st.push(n.data);

  }

  if (count >= (length/2)+2) {
     if(!n.data.equals(st.pop().toString()))
      return false;
      
  }

 }
 count++;
 n=n.next;

 }

return true;
}
}

 public class prob7{

  public static void main(String args[]){

    Node n = new Node("0");
    n.appendToTail("2",false);
    n.appendToTail("1",false);
    n.appendToTail("3",false);
    n.appendToTail("0",false);
   
    System.out.println();
    System.out.print(n.isPalindrome());
    


  }
 }