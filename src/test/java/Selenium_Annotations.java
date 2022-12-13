import org.testng.annotations.*;


public class Selenium_Annotations {

    //------------------- accesam acum metodele BEFORE ----------------------------------------------------------------------
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @BeforeGroups(groups ={"Groups 1"} )
    public void beforeGroups() {
        System.out.println("BeforeGroups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");
    }

//----------------- cream 2 teste sa avem ce rula pt verificare --------------------------------------------------------

    @Test(groups ={"Groups 1"} )
    public void Test1() {
        System.out.println("Test1");
    }

    @Test(groups ={"Groups 1"} )
    public void Test2() {
        System.out.println("Test2");
    }

    @Test(groups ={"Groups 2"} )
    public void Test3() {
        System.out.println("Test3");
    }

    @Test(groups ={"Groups 3"} )
    public void Test4() {
        System.out.println("Test4");
    }

    @Test(groups ={"Groups 3"} )
    public void Test5() {
        System.out.println("Test5");
    }

//------------------- accesam acum metodele AFTER ----------------------------------------------------------------------

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @AfterGroups(groups ={"Groups 1"} )
    public void afterGroups() {
        System.out.println("AfterGroups");
    }

    @AfterTest
    public void afyerTest() {
        System.out.println("AfterTest");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }
}