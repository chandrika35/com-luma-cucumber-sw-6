package com.luma.steps;

import com.luma.browserfactory.ManageBrowser;
import com.luma.pages.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class WomenTestSteps extends ManageBrowser {
    @When("^I mouse hover to Women menu$")
    public void iMouseHoverToWomenMenu() throws InterruptedException {
        Thread.sleep(2000);
        new Homepage().mouseHoverToWomenMenu();
    }

    @And("^I mouse hover to Tops menu$")
    public void iMouseHoverToTopsMenu() {
        new Homepage().mouseHoverToTopMenu();
    }


    @And("^I click on Jackets menu$")
    public void iClickOnJacketsMenu() {
        new Homepage().clickOnJacket();
    }

    @And("^I Select Sort By filter Product Name$")
    public void iSelectSortByFilterProductName() {

    }

    @Then("^I should see products name display in alphabetical order$")
    public void iShouldSeeProductsNameDisplayInAlphabeticalOrder() {
        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        ArrayList<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement e : jacketsElementsList) {
            jacketsNameListBefore.add(e.getText());
        }
        System.out.println(jacketsNameListBefore);
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);
        new Homepage().verifySortByProductName();
        List<String> expectedList = new Homepage().afterSortingByProductName();
        List<String> actualList = new Homepage().defaultProductList();
        Assert.assertEquals(expectedList, actualList, "Not Displayed");
    }

    @And("^I Select Sort By filter Price$")
    public void iSelectSortByFilterPrice() {

    }

    @Then("^I should see products price display in Low to High$")
    public void iShouldSeeProductsPriceDisplayInLowToHigh() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        ArrayList<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement e : jacketsElementsList) {
            jacketsPriceListBefore.add(Double.valueOf(e.getText().replace("$", "")));
        }
        System.out.println(jacketsPriceListBefore);
        new Homepage().verifySortByPrice();
        Thread.sleep(1000);
        List<Double> expectedList = new Homepage().afterSortingByProductsPriceList();
        List<Double> actualList = new Homepage().defaultProductsPriceList();
        Assert.assertEquals(expectedList, actualList);
    }


}