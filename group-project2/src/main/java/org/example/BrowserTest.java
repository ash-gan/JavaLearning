package org.example;

public class BrowserTest {

    public static void main(String[] args) {

        RemoteWebDriver[] rm = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        for(RemoteWebDriver rd:rm){
            rd.open();
            System.out.println(rd.getTitle());
            rd.getScreenshot();
            rd.navigate();
            rd.close();
        }

    }
}
