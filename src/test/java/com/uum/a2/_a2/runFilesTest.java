/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.a2._a2;

import java.io.File;
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
public class runFilesTest {

    public runFilesTest() {
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
     * Test of scanFile method, of class runFiles.
     */
    @Test
    public void testScanFile() throws Exception {
        System.out.println("scanFile");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        runFiles instance = new runFiles(path);
        instance.scanFile(path);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getSem method, of class runFiles.
     */
    @Test
    public void testGetSem() throws Exception {
        System.out.println("getSem");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        runFiles instance = new runFiles(path);
        String expResult = "A171";
        String result = instance.getSem(path);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCourse method, of class runFiles.
     */
    @Test
    public void testGetCourse() throws Exception {
        System.out.println("getCourse");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        runFiles instance = new runFiles(path);
        String expResult = "STIW3054";
        String result = instance.getCourse(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGroup method, of class runFiles.
     */
    @Test
    public void testGetGroup() throws Exception {
        System.out.println("getGroup");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        runFiles instance = new runFiles(path);
        String expResult = "A";
        String result = instance.getGroup(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTask method, of class runFiles.
     */
    @Test
    public void testGetTask() throws Exception {
        System.out.println("getTask");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        runFiles instance = new runFiles(path);
        String expResult = "Assignment1";
        String result = instance.getTask(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMatric method, of class runFiles.
     */
    @Test
    public void testGetMatric() throws Exception {
        System.out.println("getMatric");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        runFiles instance = new runFiles(path);
        String expResult = "123456";
        String result = instance.getMatric(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class runFiles.
     */
    @Test
    public void testGetName() throws Exception {
        System.out.println("getName");
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = "";
        workingDirectory.replace("\\", "/");
        String filename = "/STIW3054-RT-Programming-master/src/Assignment2_TestFiles";
        absoluteFilePath = workingDirectory + File.separator + filename + "/MyThread2.java";
        String path = absoluteFilePath;
        runFiles instance = new runFiles(path);
        String expResult = "Ali bin Abu Bakar";
        String result = instance.getName(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
