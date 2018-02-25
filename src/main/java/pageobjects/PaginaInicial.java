package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginaInicial extends Page {

	public PaginaInicial(WebDriver driver) {
		super(driver);
	}

	public WebElement getSelecionaCategoria(String categoria) {
		

		return getElement(".//a[text()='"+categoria+"']");
	}
	
	
	public WebElement getCategoriaTecnologia(){
		
		return getElement(".//a[contains(@class,'nav-menu-categories-link')]");
	}
	public void clickCategoriaTecnologia(){
		
		getCategoriaTecnologia().click();
		
	}
	
	
	public void clickSelecionaCategoria(WebElement elemento) {
		elemento.click();
	}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
	

	
}
