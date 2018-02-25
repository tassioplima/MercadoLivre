package funcionalidades;

import org.openqa.selenium.WebDriver;

import pageobjects.PaginaInicial;
import util.Navegation;

public class PaginaInicialFuncionalidade {
	private WebDriver driver;
	private PaginaInicial pagInicial;
	private String url = "https://www.mercadolivre.com.br/";

	public PaginaInicialFuncionalidade() {
		driver = Navegation.getChromeDriver();
		pagInicial = new PaginaInicial(driver);
	}

	public void goToLogin() {
		driver.get(url);
	}

	public boolean isPaginaInicial() {
		if (pagInicial.getUrl().contains("mercadolivre"))
			return true;
		return false;
	}
	
	public void selecionarCategoriaMercado(String categoria){
		try{
			pagInicial.clickCategoriaTecnologia();
			pagInicial.clickSelecionaCategoria(pagInicial.getSelecionaCategoria(categoria));
		}catch(Exception e){
			System.out.println(e.getMessage());
			driver.quit();			
		}
	}
	
}
