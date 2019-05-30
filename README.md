# Additional TASKs to run this project #

**Prerequisite**
1. Java environment 

2. Maven 


**Note: Need to change in one code segment and in one variable's value.**
	

- You need to change in one code segment.
    - In this project I used ChromeDriver as my WebDriver. So first you download ChromeDriver from [http://chromedriver.chromium.org/downloads](http://chromedriver.chromium.org/downloads) this site.
    - Copy your downloaded ChromeDriver file's path from your PC.
    - Open this project.
    - Go to "Mytheresa\src\testcases\mytheresa\WebdriverSettings.java" file.
    - Paste the copied file path in **System.setProperty(" ","Paste path here")**.


- You need to change one variable's value.
    - Before every time you run this same code, please change one variable's value which is stored in 	**Mytheresa\src\variables\mytheresa\UserVariables.java** file and the variable's name is **USER_EMAIL**, as 	**Mytheresa's** web-site does not allow multiple registration with same email address.
 
	
Your project is ready to run. Run the below commands and enjoy the automatic web-driver task.
- Go to project path in terminal. For example: C:\Users\tofar\eclipse-workspace\E2EUserJourney>
- Run `mvn clean`
- Run `mvn compile`
- Run `mvn test`