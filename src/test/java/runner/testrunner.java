package runner;


import com.cucumber.listener.ExtentCucumberFormatter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;

@CucumberOptions(
        // tags = "",
        //features = "src/test/resources/features/loginparameter.feature",
        features = "src/test/resources/features",
        glue = "steps",
        monochrome = true,
       // tags={"@sanity,@functional"}
        //tags="@sanity",
        //plugin = {"pretty","html:target/cucumber","com.cucumber.listener.ExtentCucumberFormatter"}
        plugin = {"pretty","html:target/cucumber"}

)
public class testrunner extends CustomAbstractTestNGCucumberTests {
//    @BeforeClass
//    public static void setup()
//
//    {
//       ExtentCucumberFormatter.initiateExtentCucumberFormatter();
//        ExtentCucumberFormatter.loadConfig(new File("src/extent-config.xml"));
//        ExtentCucumberFormatter.addSystemInfo("Browser name", "Firefox");
//        ExtentCucumberFormatter.addSystemInfo("Browser version", "v31.0");
//        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v2.53.0");
//    }

    @Override
    @DataProvider()
    public Object[][] scenarios() {

       return super.scenarios();
    }

    }


