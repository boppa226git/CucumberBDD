package runner;


import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import org.apiguardian.api.API;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@API(
        status = API.Status.STABLE
)
public abstract class CustomAbstractTestNGCucumberTests {
    private TestNGCucumberRunner testNGCucumberRunner;
    ITestContext context;
    public CustomAbstractTestNGCucumberTests() {
    }

    @BeforeClass(
            alwaysRun = true
    )
    public void setUpClass() {
        System.out.println("class= "+this.getClass());
        this.testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        System.out.println("sssss--->" + testNGCucumberRunner.provideScenarios());


    }

    @Test(
            groups = {"cucumber"},
            description = "Runs Cucumber Scenarios",
            dataProvider = "scenarios"
    )
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        this.testNGCucumberRunner.runScenario(pickleWrapper.getPickle());

    }

    @DataProvider
    public Object[][] scenarios() {
        return this.testNGCucumberRunner == null ? new Object[0][0] : this.testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(
            alwaysRun = true
    )
    public void tearDownClass() {
        if (this.testNGCucumberRunner != null) {
            this.testNGCucumberRunner.finish();
        }
    }


}
