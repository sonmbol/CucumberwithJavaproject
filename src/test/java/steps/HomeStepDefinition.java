package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeStepDefinition {
    public static WebDriver driver;
    @Given("i am navigate to home page")
    public void i_am_navigate_to_home_page() throws InterruptedException {
        System.out.println("Hi from steps");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins");
        System.setProperty("webdriver.chrome.driver", "/Users/ahmedkeejab/Downloads/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver(options);
        driver.get("https://www.youtube.com/watch?v=ZHXQ13FpdLU");
        Thread.sleep(3000);
    }
    @When("navigate forgot password link")
    public void navigate_forgot_password_link() throws InterruptedException {
        driver.findElement(By.xpath("body > ytd-app:nth-child(17) > div:nth-child(6) > div:nth-child(1) > ytd-masthead:nth-child(1) > div:nth-child(5) > div:nth-child(2) > ytd-searchbox:nth-child(2) > form:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).sendKeys("i am coming from automation");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // driver.findElement(By.id("(//button[@id='search-icon-legacy'])[1]")).click();
        System.out.println("i should see forgot password page");
    }
    @Then("i should see forgot password page")
    public void i_should_see_forgot_password_page() {
        driver.findElement(By.xpath("//input[@id='i0118']")).sendKeys("Firewa11@122344");
        driver.findElement(By.xpath("declineButton")).click();
        //declineButton
        System.out.println("i should see forgot password page");
    }

    @When("I test the Github it should work")
    public void iTestTheGithubItShouldWork() {
        System.out.println("GitHub working fine!!!");
    }
}
