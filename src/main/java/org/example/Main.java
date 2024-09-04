package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;
    public void launchbroser(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/ahmedkeejab/Downloads/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=156&ct=1721711846&rver=7.0.6738.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fnlp%3d1%26cobrandid%3dab0455a0-8d03-46b9-b18b-df2f57b9e44c%26deeplink%3dowa%252f%253frealm%253dhotmail.com%26RpsCsrfState%3dd1b4d542-d036-2e02-8fb7-5e98a60ab360&id=292841&aadredir=1&whr=hotmail.com&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=ab0455a0-8d03-46b9-b18b-df2f57b9e44c");
    }
    public static void main(String[] args) {
    Main obj = new Main();
    obj.launchbroser();

    }
}