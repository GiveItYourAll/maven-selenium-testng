package testngBasicsPractice;

import org.testng.annotations.Test;

public class GroupingPracticeTwoTest {
    @Test(groups={"regression"})

    public void test_case_seven () {
        System.out.println("Test case SEVEN running..");
    }
@Test(groups={ "regression"})
public void test_case_eight() {

    System.out.println("Test case EIGHT running..");

    }

}
