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
        testStudent = new Student("steven_hu", "boy", 170 , 23, "�Ϻ���");
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
        //Ԥ��ֵ��ʵ��ֵ��һ��������ʱ����ʧ��(Failure)
        assertEquals("�ϲ���ѧ", testStudent.getSchool());
    }
    
    public void testGetName()
    {
        assertEquals("hdy", testStudent.getName());
    }
}
