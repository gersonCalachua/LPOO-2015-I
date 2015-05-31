package pe.uni.fiis.trabajo;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;

/**
 * Created by seven on 31/05/2015.
 */
public class HorarioExcel {

        public static void main(String[] args) {
            HSSFWorkbook aereopuerto = new HSSFWorkbook();
            try {
                FileOutputStream horarios = new FileOutputStream("Woorbook.xls");
                Sheet hoja1 = aereopuerto.createSheet("Horario Vuelos");

                Row fila = hoja1.createRow(0);
                Cell cell = fila.createCell(0);
                HSSFRichTextString texto = new HSSFRichTextString("Vuelo");
                cell.setCellValue(texto);
                Cell cell1 = fila.createCell(1);
                HSSFRichTextString texto1 = new HSSFRichTextString("Hora Salida");
                cell1.setCellValue(texto1);
                Cell cell2 = fila.createCell(2);
                HSSFRichTextString texto2 = new HSSFRichTextString("Hora Llegada");
                cell2.setCellValue(texto2);
                Cell cell3 = fila.createCell(3);
                HSSFRichTextString texto3 = new HSSFRichTextString("Destino");
                cell3.setCellValue(texto3);


                Row fila1 = hoja1.createRow(1);
                Cell cell11 = fila1.createCell(0);
                HSSFRichTextString texto4 = new HSSFRichTextString("A-22");
                cell11.setCellValue(texto4);
                Cell cell12= fila1.createCell(1);
                HSSFRichTextString texto5 = new HSSFRichTextString("8:00");
                cell12.setCellValue(texto5);
                Cell cell13 = fila1.createCell(2);
                HSSFRichTextString texto6 = new HSSFRichTextString("13:00");
                cell13.setCellValue(texto6);
                Cell cell14 = fila1.createCell(3);
                HSSFRichTextString texto7 = new HSSFRichTextString("Miami");
                cell14.setCellValue(texto7);


                Row fila2 = hoja1.createRow(2);
                Cell cell21 = fila2.createCell(0);
                HSSFRichTextString texto8 = new HSSFRichTextString("A-66");
                cell21.setCellValue(texto8);
                Cell cell22 = fila2.createCell(1);
                HSSFRichTextString texto9 = new HSSFRichTextString("9:00");
                cell22.setCellValue(texto9);
                Cell cell23 = fila2.createCell(2);
                HSSFRichTextString texto10 = new HSSFRichTextString("16:00");
                cell23.setCellValue(texto10);
                Cell cell24 = fila2.createCell(3);
                HSSFRichTextString texto11 = new HSSFRichTextString("Berlin");
                cell24.setCellValue(texto11);

                Row fila3 = hoja1.createRow(3);
                Cell cell31 = fila3.createCell(0);
                HSSFRichTextString texto12 = new HSSFRichTextString("B-59");
                cell31.setCellValue(texto12);
                Cell cell32 = fila3.createCell(1);
                HSSFRichTextString texto13 = new HSSFRichTextString("12:00");
                cell32.setCellValue(texto13);
                Cell cell33 = fila3.createCell(2);
                HSSFRichTextString texto14 = new HSSFRichTextString("23:00");
                cell33.setCellValue(texto14);
                Cell cell34 = fila3.createCell(3);
                HSSFRichTextString texto15 = new HSSFRichTextString("Tokio");
                cell34.setCellValue(texto15);

                aereopuerto.write(horarios);

                horarios.close();
            } catch (Exception horarios) {
                horarios.printStackTrace();
            }

        }


}
