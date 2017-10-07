import org.junit.*;

public class MainClassTest {
    //выполняется самым первым до всех методов
    @BeforeClass
    public void beforeClassMethod(){}
    //выполняется перед Каждым методом
    @Before
    public void setUp(){}
    //тестовый метод
    @Test
    public void method1(){}

    @Test
    @Ignore //этот метод будет проигнорирован
    public void method2(){}
    //выполняется после каждого тестового метода
    @After
    public void tearDown(){}
    //выполняется самым последним после всех методов
    @AfterClass
    public void afterClassMethod(){}

    @Test
    public void method3() {
        Assert.assertTrue("Values are not equal!", 1 + 1 == 2);
    }

    @Test
    public void method4(){
        Assert.assertEquals(20, 5 + 5);
    }
    @Test
    public void method5() {
        Assert.assertFalse("Values are equal!",1 + 1 == 2);
    }

    @Test
    public void method6(){
        Assert.assertNotEquals(20, 5 + 5);
    }
}
