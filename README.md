# How to run the Test #

**Prerequisite**
1. Java environment 
2. Maven 


**Note: Configure web-driver path and test email address.**
	

- Configure webdriver.
    - I used ChromeDriver but you can choose other webdriver eg. Mozilla GeckoDriver 
    - So first download ChromeDriver from [http://chromedriver.chromium.org/downloads](http://chromedriver.chromium.org/downloads).
    - Copy your downloaded **chromedriver.exe** file path.
    - Go to `E2EUserJourney\src\test\java\testcases\mytheresa\WebdriverSettings.java` file.
    - Paste the copied file path in `System.setProperty("webdriver.chrome.driver","Paste path here")`.


- Configure test email address.
    - Change the value of `USER_EMAIL` in `E2EUserJourney\src\main\java\variables\mytheresa\UserVariables.java` 
    - Note: with same email address you can not create account , so please change the email address before every run of the test. 

	
Project is ready to run. Execute following commands and enjoy the automatic web-driver test.
- Go to project path in terminal. For example: C:\Users\User-Name\eclipse-workspace\E2EUserJourney>
- Run `mvn clean`
- Run `mvn compile`
- Run `mvn test`

You can find the test result in `E2EUserJourney\target\surefire-reports\index.html`.