# BarcodeCreator
Create barcode in pdf417 format.
## Installing
You neen IDEA and Maven project. 
Open IDEA then File/Open project, select the current project and click OK.
Wait for Maven to set up the project.
## To start
Select artifact "Main" (to run the application normally (you need to enter the string you want to encode)), "MainTest" (to run test (no need to enter a string, data is stored in an array of strings)), after selecting the artifact, press Run or Shift + F10.
## Data entry requirements
- To enter several lines for encoding, you need to separate them with a space.
- Use uppercase letters for all data, as shown above.
- Do not enter any spaces in the data.
- Enter a value for each field. Null or zero values are not valid.
- Do not list an ASIN with a quantity of 0. Exclude the ASIN from the data.
- Do not pack more than 100 different ASINs in a single box.
- Provide expiration dates in YYMMDD format.
## If the installation failed
Create a New project/Maven (all default settings), and click Next and click Finish.
## After the tests or normal Run
The result can be seen in the directory "D://BarcodeImage.pdf".
## Test string 
```code
AMZN,PO:FBA15H9RGK6C,FNSKU:X001UECQAX,QTY:1,EXP:140428
```
## Main run result
![Console](https://github.com/Vex788/BarcodeCreator/blob/master/scrn1.png?raw=true)
![PDF file](https://github.com/Vex788/BarcodeCreator/blob/master/scrn5.png?raw=true)
## MainTest run result
![Console](https://github.com/Vex788/BarcodeCreator/blob/master/scrn2.png?raw=true)
![PDF file](https://github.com/Vex788/BarcodeCreator/blob/master/scrn4.png?raw=true)
## Test scanning
Test scanning using the application "PDF417 barcode scanner".
![PDF file](https://github.com/Vex788/BarcodeCreator/blob/master/scrn3.jpg?raw=true)
