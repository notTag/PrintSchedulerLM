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
    public pdfDoc type(){
        return (pdfDoc) "PDF Document";
    }
}
