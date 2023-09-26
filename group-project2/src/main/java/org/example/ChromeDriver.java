package org.example;



public class ChromeDriver  implements WebDriver, RemoteWebDriver, TakeScreenshot {

    @Override
    public void navigate() {
        System.out.println("this is navigating from chrome browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("this is taking screen shot from chrome browser");
    }

    @Override
    public void open() {
        System.out.println("opening web site from chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Closing web site from chrome browser");
    }

    @Override
    public String getTitle() {
        return "https://cnn.com";
    }
}
