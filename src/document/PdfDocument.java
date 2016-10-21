package document;

/**
 *
 * @author quantumDrop
 */
public class PdfDocument<pdfDoc> extends Document {
    public PdfDocument(String name){
        super.name = name;
    }
    
    @Override
    public Class<PdfDocument> getType(){
        return PdfDocument.class;
    }
}
