# Big-Data-Analytics
This repository contains Data Analysis Example of Lab of NITT
## Problem 1 : Word Count in file
## Problem 2: A dataset is given in which record has two attributes
            Date                 Temperature 
            dd-mm-yyyy(format)   Degree Celsius
            11-11-2018             33
            29-05-2019             52
            08-04-2015             19
            11-08-2018             49
            07-06-2015             49
            23-12-2015             52
            13-06-2015             28
            14-02-2017             22
            12-11-2018             51
## we have to process the data and find out maximum temperature in corresponding year
## sample output
            Year                        Max Temperature
            2018                        51
            2019                        52
            2015                        52
            2017                        22
## sample dataset for processing
 (https://drive.google.com/file/d/1YdwfKn92fSN6kULuGCmHBN5VHJWnduiK/view?usp=drive_link)
## Simple steps to perform
            step 1 : Make new java maven project and add dependencies in pom.xml file as we have done in Word Count
            step 2 : Write Mapper, Reducer, Driver (Runner) class
            step 3 : clean and build project with maven clean followed by maven install
            step 4 : take jar file and run it in hadoop cluster
