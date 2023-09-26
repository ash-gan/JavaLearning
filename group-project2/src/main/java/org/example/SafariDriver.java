package org.example;

public class SafariDriver implements WebDriver, RemoteWebDriver, TakeScreenshot{


    @Override
    public void navigate() {
        System.out.println("this is navigating from Safari browser");
    }

    @Override
    public void getScreenshot() {
        System.out.println("this is taking screen shot from Safari browser");
    }

    @Override
    public void open() {
        System.out.println("opening web site from Safari browser");
    }

    @Override
    public void close() {
        System.out.println("Closing web site from Safari browser");
    }

    @Override
    public String getTitle() {
        return "https://disney.com";
    }
}
