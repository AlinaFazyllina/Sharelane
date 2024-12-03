import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class MyFirstSeleniumTest {
    public static void main(String[] args) {
        // Set the path to the browser driver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        // Perform actions on the website
        // ...

        // Close the browser
        driver.quit();
    }
}