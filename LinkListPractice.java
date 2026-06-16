class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkListPractice{
    public static void main(String[] args){
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(40);
        Node d = new Node(50);
        
        a.next = b;
        b.next  = c;
        c.next =  d;
        Node head = a;
        System.out.print(" before insertionatbeg : ");
        print(head);
        head = insertAtBeg(head);
        System.out.println(" after insertion: ");
        print(head);
        insteratend(head);
        System.out.println(" after insertionatend: ");
        print(head);
        

    }
    static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }

    }
    public static Node insertAtBeg(Node head){
        Node e = new Node(60);
        if(head == null){
            head = e;
            e.next = null;
        }
        e.next = head;
        head = e;
        return e;
    }
    public static Node insteratend(Node head){
        Node e = new Node(70); 
        if(head == null){
            head = e;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = e;
        return e;
    }

}
