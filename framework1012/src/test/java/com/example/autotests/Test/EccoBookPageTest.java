package com.example.autotests.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.autotests.pages.EccoBookPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class EccoBookPageTest {
    private final EccoBookPage eccoShoesPage = new EccoBookPage();

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
        eccoShoesPage.EnterGoogle("liza17012003.lv@gmail.com","!10!2169!");
    }


    @Test
    public void AddItemInBasket() {
        eccoShoesPage.openProf();
        eccoShoesPage.addBooksInBasket("Заводной апельсин");
    }
    @Test
    public void RemovesFromBook() {
        eccoShoesPage.openProf();
        eccoShoesPage.removeFromBook();
    }

 @Test
    public void TagFromBook() {
        eccoShoesPage.openProf();
        eccoShoesPage.TagFromBook("Межпланетная связь");
    }    


 @Test
    public void CheckJanr() {
     eccoShoesPage.openPage();
     eccoShoesPage.CheckJanr();
    }    



  

}