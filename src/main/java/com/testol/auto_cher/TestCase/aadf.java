package com.testol.auto_cher.TestCase;

import com.testol.auto_cher.Failed.FailedRetry;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({com.testol.auto_cher.Listener.AssertListener.class,com.testol.auto_cher.Report.ExtentTestNGReporterListener.class})
public class aadf {



    @Test(retryAnalyzer= FailedRetry.class)
    public void test20(){

        Assert.assertEquals(1,1);

    }


    @Test(retryAnalyzer= FailedRetry.class)
    public void test21(){

        Assert.assertEquals(1,1);

    }


    @Test(retryAnalyzer= FailedRetry.class)
    public void test22(){


            Assert.assertEquals(1,1);




    }



}
