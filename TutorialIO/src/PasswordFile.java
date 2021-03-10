import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PasswordFile {
	public static void main(String[] args) {
		try {
			String pdfFilePath = "E:/pass.pdf";

			OutputStream fos = new FileOutputStream(new File(pdfFilePath));
			Document document = new Document();
			PdfWriter pdfWriter = PdfWriter.getInstance(document, fos);

			String userPassword = "deep";
			String ownerPassword = "admin";

			pdfWriter.setEncryption(userPassword.getBytes(), ownerPassword.getBytes(), PdfWriter.ALLOW_PRINTING,
					PdfWriter.ENCRYPTION_AES_128);

			document.open();

			document.add(new Paragraph("This is Password protected PDF file"));

			document.close();
			fos.close();

			System.out.println("PDF created in >> " + pdfFilePath);

		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
