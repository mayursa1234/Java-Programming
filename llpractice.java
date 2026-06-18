
public class llpractice {

   public static class node{
        int data;
        node next;

        public node(int data){
            this.data=data;
            this.next=null;
        }
    }

        public static node head;
        public static node tail;
        public static int size;

        public void addFirst(int data){
            node newNode=new node(data);
            size++;
            if (head==null) {
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public void addLast(int data){
            node newNode=new node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public void print(){
            node temp=head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
            System.out.println("null");
        }


        public void add(int idx,int data){
            node newNode= new node(data);
            size++;
            node temp=head;
            int i=0;
            while(i< idx-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }

        public int removeFirst(){
            int val=head.data;
            head=head.next;
            return val;
        }

        public int itrSearch(int key){
            node temp=head;
            int i=0;

            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                 temp=temp.next;
                 i++;
            }
            return -1;  
        }


        public static void main(String args[]){
            llpractice ll=new llpractice();

            ll.print();
            ll.addFirst(3);
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(5);
            ll.addLast(6);
            ll.print();
            ll.add(3,4);
            ll.print();

            // System.out.println(ll.size);

            // ll.removeFirst();

            // ll.print();
            System.out.println(ll.itrSearch(4));
            System.out.println(ll.itrSearch(9));
        }
}
