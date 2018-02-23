package br.com.selenium.maven;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class SeleniumMavenApplicationTests {

	private WebDriver driver;

    @Before
    public void iniciaNavegador() {
        System.setProperty("webdriver.chrome.driver", "/home/peo_msilva/Documents/stash/chromedriver");
    }

	@Test
	public void contextLoads() {
        iniciaChrome();
	}

    private void iniciaChrome() {
        driver = new ChromeDriver();
    }
}
