package document;
/**
 *
 * @author quantumDrop
 */
public abstract class Document<D> {
    String name;
    
    public String getName(){
        return this.name;
    }
    public abstract Class<D> getType();
}
