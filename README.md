# Allure Reporting with Gradle + TestNG + Selenium + JAVA
This is demo project with TestNG + Selenium + JAVA and reporting tool as Allure.

## Pre-Requisite
 - Java 8 or above
 - Gradle 6.6 or above
 - Eclipse

## Installation 
#### Install Allure in Windows
1. Open Windows PowerShell and install scoop. Refer: https://scoop.sh/ 
2. Now Install Allure using : ```scoop install allure```
3. Allure should get installed. Check Allure version with ```allure --verion``` command.

![Screenshot 2022-01-10 200147](https://user-images.githubusercontent.com/15075144/148789208-1b18736e-172d-4386-b6de-e5dc31b91f63.jpg)

## Execution
1. Clone this repository. 
2. Go to terminal and run test using : ```gradle clean test```
3. Go to build directory using ```cd build``` and Generate Allure report using : ```allure generate allure-results --clean -o allure-report```
4. Now Generate result from Allure report using : ```allure serve allure-results```
  
<img src="https://user-images.githubusercontent.com/15075144/148789118-94f8c474-53b0-4fcd-a5a4-2ed04112a962.jpg" width="800" height="400">

## Result

Using Allure reporting you can generate different reports along with detailed test description and steps in the reporting. Enjoy!

![result](https://user-images.githubusercontent.com/15075144/148792703-484e138f-3dd0-4577-801d-4fbab3a08a6a.gif)

![Screenshot 2022-01-10 203530](https://user-images.githubusercontent.com/15075144/148791526-af04c463-c277-4f54-8cdf-b5e0813150eb.jpg)

![Screenshot 2022-01-10 203558](https://user-images.githubusercontent.com/15075144/148791613-ea7d1251-2f9b-4869-9625-70390b1259d9.jpg)


