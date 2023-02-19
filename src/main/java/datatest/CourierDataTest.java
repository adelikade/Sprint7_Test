package datatest;
import org.apache.commons.lang3.RandomStringUtils;
import pojo.Courier;

public class CourierDataTest {
    private static final String LOGIN = RandomStringUtils.randomAlphanumeric(5);
    private static final String PASSWORD = "qwerty";
    private static final String FIRST_NAME = "name";

    public static Courier getCourierAllField()
    {
        Courier courier = new Courier();
        courier.setLogin(LOGIN);
        courier.setPassword(PASSWORD);
        courier.setFirstName(FIRST_NAME);
        return courier;
    }

    public static Courier getCourierWithoutLogin()
    {
        Courier courier = new Courier();
        courier.setPassword(PASSWORD);
        courier.setFirstName(FIRST_NAME);
        return courier;
    }
}