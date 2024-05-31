package testngBasicsPractice;

import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class GroupingTest {

   @Test(groups={ "regression"})
    public void test_case_one(){
       System.out.println("Test case ONE running..");

   }
    @Test(groups={ "regression"})
    public void test_case_two(){
        System.out.println("Test case TWO running..");

    }
    @Test(groups={ "regression"})
    public void test_case_three(){
        System.out.println("Test case THREE running..");

    }
    @Test(groups={ "regression"})
    public void test_case_four(){
        System.out.println("Test case FOUR running..");

    }
    @Test(groups={ "regression"})
    public void test_case_five(){
        System.out.println("Test case FIVE running..");

    }
    @Test
    public void test_case_six(){
        System.out.println("Test case SIX running..");

    }
}
