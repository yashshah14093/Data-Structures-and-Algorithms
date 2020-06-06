public class MyLinkedList<E>{
    
    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;
    
    public MyLinkedList(){
        size = 0 ;
        head = new ListNode<E>(null);
        tail = new ListNode<E>(null);
        head.next = tail;
        tail.prev = head;
    }
    
    public int getSize(){
        return(this.size);
    }
    
    public void addBack(E x){
        ListNode node = new ListNode<E>(x);
        node.prev = this.tail.prev;
        this.tail.prev = node;
        node.next = tail;
        node.prev.next = node;
        this.size += 1;
    }
    
    public void addFront(E x){
        ListNode node = new ListNode<E>(x);
        node.next = this.head.next;
        this.head.next = node;
        node.prev = node.next.prev;
        node.next.prev = node;
        this.size += 1;
    }
    
    public void delete(E x){
        ListNode nd = head.next;
        while(nd.val!=x && nd.next!=null){
            nd = nd.next;
        }
        if(nd.val == x){
            nd.next.prev = nd.prev;
            nd.prev.next = nd.next;
        }
    }
     
    public void traverse(){
        ListNode nd = this.head.next;
        while(nd.next!=null){
            System.out.println(nd.val);
            nd = nd.next;
        }
    }
}



class ListNode<E>{
    
    ListNode<E> next;
    ListNode<E> prev;
    E val;
    
    public ListNode( E value){
        this.val = value;
    }
    
}



// class GFG{
    
//     public static void main(String[] args){
        
//         MyLinkedList list = new MyLinkedList<Integer>();
//         list.addFront(3);
//         list.addBack(4);
//         list.addFront(9);
//         list.addBack(11);
//         list.delete(4);
//         list.traverse();
//     }
        
// }
