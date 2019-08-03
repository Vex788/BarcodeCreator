import com.itextpdf.text.Image;

import java.util.ArrayList;
import java.util.Scanner;

/*
- Properties -
- Module width Minimum: 0.020" (0.508 mm)
- Row height Minimum: 3 modules
- Error correction Minimum: Level 6
- Requirements -
- Use uppercase letters for all data, as shown above.
- Do not enter any spaces in the data.
- Enter a value for each field. Null or zero values are not valid.
- Do not list an ASIN with a quantity of 0. Exclude the ASIN from the data.
- Do not pack more than 100 different ASINs in a single box.
- Provide expiration dates in YYMMDD format.
*/
public class Main {

    public static void main(String[] args) {
        try {
            BarcodePDF417Creator creator = new BarcodePDF417Creator();
            System.out.print("Enter code text: ");
            Scanner scanner = new Scanner(System.in);
            ArrayList<Image> images = creator.getBarcodeImageCollection(scanner.nextLine().split(" "));

            creator.writeOnPage(images);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
