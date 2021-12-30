package com.automation.ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.springframework.context.annotation.Configuration;

import static com.codeborne.selenide.Selenide.$x;

@Configuration
public class Login {
    public static SelenideElement inpEmail =$x("//a[normalize-space(text())='Signup / Login']");
    public static SelenideElement inpPassword =$x("//h2[text()='Login to your account']/parent::div//input[@name= 'password']");
    public static SelenideElement btnLogin =$x("//h2[text()='Login to your account']/parent::div//button[@type= 'submit']");
    public static SelenideElement txtErrorMsg =$x("//h2[text()='Login to your account']/parent::div//p']");

public void login(String email, String password){
    inpEmail.setValue(email);
    inpPassword.setValue(password);
    btnLogin.click();
}

public String getErrorMessage(){
    if(txtErrorMsg.exists())
    return txtErrorMsg.getText();
    return "";
}

}
