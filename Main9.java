import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
public class Main9 {
public static void main(String[] args) {
try {
FileInputStream fis = new FileInputStream("D://Test.xlsx");
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet = workbook.getSheetAt(0);
Row row = sheet.getRow(0);
if (row != null) {
Cell cell = row.getCell(0);
if (cell != null) System.out.println("Cell Value: " + cell);
else System.out.println("Cell is null");
} else {System.out.println("Row is null");}
workbook.close();
fis.close();
} catch (FileNotFoundException e) {System.out.println("File not found: " + e.getMessage());}
catch (IOException e) {System.out.println("Error reading Excel file: " + e.getMessage());}

}
}