
package com.uum.a2._a2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class runFiles {

    String st;
    int numOfCom = 0;
    int numBlank = 0;
    int lineOFCode = 0;
    int actualLOC = 0;
    int keyNum2 = 0;
    String sem, course, group, task, matric, name;
    String p;
    int totalLOC;
    public runFiles(String path) throws FileNotFoundException, IOException {
        scanFile(path);
    }

    public void scanFile(String path) throws FileNotFoundException, IOException {
        String p = path;
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        count cLine = new count();
        
        while ((st = br.readLine()) != null) {
            numOfCom = cLine.comment(st);
            numBlank = cLine.blank(st);
            lineOFCode = cLine.lineOfCode(st);
            actualLOC = cLine.actualLOC(lineOFCode, numBlank, numBlank);
            keyNum2 = cLine.keyword(path);
        }
        System.out.println("Number lines of comment : " + numOfCom);
        System.out.println("Number lines of blank : " + numBlank);
        System.out.println("Number lines of code : " + lineOFCode);
        System.out.println("Actual number line of code : " + actualLOC);
        System.out.println("Number of keyword : " + keyNum2);
        totalLOC = cLine.countTotalValue(actualLOC, keyNum2);
        System.out.println("Number of total value ; " + totalLOC);
        //System.out.println(readCourse(path));
    }

    public String getSem(String path) throws FileNotFoundException, IOException {
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        while ((st = br.readLine()) != null) {
            if (st.contains("//Semester")) {
                sem = st.substring(13);
            }
        }
        return sem;
    }

    public String getCourse(String path) throws IOException {
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        while ((st = br.readLine()) != null) {
            if (st.contains("//Course")) {
                course = st.substring(11);
            }
        }
        return course;
    }

    public String getGroup(String path) throws IOException {
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        while ((st = br.readLine()) != null) {
            if (st.contains("//Group")) {
                group = st.substring(10);
            }
        }
        return group;
    }

    public String getTask(String path) throws IOException {
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        while ((st = br.readLine()) != null) {
            if (st.contains("//Task")) {
                task = st.substring(9);
            }
        }
        return task;
    }

    public String getMatric(String path) throws IOException {
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        while ((st = br.readLine()) != null) {
            if (st.contains("//Matrik")) {
                matric = st.substring(11);
            }
        }
        return matric;
    }

    public String getName(String path) throws IOException {
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        while ((st = br.readLine()) != null) {
            if (st.contains("//Name")) {
                name = st.substring(9);
            }
        }
        return name;
    }
}