import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node(); //create new node
      temp.data = val; //store val in the the data of the new node
      temp.next = null; //store null in the the next of the new node(as it will be the last node).

      if (size == 0) { //when we have no pre-existing nodes.
        head = tail = temp;
      } else { //when we have one(or more) pre-existing nodes.
        tail.next = temp; //first store the address of the new node in the previous tails' next.
        tail = temp;//now make the new node as the tail
      }

      size++;
    }

    public int size(){
      return size;
    }

    public void display(){
      Node temp=head; //start a temporary variable named temp and traverse it over the whole LL and print the temp.data for every node.
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }

      System.out.println();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList list = new LinkedList();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("addLast")){
        int val = Integer.parseInt(str.split(" ")[1]);
        list.addLast(val);
      } else if(str.startsWith("size")){
        System.out.println(list.size());
      } else if(str.startsWith("display")){
        list.display();
      }
      str = br.readLine();
    }
  }
}
