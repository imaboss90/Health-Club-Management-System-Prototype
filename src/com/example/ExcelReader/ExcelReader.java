package com.example.ExcelReader;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
//as of now, this reads data from excel file and prints it to the console.
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream(new File("resources/50-sample-contacts-list-excel.xlsx"))){
             Workbook workbook = WorkbookFactory.create(file);
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }

            workbook.close();
        } catch (IOException | EncryptedDocumentException ex) {
            ex.printStackTrace();
        }
    }
}
