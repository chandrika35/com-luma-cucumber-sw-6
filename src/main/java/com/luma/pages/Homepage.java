package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Women')])[1]")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Tops')])[1]")
    WebElement topsMenu;

    @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Jackets')])[1]")
    WebElement jacket;

    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Men')]")
    WebElement menMenu;

    @CacheLookup
    @FindBy(xpath = "(//span[text()='Bottoms'])[2]")
    WebElement bottomMenu;

    @CacheLookup
    @FindBy(xpath = "(//span[text()='Pants'])[2]")
    WebElement pant;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Gear')]")
    WebElement gearMenu;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Bags')]")
    WebElement bag;

    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(xpath = "//span[@class='price-wrapper ']//span")
    List<WebElement> priceList;

    public void mouseHoverToWomenMenu() {
        log.info("Mouse hover to women menu" + womenMenu.toString());
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverToTopMenu() {
        log.info("Mouse hover to top menu" + topsMenu.toString());
        mouseHoverToElement(topsMenu);
    }

    public void clickOnJacket() {
        log.info("Click on Jacket" + jacket.toString());
        mouseHoverToElementAndClick(jacket);
    }

    public void verifySortByProductName() {
        log.info("Verify product displayed sort by Product name" + sortBy.toString());
        selectByValueFromDropDown(sortBy, "name");
    }

    public void verifySortByPrice() {
        log.info("Verify Product display sort by Price" + sortBy.toString());
        selectByValueFromDropDown(sortBy, "price");
    }

    public void mouseHoverToMenMenu() {
        log.info("Mouse hover to Men menu" + menMenu.toString());
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverToBottomMenu() {
        log.info("Mouse hover to Bottom menu" + bottomMenu.toString());
        mouseHoverToElement(bottomMenu);
    }

    public void mouseHoverAndClickOnPantMenu() {
        log.info("Mouse hover to Pant menu and Click" + pant.toString());
        mouseHoverToElementAndClick(pant);
    }

    public void mouseHoverToGearMenu() {
        log.info("Mouse hover to Gear menu" + gearMenu.toString());
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBag() {
        log.info("Click on Bag" + bag.toString());
        clickOnElement(bag);
    }

    public ArrayList<String> defaultProductList() {
        List<WebElement> jacketsElementsList = productList;
        ArrayList<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement e : jacketsElementsList) {
            jacketsNameListBefore.add(e.getText());
        }
        System.out.println(jacketsNameListBefore);
        log.info("Default Product List" + productList.toString());
        return jacketsNameListBefore;

    }

    public ArrayList<String> afterSortingByProductName() {
        List<WebElement> jacketElementsList = productList;
        ArrayList<String> jacketNameAfter = new ArrayList<>();
        for (WebElement value : jacketElementsList) {
            jacketNameAfter.add(value.getText());
        }
        System.out.println(jacketNameAfter);
        log.info("Product list after sort by Product name" + productList.toString());
        return jacketNameAfter;
    }

    public ArrayList<Double> defaultProductsPriceList() {
        List<WebElement> jacketsElementsList = priceList;
        ArrayList<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement e : jacketsElementsList) {
            jacketsPriceListBefore.add(Double.valueOf(e.getText().replace("$", "")));
        }
        System.out.println(jacketsPriceListBefore);
        log.info("Default Product list" + priceList.toString());
        return jacketsPriceListBefore;
    }


    public ArrayList<Double> afterSortingByProductsPriceList() {
        List<WebElement> jacketElementsList = priceList;
        ArrayList<Double> jacketPriceAfter = new ArrayList<>();
        for (WebElement value : jacketElementsList) {
            jacketPriceAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        System.out.println(jacketPriceAfter);
        log.info("Product list after sort by Price" + priceList.toString());
        return jacketPriceAfter;
    }
}
