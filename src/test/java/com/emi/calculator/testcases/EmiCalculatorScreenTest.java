package com.emi.calculator.testcases;

import com.emi.calculator.screens.EmiCalculatorScreen;
import com.emi.calculator.screens.EmiDetailScreen;
import com.emi.calculator.screens.HomeScreen;
import com.emi.calculator.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiCalculatorScreenTest extends BaseTest{
    EmiCalculatorScreen emiCalculatorScreen;
    EmiDetailScreen emiDetailScreen;
    private int amount = 100000;
    @Test(priority = 0)
    public void calculatorEmiShouldSucceed(){
        emiCalculatorScreen = screen.getInstance(HomeScreen.class)
                .tapOnCalculatorScreenBtn();
        emiCalculatorScreen = emiCalculatorScreen
                .fillAmount(500000)
                .fillInterest(5)
                .fillYears(2)
                .fillMonths(6)
                .fillProcessingFee(2)
                .tapOnCalculatorBtn();

        Assert.assertTrue(emiCalculatorScreen.hasDetailBtn());
    }
    @Test(priority = 1)
    public void resetShouldSucceed(){
        emiCalculatorScreen = emiCalculatorScreen
                .fillAmount(100000)
                .fillInterest(5)
                .fillYears(1)
                .fillMonths(2)
                .fillProcessingFee(2)
                .tapOnResetBtn();
        General.waitForReset();
    }

    @Test(priority = 2)
    public void checkDetailShouldSucceed(){
        emiCalculatorScreen = emiCalculatorScreen
                .fillAmount(amount)
                .fillInterest(5)
                .fillYears(1)
                .fillMonths(2)
                .fillProcessingFee(2)
                .tapOnCalculatorBtn();
        Assert.assertTrue(emiCalculatorScreen.hasDetailBtn());

        emiDetailScreen = emiCalculatorScreen
                .tapOnDetailsBtn();

        Assert.assertTrue(emiDetailScreen.hasDetailsLayout());
    }

    @Test(priority = 3)
    public void checkDetailScreenAmount(){
        Assert.assertEquals(amount, emiDetailScreen.getLoanAmount());
    }

    @Test(priority = 4)
    public  void clickBackBtnShouldSucceed(){
        emiCalculatorScreen = emiDetailScreen
                .clickBackBtn();
        Assert.assertTrue(emiCalculatorScreen.hasDetailBtn());
    }
}
