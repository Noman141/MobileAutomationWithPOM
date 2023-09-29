package com.emi.calculator.testcases;

import com.emi.calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeScreenTest extends BaseTest{
    @Test
    public void checkEmiCalculatorBtnShouldSucceed(){
        HomeScreen homeScreen = screen.getInstance(HomeScreen.class);
        Assert.assertTrue(homeScreen.hasEmiCalculatorBtn());
    }
    @Test
    public void checkCompareLoanBtnShouldSucceed(){
        HomeScreen homeScreen = screen.getInstance(HomeScreen.class);
        Assert.assertTrue(homeScreen.hasCompareLoanBtn());
    }
}
