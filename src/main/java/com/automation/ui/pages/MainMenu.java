package com.automation.ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.springframework.context.annotation.Configuration;

import static com.codeborne.selenide.Selenide.$x;

@Configuration
public class MainMenu {

    public static SelenideElement linkSignupOrLogin = $x("//a[normalize-space(text())='Signup / Login']");
    public static SelenideElement linkHome = $x("//a[normalize-space(text())='Home']");


    public void navigateToSignupOrLoginPage() {
        linkSignupOrLogin.click();
    }

    public void navigateToHomePage() {
        linkHome.click();
    }

}
