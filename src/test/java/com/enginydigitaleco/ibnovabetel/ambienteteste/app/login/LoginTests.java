package com.enginydigitaleco.ibnovabetel.ambienteteste.app.login;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@DisplayName("Teste Automatizado da Funcionalidade Login do Sistema de Gestão de Igrejas")
public class LoginTests {
    @Test
    @DisplayName("Fazer Login no App via Recorder")
    public void testFazerLoginnoAppviaRecorder(){

        // Abrir o navegador
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        // Acessar endereço da aplicação NovaBetel
        navegador.get("https://www.ambienteteste.ibnovabetel.enginydigitaleco.com/#/home");

        // Clicar no Campo "ion-input-0" para digitar E-mail
         navegador.findElement(By.name("ion-input-0")).sendKeys("jtalson19@gmail.com");


        // Clicar no campo "ion-input-1" parar digitar Senha
         navegador.findElement(By.name("ion-input-1")).sendKeys("Tester@3");

        // clicar no botão "Entrar"
        // Executar um clique usando JavaScript no elemento funcional do botão
        JavascriptExecutor executor = (JavascriptExecutor) navegador;
        executor.executeScript("arguments[0].click();", navegador.findElement(By.xpath("//ion-label[text()='Entrar']")));


    }
}
