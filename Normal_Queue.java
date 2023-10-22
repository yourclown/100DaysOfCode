import java.io.*;
import java.util.*;

public class Main {

  public static class CustomQueue {
    int[] data;
    int front;
    int size;

    public CustomQueue(int cap) {
      data = new int[cap];
      front = 0;
      size = 0;
    }

    int size() {
    return size;
    }

    void display() {
    for (int i=0;i<size;i++){ //we will print the number of element in Queue.
        int idx=(front+i)%data.length; //since we don't want to disturb the value of front for display. so we will keep on increasing it through modulus. 
        System.out.print(data[idx]+" ");
    }
    
    System.out.println();
    }

    void add(int val) {
    if(size==data.length){
        System.out.println("Queue overflow");
    }
    else{
        int s=(front+size)%data.length; //s=> next available index.
        data[s]=val; //we push the elemtn in the next available element.
        size++;
    }
    }

    int remove() {
    if(size==0){
        System.out.println("Queue underflow"); //if there are no elements in the queue.
        return -1;
        }
    else{
        int val=data[front];//whenever we want to remove, we remove from the front.
        data[front]=0;//we nulify the index of the removed value and store 0 in it.
        front=(front+1)%data.length;
        size--; //since we have removed an element, so size will be reduced.
        
        return val; //
    }
    }

    int peek() {
           if(size==0){
        System.out.print("Queue underflow"); //if there are no elements in the queue.
        return -1;
        }
        else{
            return data[front]; //the peek element is the one which would be the first one to be removed, hence it is data[front].
        }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    CustomQueue qu = new CustomQueue(n);

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("add")){
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if(str.startsWith("remove")){
        int val = qu.remove();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("peek")){
        int val = qu.peek();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(qu.size());
      } else if(str.startsWith("display")){
        qu.display();
      }
      str = br.readLine();
    }
  }
}
