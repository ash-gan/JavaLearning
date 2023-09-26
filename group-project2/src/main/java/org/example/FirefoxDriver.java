package org.example;

public class FirefoxDriver implements WebDriver, RemoteWebDriver, TakeScreenshot{

    @Override
    public void navigate() {
        System.out.println("this is navigating from Firefox" +
                " browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("this is taking screen shot from Firefox" +
                " browser");
    }

    @Override
    public void open() {
        System.out.println("opening web site from Firefox" +
                " browser");
    }

    @Override
    public void close() {
        System.out.println("Closing web site from Firefox" +
                " browser");
    }

    @Override
    public String getTitle() {
        return "https://hulu.com";
    }
}
