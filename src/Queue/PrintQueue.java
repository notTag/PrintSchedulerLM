package Queue;

import document.Document;

/**
 *
 * @author quantumDrop
 */
public class PrintQueue {
    Node<Document> head;
    
    /*
     * Print Queue Constructor
     */
    public PrintQueue(){
        this.head = null;
    }
    
    public void push(Document job){
        Node<Document> currentNode = this.head;
        Node<Document> nodeToAdd = new Node(job);
        nodeToAdd.setNext(null);
        
        if(currentNode == null){ this.head = nodeToAdd; }
        
        while(currentNode != null){
            if(currentNode.getNext() == null){
                currentNode.setNext(nodeToAdd);
                break;
            }
            currentNode = currentNode.getNext();
        }
    }
    
    public Node<Document> pop(){
        Node<Document> nodeToReturn = this.head;
        if(this.head != null && this.head.getNext() != null){
            this.head = this.head.getNext();
        } else if(this.head.getNext() == null){
            this.head = null;
        }
        
        return nodeToReturn;
    }
    
    public void displayContents(){
        Node<Document> currentNode = this.head;
        int i=1;
        while(currentNode != null){
            System.out.println(i + 
                    ". Name: " + currentNode.getData().getName() +
                    "\tType: " + currentNode.getData().type()); //getType doesn't exist in data.
            currentNode = currentNode.getNext();
            i++;
        }
    }
}
