package com.emi.calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmiCalculatorScreen extends BaseScreen{
    private By btnDetail = By.id("btnDetail");
    public EmiCalculatorScreen(AndroidDriver driver) {
        super(driver);
    }

    public EmiCalculatorScreen fillAmount(int amount){
        WebElement etLoanAmount = getWebElement(By.id("etLoanAmount"));
        etLoanAmount.clear();
        etLoanAmount.sendKeys(String.valueOf(amount));
        return this;
    }

    public EmiCalculatorScreen fillInterest(int interest){
        WebElement etInterest = getWebElement(By.id("etInterest"));
        etInterest.clear();
        etInterest.sendKeys(String.valueOf(interest));

        return this;
    }
    public EmiCalculatorScreen fillYears(int years){
        WebElement etYears = getWebElement(By.id("etYears"));
        etYears.clear();
        etYears.sendKeys(String.valueOf(years));

        return this;
    }
    public EmiCalculatorScreen fillMonths(int months){
        WebElement etMonths = getWebElement(By.id("etMonths"));
        etMonths.clear();
        etMonths.sendKeys(String.valueOf(months));
        return this;
    }
    public EmiCalculatorScreen fillProcessingFee(int fee){
        WebElement etFee = getWebElement(By.id("etFee"));
        etFee.clear();
        etFee.sendKeys(String.valueOf(fee));
        return this;
    }

    public EmiCalculatorScreen tapOnCalculatorBtn(){
        getWebElement(By.id("btnCalculate")).click();
        return this;
    }
    public EmiCalculatorScreen tapOnResetBtn(){
        getWebElement(By.id("btnReset")).click();
        return this;
    }

    public EmiDetailScreen tapOnDetailsBtn(){
        getWebElement(btnDetail).click();
        return getInstance(EmiDetailScreen.class);
    }
    public boolean hasDetailBtn(){
        return getWebElements(btnDetail).size() > 0;
    }
}
