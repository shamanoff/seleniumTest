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
}
