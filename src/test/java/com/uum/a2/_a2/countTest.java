/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.a2._a2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class countTest {

    public countTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of comment method, of class count.
     */
    @Test
    public void testComment() throws FileNotFoundException, IOException {
        System.out.println("comment");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        count instance = new count();
        String comment = "";
        int expResult = 7;
        int result = 0;
        while ((comment = br.readLine()) != null) {
            result = instance.comment(comment);
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of blank method, of class count.
     */
    @Test
    public void testBlank() throws FileNotFoundException, IOException {
        System.out.println("blank");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String comment = "";
        count instance = new count();
        int expResult = 4;
        int result = 0;
        while ((comment = br.readLine()) != null) {
            result = instance.blank(comment);
        }

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //    fail("The test case is a prototype.");
    }

    /**
     * Test of lineOfCode method, of class count.
     */
    @Test
    public void testLineOfCode() throws FileNotFoundException, IOException {
        System.out.println("lineOfCode");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String LOC = "";
        count instance = new count();
        int expResult = 29;
        int result = 0;
        while ((LOC = br.readLine()) != null) {
            result = instance.lineOfCode(LOC);
        }
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of actualLOC method, of class count.
     */
    @Test
    public void testActualLOC() throws FileNotFoundException, IOException {
        System.out.println("actualLOC");
        int lineOfCode = 0;
        int numblank = 0;
        int comment = 0;
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        File f = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String actualLOC = "";
        count instance = new count();
        int expResult = 18;

        while ((actualLOC = br.readLine()) != null) {
            lineOfCode = instance.lineOfCode(actualLOC);
            numblank = instance.blank(actualLOC);
            comment = instance.comment(actualLOC);
        }
        int result = instance.actualLOC(lineOfCode, numblank, comment);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of keyword method, of class count.
     */
    @Test
    public void testKeyword() throws Exception {
        System.out.println("keyword");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;;
        count instance = new count();
        int expResult = 15;
        int result = instance.keyword(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of keyJava method, of class count.
     */
    @Test
    public void testKeyJava() throws Exception {
        System.out.println("keyJava");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        count instance = new count();
        int[] expResult = instance.keyJava(path);
        int[] result = instance.keyJava(path);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of countTotalValue method, of class count.
     */
    @Test
    public void testCountTotalValue() {
        System.out.println("countTotalValue");
        int actualLOC = 0;
        int keyNum = 0;
        count instance = new count();
        int expResult = 0;
        int result = instance.countTotalValue(actualLOC, keyNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
