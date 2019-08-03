import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.BarcodePDF417;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class BarcodePDF417Creator {

    public BarcodePDF417Creator() {

    }

    private Image getBarcodeImage(String codeText) throws Exception {
        BarcodePDF417 pdf417 = new BarcodePDF417();

        pdf417.setErrorLevel(6);
        pdf417.setYHeight(0.020f);
        pdf417.setText(codeText);

        return pdf417.getImage();
    }

    public ArrayList<Image> getBarcodeImageCollection(String[] codeText) throws Exception {
        System.out.println("Receiving barcode collection");
        ArrayList<Image> images = new ArrayList<>();

        for (int i = 0; i < codeText.length; i++) {
            images.add(getBarcodeImage(codeText[i]));
        }

        return images;
    }

    public void writeOnPage(ArrayList<Image> images) {
        System.out.println("Creating pdf file");
        Document doc = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            PdfWriter.getInstance(doc, new FileOutputStream("D://BarcodeImage.pdf"));
            doc.open();

            PdfPTable table = null;

            final int G = 10;
            final int NG = (images.size() + G - 1) / G;

            ArrayList<ArrayList<Image>> pages = new ArrayList(NG);
            IntStream.range(0, images.size())                       // get pages of 10 items
                    .forEach(i -> {
                        if (i % G == 0) {
                            pages.add(i / G, new ArrayList<>());
                        }
                        pages.get(i / G).add(images.get(i));
                    });
            System.out.println("Insert barcodes");
            for (ArrayList<Image> imageList : pages) {
                table = new PdfPTable(2);

                for (Image image : imageList) {
                    table.addCell(image);
                }
                if (imageList.size() % 2 != 0) {
                    table.addCell("");
                }
                doc.add(table);
                doc.newPage();
            }
            System.out.println("File created successfully");
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            doc.close();
        }
    }
}
