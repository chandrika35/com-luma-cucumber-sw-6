package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping Cart']")
    WebElement getTextShoppingCart;
    @CacheLookup
    @FindBy(xpath = "(//a[text()='Cronus Yoga Pant '])[2]")
    WebElement getTextOfProductName;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement getTextOfProductSize;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement getTextProductColour;

    @CacheLookup
    @FindBy(xpath = "(//a[text()='Overnight Duffle'])[2]")
    WebElement getTextBagName;

    @CacheLookup
    @FindBy(xpath = "//input[@value = '3']")
    WebElement getTextOfQty;

    @CacheLookup
    @FindBy(xpath = "(//span[text()='$135.00'])[4]")
    WebElement getPriceOfProduct;

    @CacheLookup
    @FindBy(xpath = "//input[@class='input-text qty']")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Update Shopping Cart')]")
    WebElement updateCart;

    @CacheLookup
    @FindBy(xpath = "(//span[@class='price'])[12]")
    WebElement getTextOfProductPrice;


    public String verifyTextShoppingCart() {
        log.info("Get Text Shopping cart" + getTextShoppingCart.toString());
        return getTextFromElement(getTextShoppingCart);
    }

    public String verifyProductName() {
        log.info("Get Text Product Name" + getTextOfProductName.toString());
        return getTextFromElement(getTextOfProductName);
    }

    public String verifyProductSize() {
        log.info("Verify product size" + getTextOfProductSize.toString());
        return getTextFromElement(getTextOfProductSize);
    }

    public String verifyProductColour() {
        log.info("Verify product colour" + getTextProductColour.toString());
        return getTextFromElement(getTextProductColour);
    }

    public String verifyTextBagName() {
        log.info("Get text bag name" + getTextBagName.toString());
        return getTextFromElement(getTextBagName);
    }

    public String verifyQtyOfProduct() {
        WebElement actualElement = getTextOfQty;
        String actualQty = actualElement.getAttribute("value");
        log.info("Verify Qty of product" + getTextOfQty.toString());
        return actualQty;
    }

    public String verifyProductPrice() {
        log.info("Verify price of product" + getPriceOfProduct.toString());
        return getTextFromElement(getPriceOfProduct);
    }

    public void changeQtyOfProduct() {
        clickOnElement(changeQty);
        changeQty.clear();
        sendTextToElement(changeQty, "5");
        log.info("Change Qty of Product" + changeQty.toString());
    }

    public void updateShoppingCart() {
        log.info("Update shopping cart" + updateCart.toString());
        clickOnElement(updateCart);
    }

    public String verifyUpdatedProductPrice() {
        log.info("Verify product price is updated" + getTextOfProductPrice.toString());
        return getTextFromElement(getTextOfProductPrice);
    }
}

