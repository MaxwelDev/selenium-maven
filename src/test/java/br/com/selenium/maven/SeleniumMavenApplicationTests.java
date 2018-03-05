package br.com.selenium.maven;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class SeleniumMavenApplicationTests {

	private WebDriver driver;

    @Before
    public void iniciaNavegador() {
        if (System.getProperty("phantomjs.binary.path") != null) {

            iniciaPhantomJs();

        } else if (System.getProperty("webdriver.chrome.driver") != null) {

            iniciaChrome();
        } else {

            throw new RuntimeException("Nao eh possivel determinar o navegador para execucao dos testes.");

        }

    }

	@Test
	public void contextLoads() {

	}

    private void iniciaChrome() {
        driver = new ChromeDriver();
    }

    private void iniciaPhantomJs() {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setJavascriptEnabled(true);
        driver = new PhantomJSDriver(dc);
    }
}
