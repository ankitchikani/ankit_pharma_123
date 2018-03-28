

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class MyStepdefs {

    public static WebDriver driver;

    @Given("^User is on homepage$")
    public void userIsOnHomepage() throws Throwable {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.name("firstName")).sendKeys("Ankit");
        driver.findElement(By.name("lastName")).sendKeys("Chikani");
        driver.findElement(By.name("phone")).sendKeys("07825376697");
        //*Random randomG = new Random();
       // int randomInt = randomG.nextInt(100);
        driver.findElement(By.id("userName")).sendKeys("agchikani@gmail.com");
        driver.findElement(By.id("userName")).sendKeys("agchikani@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("Lanchbury lane");
        driver.findElement(By.name("city")).sendKeys("Ahmedabad");
        new Select(driver.findElement(By.name("country"))).selectByVisibleText("INDIA");
       // String assertText = driver.findElement(By.name("userName")).getAttribute("value"); //Fetch actual text
       driver.findElement(By.name("email")).sendKeys("agchikani@gmail.com");
        //System.out.println(assertText);
        driver.findElement(By.name("password")).sendKeys("abcd123");
        driver.findElement(By.name("confirmPassword")).sendKeys("abcd123");
        driver.findElement(By.name("register")).click();

    }

    @Then("^User can successfully Sign In$")
    public void userCanSuccessfullySignIn() throws Throwable {
       // driver.findElement(By.name("login")).click();

    }



    @When("^User enter valid \"([^\"]*)\"$")
    public void userEnterValid(String arg0) throws Throwable {
        //driver.findElement(By.cssSelector("a[href=\"login.php\"]")).click();
        //driver.findElement(By.name("userName")).sendKeys(arg0);


    }

    @And("^enter valid \"([^\"]*)\"$")
    public void enterValid(String arg0) throws Throwable {

        //driver.findElement(By.name("password")).sendKeys(arg0);
        //driver.findElement(By.name("submit")).click();

    }

    @When("^User click on Flights$")
    public void userClickOnFlights() throws Throwable {
        driver.findElement(By.linkText("Flights")).click();
    }


//    You can implement missing steps with the snippets below:

    @When("^User select journeytype \"([^\"]*)\"$")
    public void user_select_journeytype(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @When("^User Select passenger \"([^\"]*)\"$")
    public void user_Select_passenger(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @When("^User select departingfrom \"([^\"]*)\"$")
    public void user_select_departingfrom(String arg1) throws Throwable {
        new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
    }

    @When("^User Select Arriving to \"([^\"]*)\"$")
    public void user_Select_Arriving_to(String arg1) throws Throwable {
        new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("New York");

    }

    @When("^User Select Service class \"([^\"]*)\"$")
    public void user_Select_Service_class(String arg1) throws Throwable {

    }

    @When("^click on continue$")
    public void click_on_continue() throws Throwable {
        driver.findElement(By.name("findFlights")).click();
    }

    @Then("^User can see expected Airline \"([^\"]*)\"$")
    public void user_can_see_expected_Airline(String arg1) throws Throwable {
        String Actual= driver.findElement(By.cssSelector(".data_left")).getText();
        assert(Actual.contains(arg1));
    }


}
