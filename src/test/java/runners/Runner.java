package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        features = "src/test/resources/Features",
        glue = "stepDefinitions",
        tags = "@4" ,
        dryRun = false


)
public class Runner {

    private static final Logger logger = LogManager.getLogger(Runner.class);


    @BeforeClass
    public static void setup() {
        // Test çalışmaya başlamadan önce loglama yapılır
        logger.info("Cucumber Test Runner başlatılıyor...");
    }

}
