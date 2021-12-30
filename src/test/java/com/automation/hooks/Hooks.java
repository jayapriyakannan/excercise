package com.automation.hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.*;

import static com.codeborne.selenide.Selenide.open;


public class Hooks {


    @Before()
    public void initUi(){
        Configuration.browser="chrome";
        Configuration.headless=false;
        Configuration.pageLoadTimeout=20000;
        Configuration.timeout=20000;
        open("https://www.automationexercise.com");
    }

   @After()
    public void teardown(){

   }

}
