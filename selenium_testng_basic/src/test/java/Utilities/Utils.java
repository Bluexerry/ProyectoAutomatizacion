package Utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;

public class Utils {

    public static DesiredCapabilities capabilities;
    public static ChromeDriver chromeDriver;

    public static void Instanciador_Chrome() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
		chromeOptions.merge(cap);
		chromeDriver = new ChromeDriver(chromeOptions);
    }

    public static DesiredCapabilities GetCapabilities() {
        return capabilities;
    }

    public static void CloseBrowser() {
        chromeDriver.close();
    }
}