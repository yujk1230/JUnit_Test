package com.junittest.yu.test;

import com.junittest.yu.Student;

import junit.framework.TestCase;

public class StudentTest01 extends TestCase
{

    Student testStudent;
    //�˷�����ִ��ÿһ�����Է���֮ǰ������������֮ǰ����
    @Override
    protected void setUp() throws Exception
    {
        // TODO Auto-generated method stub
        super.setUp();
        testStudent = new Student("djm", "boy", 178, 24, "��³��ҵ");
        System.out.println("setUp()");
    }

    //�˷�����ִ��ÿһ�����Է���֮�����
    @Override
    protected void tearDown() throws Exception
    {
        // TODO Auto-generated method stub
        super.tearDown();
        System.out.println("tearDown()");
    }

    //��������������Person�����getSex()����
    public void testGetSex()
    {
        assertEquals("boy", testStudent.getSex());
        System.out.println("testGetSex()");
    }
    
    //����Person�����getAge()����
    public void testGetAge()
    {
        assertEquals(24, testStudent.getAge());
        System.out.println("testGetAge()");
    }
}
