package PrintScheduler;

import Queue.PrintQueue;
import document.PdfDocument;
import document.WordDocument;

/**
 *
 * @author quantumDrop
 */
public class PrintScheduler {
    public static void main(String[] args) {
        PrintQueue queue = new PrintQueue();
        for(int i=0; i<100; i++){
            if(i%2 == 0){
                queue.push(new WordDocument("Word document " + i + "."));
            } else {
                queue.push(new PdfDocument("Pdf document " + i + "."));
            }
        }
        
        queue.displayContents();
    }
    
}
