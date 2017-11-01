//Sem ; A171
//Course : STIW3054
//Group : A
//Task : Asg 2
//Matric : 240217
//Name : Lim Shiau See
package com.uum.a2._a2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Realtime_Asg_2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        String absoluteFilePath1 = "";
        
        String filename = "Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        
        System.out.println("My Thread 2");
        runFiles a = new runFiles(path);
        System.out.println("My Thread 2 : " + path);
        
        System.out.println("");
        System.out.println("My Thread 1");
        absoluteFilePath1 = workingDirectory + File.separator + filename + "/MyThread1.java";
        String path2 = absoluteFilePath1;
        runFiles b = new runFiles(path2);
        System.out.println("My Thread 1 : " + path2);
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("Assignment 2");
        Object[][] datatypes = {{"Semester", a.getSem(path)},
        {"Course", a.getCourse(path)},
        {"Group", a.getGroup(path)},
        {"Task", a.getTask(path)}};

        int rowNum = 0;
        System.out.println("Creating excel");

        for (Object[] datatype : datatypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : datatype) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        XSSFRow c = sheet.createRow(5);
        count cK = new count();
        c.createCell(5).setCellValue("Java Keywords");

        int[] k1 = cK.keyJava(path);
        int[] k2 = cK.keyJava(path2);

        Object words[][] = {{"Matrik", "LOC", "Blank", "Comment", "ActualLOC",
            "class", "if", "extends", "abstract", "assert",
            "boolean ", "break", "byte ", "case", "catch",
            "char ", "continue", "default", "do", "else",
            "enum", "final", "finally", "float ", "for",
            "implements", "import", "instanceof", "int ", "interface",
            "long ", "native", "new", "package", "private",
            "protected", "public", "return", "short", "static",
            "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "volatile",
            "true", "while", "void", "const", "false",
            "goto", "null", "double", "Total"}, {a.getMatric(path), a.lineOFCode, a.numBlank, a.numOfCom, a.actualLOC,
            k1[0], k1[1], k1[2], k1[3], k1[4], k1[5], k1[6], k1[7], k1[8], k1[9], k1[10],
            k1[11], k1[12], k1[13], k1[14], k1[15], k1[16], k1[17], k1[18], k1[19], k1[20],
            k1[21], k1[22], k1[23], k1[24], k1[25], k1[26], k1[27], k1[28], k1[29], k1[30],
            k1[31], k1[32], k1[33], k1[34], k1[35], k1[36], k1[37], k1[38], k1[39], k1[40],
            k1[41], k1[42], k1[43], k1[44], k1[45], k1[46], k1[47], k1[48], k1[49], k1[50],
            k1[51], k1[52], a.totalLOC},
        {b.getMatric(path2), b.lineOFCode, b.numBlank, b.numOfCom, b.actualLOC,
            k2[0], k2[1], k2[2], k2[3], k2[4], k2[5], k2[6], k2[7], k2[8], k2[9], k2[10],
            k2[11], k2[12], k2[13], k2[14], k2[15], k2[16], k2[17], k2[18], k2[19], k2[20],
            k2[21], k2[22], k2[23], k2[24], k2[25], k2[26], k2[27], k2[28], k2[29], k2[30],
            k2[31], k2[32], k2[33], k2[34], k2[35], k2[36], k2[37], k2[38], k2[39], k2[40],
            k2[41], k2[42], k2[43], k2[44], k2[45], k2[46], k2[47], k2[48], k2[49], k2[50],
            k2[51], k2[52], b.totalLOC}};
        int rowNum1 = 6;
        for (Object[] words1 : words) {
            Row row = sheet.createRow(rowNum1++);
            int colNum1 = 0;
            for (Object field : words1) {
                Cell cell = row.createCell(colNum1++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try {
            String FILE_NAME = workingDirectory + File.separator + "Realtime Assignment 2.xlsx";
           
            FileOutputStream fis = new FileOutputStream(new File( FILE_NAME));
            wb.write(fis);
            //wb.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Excel file created");
    }
}
