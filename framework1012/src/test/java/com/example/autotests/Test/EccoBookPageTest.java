package com.example.autotests.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.autotests.pages.EccoShoesPage;
import dev.failsafe.internal.util.Assert;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EccoShoesPageTest {
    private final EccoShoesPage eccoShoesPage = new EccoShoesPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1920x1080";
        SelenideLogger.addListener("allure", new AllureSelenide());


    }

    @BeforeEach
    public void setUp() throws InterruptedException {
        eccoShoesPage.openPage();
    }


    @Test
    public void Search() throws InterruptedException {
        sleep(1000);
        eccoShoesPage.SearchText(eccoShoesPage.SearchArea,"Заводной апельсин");
    }

    @Test
    public void ReadBook() throws InterruptedException {
        eccoShoesPage.ReadBook("Заводной апельсин");
    }
    @Test
    public void DownBook() throws InterruptedException {
        eccoShoesPage.DownBook("Заводной апельсин");
    }

    @Test
    public void Avtor() throws InterruptedException {
        eccoShoesPage.Auth("Энтони Роберт");
    }
    @Test
    public void EnterV() throws InterruptedException {
        eccoShoesPage.EnterGoogle("liza17012003.lv@gmail.com","!2169!10!");
    }


    @Test
    public void AddItemInBasket() {
        eccoShoesPage.EnterGoogle("liza17012003.lv@gmail.com","!2169!10!");
        eccoShoesPage.openProf();
        eccoShoesPage.addBooksInBasket("Заводной апельсин");
    }
    @Test
    public void RemovesFromBook() {
        eccoShoesPage.openProf();
        eccoShoesPage.removeFromBook();
    }

    @Test
    public void Favorite() {

        eccoShoesPage.addToFavorite();

        Assert.isTrue(eccoShoesPage.favResult.getText().equals("To permanently save your wishlist please login or sign up."), "Your wishlist is empty!'");
    }

    @Test
    public void removeFavorite() {

        eccoShoesPage.addToFavorite();
        eccoShoesPage.removeFromFavorite();
        Assert.isTrue(eccoShoesPage.favResultForRemove.getText().equals("Your wishlist is empty!"), "To permanently save your wishlist please login or sign up.");
    }
 /*   @Test
    public void FindVeganFriendly() {
        eccoShoesPage.FindVeganFriendly();
        Assert.isTrue(eccoShoesPage.veganRes.getText().equals("Vegan"), "Header text is not equal to 'Vegan'");
    }
*/
 @Test
 public void FindRedLowPrice() {

     eccoShoesPage.FindRedLowPrice();
     sleep(3000);
     Assert.isTrue(!eccoShoesPage.cartcount.getText().equals("( 0 )"), "1");
 }

 @Test
    public void JoinMaillingLIst_valid() throws InterruptedException{
     eccoShoesPage.Subscription(eccoShoesPage.mailArea,("user1@gmail.com"));
     sleep(3000);
     Assert.isTrue(!eccoShoesPage.cartcount.getText().equals("( 0 )"), "1");
 }

    @Test
    public void JoinMaillingLIst_NotValid() throws InterruptedException{
        eccoShoesPage.Subscription(eccoShoesPage.mailArea,("user1@gmail"));
        sleep(3000);
        Assert.isTrue(eccoShoesPage.cartcount.getText().equals("( 0 )"), "1");
    }

}