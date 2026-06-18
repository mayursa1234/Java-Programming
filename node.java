import java.util.*;

// public class node {
//     int data;
//     node next;
//     public node(int data){
//         this.data=data;
//         this.next=null;
//     }

//     public static node head;
//     public static node tail;
//     public static int size;

//     public void addFirst(int data){
//         node newNode=new node(data);
//         size++;
//         newNode.next=head;
//         head=newNode;
//     }

//     public void addLast(int data){
//         node newNode=new node(data);
//         size++;
//         tail.next=newNode;
//         tail=newNode;
//     }

//     public void print(){
//         node temp=head;
//         while(temp != null){
//             System.out.println(temp.data + "->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }


//     public void add(int idx,int data){
//         node newNode=new node(data);
//         node temp=head;
//         int i=0;
//         while(i< idx-1){
//             temp=temp.next;
//             i++;
//         }
//         newNode.next=temp.next;
//         temp.next=newNode;
//     }

//     public int removeFirst(){
//         int val=head.data;
//         head=head.next;
//         return val;
//     }


//     public static void main(String[] args) {
//         linklist ll = new linklist();
//         ll.addFirst(3);
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.print();
//         ll.addLast(6);
//         ll.add(3, 9);
//         ll.print();
//         // System.out.println(ll.size);
//         ll.removeFirst();
//         ll.print();
//     }
// }



public class node {

    public static void main(String[] args) {
        linklist ll= new linklist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.add(1, 3);
        ll.print();
    }
}