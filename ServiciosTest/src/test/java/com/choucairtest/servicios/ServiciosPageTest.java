package com.choucairtest.servicios;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiciosPageTest {

	private WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");

	}

	@Test
	public void testServiciosLink() {

		// Ir a Servicios
		driver.findElement(By.linkText("Servicios")).click();

		// Verificar texto
		String expectedText = "Encuentre en Choucair a su aliado estratégico para triunfar en el nuevo entorno digital, a través de nuestro modelo de capacidades para la configuración de servicios relacionados con pruebas de software centradas en el negocio.";
		String actualText = "";
		actualText = driver.getTitle();

		// Comparar textos
		assertEquals(expectedText, actualText);

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
