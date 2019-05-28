# Additional TASKs to run this project #
1. Need to add **selenium-server-standalone-*.jar** in build path. Download this jar from [https://www.seleniumhq.org/download/](https://www.seleniumhq.org/download/).
   
   Also need to add all **selenium-server-*.jar** in build path. Download this jar from [https://jar-download.com/artifacts/org.seleniumhq.selenium/selenium-server](https://jar-download.com/artifacts/org.seleniumhq.selenium/selenium-server)
   
   Then add these jar files in this location:  
	**select project ->properties ->java build path ->libraries ->add external jar**

2. Configure eclipse with testNG tool:

    * Open eclipse

    * Go to "help"

    * Go to "install new software"
    
    * Paste [https://beust.com/eclipse](https://beust.com/eclipse) this link in "Work with" drop down text field

    * After few second, in the down part of this specific box, you can find one check box option with "TestNG" value. Please check this check box

    * Then click "Next"/ again "Next"/ Accept the license/ Click "Finish"    

3. Restart Your Eclipse

**Note: Need to change in one code segment and in one variable's value.**
	

- You need to change in one code segment.
    - In this project I used ChromeDriver as my WebDriver. So first you download ChromeDriver from [http://chromedriver.chromium.org/downloads](http://chromedriver.chromium.org/downloads) this site.
    - Copy your downloaded ChromeDriver file's path from your PC.
    - Open this project.
    - Go to "Mytheresa\src\testcases\mytheresa\WebdriverSettings.java" file.
    - Paste the copied file path in **System.setProperty(" ","Paste path here")**.


- You need to change one variable's value.
    - Before every time you run this same code, please change one variable's value which is stored in 	**Mytheresa\src\variables\mytheresa\UserVariables.java** file and the variable's name is **USER_EMAIL**, as 	**Mytheresa's** web-site does not allow multiple registration with same email address.
 
	
Your project is ready to run. Run your **testng.xml** file and enjoy the automatic web-driver task.