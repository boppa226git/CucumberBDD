package steps;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


import io.cucumber.java.en.Given;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class jobsearchsteps {

    public  static WebDriver driver;
    //WebDriverManager.chromedriver().setup();

    @Before
    static void setupClass() {



    }
    @After
    public void tearDown(Scenario scenario) throws IOException {
        if(scenario.isFailed())
        {
            TakesScreenshot scrShot =(TakesScreenshot)driver;
            File sf=scrShot.getScreenshotAs(OutputType.FILE);
            File df=new File("./Screenshots/img1.jpg");
            FileUtils.copyFile(sf,df);
        }

        //driver.close();
    }

    @Given("user launch the chrome browser")
    public void user_launch_the_chrome_browser() {
        System.out.println("job search---user launch chrome browser");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @Given("user open url as {string}")
    public void user_open_url_as(String url) throws InterruptedException {
        System.out.println("job search---user open open url:  "+url);


        driver.get(url);
        Thread.sleep(5000);


    }

}
