package Queue;

/**
 *
 * @author quantumDrop
 */
public class Node<D>{
    private D data;
    private Node next;
    
    public Node(D data){
        this.data = data;
    }
    
    public Node(D data, Node next){
        this.data = data;
        this.next = next;
    }
    
    public D getData(){
        return this.data;
    }
    public void setData(D data){
        this.data = data;
    }
    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){
        this.next = next;
    }
}
