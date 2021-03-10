import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

public class PdfDemo {
	public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
		String dest = "E://first.pdf";
		PdfWriter writer = new PdfWriter(dest);

		PdfDocument pdfDoc = new PdfDocument(writer);

		pdfDoc.addNewPage();
		Document document = new Document(pdfDoc);

		String para = "This is Paragraph";
		// Creating an Area Break
		Paragraph para1 = new Paragraph(para);

		ImageData data = ImageDataFactory.create("https://i.pinimg.com/564x/51/7b/07/517b07bfac2232980597368f36fc06c5.jpg");
		Image img = new Image(data);
		
		img.setFixedPosition(100, 100); 
		
		float[] pointColumnWidths = { 150F, 150F, 150F };
		Table table = new Table(pointColumnWidths);
		table.addCell(new Cell().add("id"));
		table.addCell(new Cell().add("name"));
		table.addCell(new Cell().add("designation"));
		for(int i=0;i<10;i++) {
			table.addCell(new Cell().add("1001"+i));
			table.addCell(new Cell().add("raju"+i));
			table.addCell(new Cell().add("Programmer"+i));
		}

		document.add(para1);
		document.add(img);
		document.add(table);

		document.close();
	}
}
