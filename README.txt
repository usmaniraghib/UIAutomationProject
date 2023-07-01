
// Set the driver path
// Selenium Version 3.X
//        System.setProperty("webdriver.chrome.driver","C:\\SELENIUM\\browser-driver\\chromedriver_win32\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

//By adding webdrivermanager-4.X Jars, no need to set the driver path.
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

//By adding webdrivermanager-5.X Jars, no need to set the driver path.
//        WebDriver driver = WebDriverManager.chromedriver().create();

//Chrome 113.X
//Selenium Version 4.7.2
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

//Chrome 113.X
//Selenium Version 4.8.2 and 4.8.3
//        WebDriver driver = new ChromeDriver();

//In Selenium-4.8.0 below functionality is Depricated
        /*1) implicitWait
        2) WebDriverWait [ExplicitWait]
        3) pageLoadTimeout
        4) headless
        5) DesireCapabilities*/

//NOT POSSIBLE
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);

//        WebDriverWait explicitlyWait = new WebDriverWait(driver, 30);
//        WebElement fromDateButton = explicitlyWait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_view_date1")));
//        fromDateButton.click();

//        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(true);
//        options.setHeadless(false);

//        DesiredCapabilities dc = new DesiredCapabilities();
//        dc.setBrowserName("chrome");
//        dc.setPlatform(Platform.WINDOWS);
//        URL hubURL = new URL("http://192.168.1.95:4444/wd/hub");
//        WebDriver remoteDriver = new RemoteWebDriver(hubURL,dc);

//POSSIBLE In below way:-
//        Duration duration = Duration.ofSeconds(30);
//        driver.manage().timeouts().implicitlyWait(duration);
//        driver.manage().timeouts().pageLoadTimeout(duration);

//        Duration duration = Duration.ofSeconds(3000);
//        WebDriverWait explicitlyWait = new WebDriverWait(driver, duration);
//        WebElement fromDateButton = explicitlyWait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_view_date1")));
//        fromDateButton.click();

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless=new");

//        ChromeOptions options = new ChromeOptions();
//        options.setCapability("browserName","chrome");
//        options.setCapability("platformName","Windows 11");
//        URL hubURL = new URL("http://192.168.1.95:4444/wd/hub");
//        WebDriver remoteDriver = new RemoteWebDriver(hubURL,dc);