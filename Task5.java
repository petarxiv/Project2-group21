package Project2;

interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakesScreenShot {
    void getScreenShot();

}
interface RemoteWebDriver extends TakesScreenShot, WebDriver {
    void navigate();
}
class ChromeDriver implements RemoteWebDriver {
    @Override
    public void navigate() {

    }

    @Override
    public void getScreenShot() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}
class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void navigate() {

    }

    @Override
    public void getScreenShot() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}
class SafariDriver implements RemoteWebDriver {
    @Override
    public void navigate() {

    }

    @Override
    public void getScreenShot() {

    }

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public String getTitle() {
        return null;
    }
}
