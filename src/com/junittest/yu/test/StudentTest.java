package com.junittest.yu.test;


import junit.framework.TestCase;

import com.junittest.yu.Student;

public class StudentTest extends TestCase
{

    private Student testStudent;
    
    @Override
    protected void setUp() throws Exception
    {
        // TODO Auto-generated method stub
        super.setUp();
        testStudent = new Student("steven_hu", "boy", 170 , 23, "上海理工");
    }

    @Override
    protected void tearDown() throws Exception
    {
        // TODO Auto-generated method stub
        super.tearDown();
    }

    public void testSetage()
    {
        assertTrue(testStudent.setAge(21));
    }
    
    public void testGetSchool()
    {
        //预期值和实际值不一样，测试时出现失败(Failure)
        assertEquals("南昌大学", testStudent.getSchool());
    }
    
    public void testGetName()
    {
        assertEquals("hdy", testStudent.getName());
    }
}
