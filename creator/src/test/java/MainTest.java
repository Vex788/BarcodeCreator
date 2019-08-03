import com.itextpdf.text.Image;

import java.util.ArrayList;

public class MainTest {

    public static void main(String[] args) {
        try {
            BarcodePDF417Creator creator = new BarcodePDF417Creator();
            ArrayList<Image> images = creator.getBarcodeImageCollection(
                    new String[]{
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428",
                            "AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428"
                    }
            );
            creator.writeOnPage(images);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
