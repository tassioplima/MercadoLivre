package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscarPage extends Page {

	public WebElement getValorProduto(WebElement elemento) {
		WebElement elementoValorProduto = null;
		try {
			elementoValorProduto = elemento.findElement(By.xpath(".//*[contains(@class,'item__price ')]"));
		} catch (NoSuchElementException e) {
			elementoValorProduto = null;
			System.err.println("Anuncio sem valor.");

		}
		return elementoValorProduto;
	}

	public BuscarPage(WebDriver driver) {
		super(driver);
	}

	public List<WebElement> getGridResultadosBusca() {
		List<WebElement> listaElementos;
		return listaElementos = driver
				.findElements(By.xpath(".//*[contains(@class,'results-item article stack')]"));
	}

	public void setCampoBuscar(String produto) {
		getCampoBuscar().sendKeys(produto);
	}

	public WebElement getCampoBuscar() {
		return getElement(".//input[contains(@class, 'placeholder')]");
	}

	public WebElement getBotaoBuscar() {
		return getElement(".//input[contains(@class, 'btn-search')]");
	}

	public void clickBotaoBuscar() {
		getBotaoBuscar().click();
	}

	public WebElement getTituloProduto(WebElement elemento) {
		WebElement tituloProduto = elemento.findElement(By.xpath(".//*[contains(@class,'item__title list-view-item-title')]"));
		return tituloProduto;
	}

	public WebElement getPaginacao(String pag) {
		return getElement(".//*[contains(@class,'pagination__page')]/following::a[contains(text(),'"+pag+"')]");
	}

	public void clickPaginacao(String pag) {
		getPaginacao(pag).click();
	}
}
