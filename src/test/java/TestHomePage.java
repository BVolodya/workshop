import common.TestBase;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;

public class TestHomePage extends TestBase {

    @Test
    @Description("Test case verifies field input on registration page")
    public void testHomePage() {
        homePage.clickRegistrationButton()
                .fillLastNameInput("lastname")
                .fillNameInput("username");

    }

}
