package com.junittest.yu.test;



//import com.junittest.yu.test.StudentTest;
import com.junittest.yu.test.StudentTest01;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTest
{

    //static PersonTest p = new PersonTest();
    //static PersonTest p1 = new PersonTest();
    public static Test suite()
    {
        TestSuite suite = new TestSuite("Test for com.junittest.yu.test.");
        //suite.addTest(p);
        //suite.addTest(p1);
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(StudentTest01.class);
        return suite;
        
    }
}
