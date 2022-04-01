import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class MyStepdefs {

    private WebDriver driver;

    @Given("I have written my email {string}")
    public void iHaveWrittenMyEmail(String email) {

        System.setProperty("webdriver.chrome.driver", "C:/Windows/Selenium/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://login.mailchimp.com/signup/");
        sendKeys(driver, By.id("email"), email);

    }

    @Given("I have written my username {string}")
    public void iHaveWrittenMyUsername(String name) {

        sendKeys(driver, By.id("new_username"), name);
    }

    @Given("I have written my password {string}")
    public void iHaveWrittenMyPassword(String password) {

        sendKeys(driver, By.id("new_password"), password);
    }

    @When("I click the Submit button")
    public void iClickTheSubmitButton() {

        click(driver, By.id("create-account"));
    }

    @Then("my account is created")
    public void myAccountIsCreated() {
        String expected = "Please enter a value";

        String actual = getText(driver, By.cssSelector("#signup-form > fieldset > div:nth-child(1) > div > span"));

        assertEquals(expected, actual);

        System.out.println("expected result: " + expected);
        System.out.println("actual result: " + actual);

        driver.quit();
    }

    @Given("I have written my mail {string}")
    public void iHaveWrittenMymail(String mail) {
        System.setProperty("webdriver.chrome.driver", "C:/Windows/Selenium/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://login.mailchimp.com/signup/");

        sendKeys(driver, By.id("email"), mail);

    }

    @Given("I have written my userName {string}")
    public void iHaveWrittenmyuserName(String userName) {

        sendKeys(driver, By.id("new_username"), userName);
    }

    @Given("I have written my passWord {string}")
    public void iHaveWrittenMyPassWord(String passWord) {

        sendKeys(driver, By.id("new_password"), passWord);
    }

    @When("I click sign Up")
    public void iClickSignUp() {

        click(driver, By.id("create-account"));

    }


    @Then("An Error is Displayed")
    public void AnErrorisDisplayed() {
        String expected = "Another user with this username already exists. Maybe it's your evil twin. Spooky.";

        String actual = getText(driver, By.cssSelector("#signup-form > fieldset > div:nth-child(2) > div > span"));

        assertEquals(expected,actual);

        System.out.println("expected result: " + expected);
        System.out.println("actual result: " + actual);
        driver.quit();
    }

    @Given("I have the email {string}")
    public void iHaveTheEmail(String email) {
        System.setProperty("webdriver.chrome.driver", "C:/Windows/Selenium/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://login.mailchimp.com/signup/");

        sendKeys(driver, By.id("email"), email);
    }

    @Given("I have the Username {string}")
    public void iHaveTheUsername(String Username) {

        sendKeys(driver, By.id("new_username"), Username);

    }

    @Given("I have the Password {string}")
    public void iHaveThePassword(String Password) {

        sendKeys(driver, By.id("new_password"), Password);
    }

    @When("I Click the button")
    public void iClickTheButton() {

        click(driver, By.id("create-account"));

    }

    @Then("A username too long error is displayed")
    public void aUsernameTooLongErrorIsDisplayed() {

        String expected = "Enter a value less than 100 characters long";

        String actual = getText(driver, By.cssSelector("#signup-form > fieldset > div:nth-child(2) > div > span"));

        assertEquals(expected,actual);

        System.out.println("expected result: " + expected);
        System.out.println("actual result: " + actual);

        driver.quit();

    }

    @Given("I have an available email {string}")
    public void iHaveAnAvaiableEmail(String email) {

        System.setProperty("webdriver.chrome.driver", "C:/Windows/Selenium/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://login.mailchimp.com/signup/");

        sendKeys(driver, By.id("email"), email);

    }

    @Given("I have an available username {string}")
    public void iHaveAnAvailableUsername(String username) {

        sendKeys(driver, By.id("new_username"), username);
    }

    @Given("I have my usual test password {string}")
    public void iHaveMyUsualTestPassword(String password) {

        sendKeys(driver, By.id("new_password"), password);

    }

    @When("I sign up")
    public void iSignUp() {

        click(driver, By.id("create-account"));

    }

    @Then("User is successfully created")
    public void userIsSuccessfullyCreated() {

        String expected = "Check your email";

        String actual = getText(driver, By.cssSelector("#signup-content > div > div > div > h1"));

        assertEquals(expected,actual);

        System.out.println("expected result: " + expected);
        System.out.println("actual result: " + actual);

        driver.quit();
    }



    private void printText(WebDriver driver, String idName) {
        WebDriverWait foobar = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = foobar.until(ExpectedConditions.presenceOfElementLocated(By.id(idName)));
        String text = element.getText();
        System.out.println(text);
    }

    private String getText(WebDriver driver, By by) {
        WebDriverWait foobar = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = foobar.until(ExpectedConditions.presenceOfElementLocated(by));
        String text = element.getText();
        return text;
    }

    private static void scroll(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

    }

    private static void sendKeys(WebDriver driver, By by, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(by));
        element.sendKeys(text);
    }

    private static void click(WebDriver driver, By by) {
        WebDriverWait foobar = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = foobar.until(ExpectedConditions.elementToBeClickable(by));

        element.click();

    }


}

