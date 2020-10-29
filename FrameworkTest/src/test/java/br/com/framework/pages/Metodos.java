package br.com.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Metodos {
	WebDriver driver;

	public void navegdor(String url, String navegador) {
		if (navegador == "CHROME" || navegador == "FIREFOX") {
			if (navegador == "CHROME") {
				System.setProperty("webdriver.chrome.driver", "c://Drivers//chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			} else if (navegador == "CHROME") {
				System.setProperty("webdriver.gecko.driver", "c://Drivers//geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}
		} else {
			System.out.println("Digite CHROME ou FIREFOX");
			System.out.println("ola");
		}
	}

}
