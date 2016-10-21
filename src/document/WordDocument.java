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
    public Class<WordDocument> getType(){
        return WordDocument.class;
    }
}
