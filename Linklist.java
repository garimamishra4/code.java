public class Linklist{

    static void printAllNodes(LNode head){
        while(head!= null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args){
        LNode obj1 = new LNode(10);
        LNode obj2 = new LNode(20);
        LNode obj3 = new LNode(30);
        LNode obj4 = new LNode(40);
        LNode obj5 = new LNode(50);

        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj5;

        printAllNodes(obj1);
        
    }
}
class LNode {
    int val;
    LNode next;
    LNode(int val){
        this.val = val;
        this.next = null;
    }
}