package document;

/**
 *
 * @author quantumDrop
 */

public class WordDocument<wordDoc> extends Document{
    public WordDocument(String name){
        super.name = name;
    }
    
    @Override
    public wordDoc type(){
        return (wordDoc) "Word Document";
    }
}
