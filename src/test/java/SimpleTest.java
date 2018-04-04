
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.*;

import java.lang.reflect.Array;
import java.util.Arrays;

@Epic("[@Epic]Allure examples")

public class SimpleTest {

    @BeforeClass
    public static void setUpClass(){
        System.out.println("@BeforeClass");
    }
    @AfterClass
    public static void tearDonwClass(){
        System.out.println("@AfterClass");
    }
    @Before
    public void setUp(){
        System.out.println("@BeforeTest");
    }
    @After
    public void tearDonw(){
        System.out.println("AfterTest");
    }

    @Step(" [@Step] TestCase1 Type {login} / {password}.")
    public void loginWith(String login, String password) {
    System.out.print("Step1");
    }

    @Step(" [@Step] TestCase2 .")
    public void login() {
        System.out.print("Step2");
    }

    @Attachment
    public String performedActions(String[] arr) {
        return Arrays.toString(arr);
    }

    @Test
    @Feature("[@Feature]Junit 4 support")
    @Description("@Description TestCase1")
    @DisplayName("[@DisplayName] TestCase1")
    @Severity(SeverityLevel.BLOCKER)
    @Story(" [@Story] TestCase1 Base support for bdd annotations")
    public void tc1(){
        System.out.println("tc1");
        Assert.assertTrue(true);
    }

    @Test
    @Feature("[@Feature]Junit 4 support")
    @Description("[@Description] TestCase2")
    @DisplayName("[@DisplayName] TestCase2")
    @Severity(SeverityLevel.CRITICAL)
    @Story(" [@Story] TestCase2 Base support for bdd annotations")
    public void tc2(){
        System.out.println("tc2");
        Assert.assertTrue(true);
    }

    @Test
    @Feature("[@Feature]Junit 3 support")
    @Description("[@Description] TestCase3")
    @DisplayName("[@DisplayName] TestCase3")
    @Severity(SeverityLevel.MINOR)
    @Story(" [@Story] TestCase3 Base support for bdd annotations")
    public void tc3(){
        System.out.println("tc3");
        loginWith("StrLogin", "StrPass");
        login();
        performedActions( new String[]{"aaa", "bbb", "ccc"});
        Assert.assertTrue(true);

    }


    @Test
    @Feature("[@Feature]Junit 3 support")
    @Description("[@Description] TestCase4")
    @DisplayName("[@DisplayName] TestCase4")
    @Severity(SeverityLevel.TRIVIAL)
    @Story(" [@Story] TestCase4 Base support for bdd annotations")
    public void tc4(){
        System.out.println("tc4");
        loginWith("login", "pass");
        login();
        performedActions( new String[]{"dd", "ee", "xx"});
        Assert.assertTrue("Assertion message false", false);
    }

}
