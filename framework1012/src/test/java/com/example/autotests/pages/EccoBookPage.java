package com.example.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class EccoShoesPage {


    public final String URL = "https://readli.net/";
    public final String URL1 = "https://readli.net/profile/686157419/";
    public final SelenideElement entrpar = $x("//*[@class='whsOnd zHQkBf']");
    public final SelenideElement nex = $x("//*[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']");
    public final SelenideElement gog = $x("//*[@class='socials-1__link socials-1__link_icon-4 button-blue']");
    public final SelenideElement en = $x("//*[@class='header-user__button button button-white']");
    public final SelenideElement EnterGoG = $x("//*[@class='Xb9hP']");
    public final SelenideElement span = $x("//h1");
    public final SelenideElement lupa = $x("//*[@id='search-book-button']");
    public final SelenideElement au = $x("//*[@class='header-nav__link header-nav__link_icon-2']");
    public final SelenideElement book = $x("//*[@class='ellip']");

    public final SelenideElement book2 = $x("//*[@class='book__image search_res_img_list']");
    public final SelenideElement like = $x(" //span[@class='button-like__cols']");
    public final SelenideElement check = $x("//*[@class='header-events__button header-evt-but-mob']");

    public final SelenideElement bibleo = $x("//*[@class='tabs-nav-2__link']");
    public final SelenideElement mmain = $x("//*[@class='header-logo']");
    public final SelenideElement bibl = $x("//*[@class='add-remove js-library']");
    public final SelenideElement readd = $x("//a[@class='book-actions__button button']");
    public final SelenideElement down = $x("//*[@class='download__link']");
    public final SelenideElement SearchArea = $x("//*[@id='search-book']");

    public final SelenideElement SearchAv = $x("//*[@id='search-author']");
    public final SelenideElement size = $x("//li[@data-size='36']");
    public final SelenideElement ShoesLink = $x("//img[@alt='Ashes-100']");
    public final SelenideElement MainPage  = $x("//img[@class='logo']");
    public final SelenideElement addInBasketBtn = $x("//*[@id='product-add-to-cart']");
    public final SelenideElement cartcount = $x("//*[@id='cartCount']");
    public final SelenideElement ShopPage  = $x("//li[@class='dropdown mega-menu']");
    public final SelenideElement busketBtn =$x("//a[@id='cartToggle']");
    public final SelenideElement removeButton = $x("//a[@class='remove']");
    public final SelenideElement favPage = $x("//a[@class='wk-link wk-filled']");
    public final SelenideElement favBtn = $x("//*[@class='wk-button-collection wk-add-product']");
    public final SelenideElement favResult = $x("//p[@class='wk-span12 wk-login-note']");
    public final SelenideElement removeFav = $x("//button[@title='Remove from Wishlist']");
    public final SelenideElement favResultForRemove = $x("//h3[@class='wk-wishlist-empty-note']");
    public final SelenideElement veganfriendly = $x("//a[text()='Vegan Friendly']");
    public final SelenideElement veganRes = $x("//h2");
    public final SelenideElement lowPrice = $x("//a[@data-select ='price-ascending']");
    public final SelenideElement red = $x(" //span[@style='background-color: #c10006;']");
    public final SelenideElement redRes = $x(" //img[@alt='Yeti-08']");
    public final SelenideElement whatsNew = $x("//li[@class='dropdown ']");
    public final SelenideElement mailArea = $x("//input[@id='email_6822372']");
    public final SelenideElement signInBtn = $x("//*[@class='needsclick go3894874857 kl-private-reset-css-Xuajs1']");


//    public final SelenideElement shippingBtn = $x(" //*[@class='gep-switcher-text gep-switcher-text-desktop']");
//    public final SelenideElement  country =$x("//option[@value='TR']");
//    public final SelenideElement  countryMenu =$x("//select[@aria-label='Change your shipping country']");
//    private By driver;
//    Select select = new Select(driver.findElement(By.xpath("//select[@aria-label='Change your shipping country']");

    public void clickOnElement(SelenideElement element){
        element.click();
    }
    public void setValueOnInput(SelenideElement inputElement,String Value){
        inputElement.setValue(Value);
    }
    public void PressSearchButton(SelenideElement element){
        element.sendKeys(Keys.ENTER);
    }
    public void hoverOnElement(SelenideElement element) {
        element.hover();
    }
    public void goToShopPage() {
        clickOnElement(ShopPage);
    }
    public void openPage() {
        open(URL);
    }
    public void openProf() {
        open(URL1);
    }
    public void selectCountry(SelenideElement element) {element.selectOptionByValue();}

    public void EnterGoogle(String Value, String Value2)  {
        clickOnElement(en);
        sleep(100);
        clickOnElement(gog);
        sleep(100);
        setValueOnInput(entrpar,Value);
        clickOnElement(nex);
        sleep(100);
        setValueOnInput(entrpar,Value2);
        sleep(100);
        clickOnElement(nex);
    }

    public void SearchText(SelenideElement inputElement,String Value)  {
        clickOnElement(lupa);
        setValueOnInput(SearchArea,Value);
        PressSearchButton(SearchArea);

    }
    public void ReadBook(String Value)  {
        clickOnElement(lupa);
        sleep(100);
        setValueOnInput(SearchArea,Value);
        PressSearchButton(SearchArea);
        sleep(100);
        clickOnElement(book);
        sleep(100);
        clickOnElement(readd);
    }

    public void DownBook(String Value) {
        clickOnElement(lupa);
        sleep(200);
        setValueOnInput(SearchArea,Value);
        PressSearchButton(SearchArea);
        sleep(200);
        clickOnElement(book);
        sleep(200);
        clickOnElement(down);
    }
    public void Auth(String Value) {
        clickOnElement(au);
        sleep(200);
        setValueOnInput(SearchAv,Value);
        PressSearchButton(SearchAv);
        sleep(200);

    }

    public void addBooksInBasket(String Value){
        clickOnElement(mmain);
        clickOnElement(lupa);
        setValueOnInput(SearchArea,Value);
        PressSearchButton(SearchArea);
        clickOnElement(book);
        sleep(100);
        clickOnElement(bibl);

    }

    public void goToMainPage() {
        clickOnElement(MainPage);
    }

    public void removeFromBook(){
       // goToMainPage();
        sleep(200);
        clickOnElement(bibleo);
        sleep(200);
    }
    

    public void LikeFromBook(String Value){
        clickOnElement(lupa);
        sleep(100);
        setValueOnInput(SearchArea,Value);
        PressSearchButton(SearchArea);
        sleep(100);
        clickOnElement(book2);
        sleep(100);
        clickOnElement(like);
    }
    
    public void CheckNotificationn(){
        clickOnElement(check);
    }

}