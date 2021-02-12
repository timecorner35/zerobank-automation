package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{
    @FindBy(xpath = "//tr/td/a")
    public WebElement savings;

    @FindBy(xpath = "(//tr/td/a)[3]")
    public WebElement brokarage;

    @FindBy(xpath = "(//tr/td/a)[4]")
    public WebElement checking;

    @FindBy(xpath = "(//tr/td/a)[5]")
    public WebElement creditCard;

    @FindBy(xpath = "(//tr/td/a)[6]")
    public WebElement loan;

    @FindBy(xpath = "//div//h2")
    public List<WebElement> accountTypes;

    @FindBy(xpath = "(//div/div/div)[15]//div/table/thead/tr/th")
    public List<WebElement> creditRows;

    public void navigateTo(String s) {
        Driver.get().findElement(By.xpath("//*[.='" + s + "']")).click();


    }
}
