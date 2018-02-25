package funcionalidades;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.BuscarPage;
import util.Navegation;
import util.Print;

public class BuscarFuncionalidade {
	WebDriver driver;
	BuscarPage buscarProdPage;
	Print	printTela;

	public BuscarFuncionalidade() {
		driver = Navegation.getChromeDriver();
		buscarProdPage = new BuscarPage(driver);
		printTela = new Print();
	}
	
	

	public void realizaBusca(String produto) {
		try {
			buscarProdPage.setCampoBuscar(produto);
			buscarProdPage.clickBotaoBuscar();
			driver.wait(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void imprimindoResultadosGrid(int numeroLinha) {
		List<WebElement> listaElementos = buscarProdPage.getGridResultadosBusca();
		int cont = 1;
		System.out.println("Resultados: ");
		for (WebElement webElement : listaElementos) {
			System.out.println("Titulo: " + buscarProdPage.getTituloProduto(webElement).getText() + "\n");

			WebElement precoProduto = buscarProdPage.getValorProduto(webElement);
				if (precoProduto != null) {
				System.out.println("O Valor é : " + precoProduto.getAttribute("innerText") + "\n");
			}

				if (cont == numeroLinha) {
				break;
			}
			cont++;
		}
	}
	
	public void printTela(){
		
		printTela.tiraPrint(driver, "print");
	}
	

	public void realizaPaginacao(String pag) {
		try {
			buscarProdPage.clickPaginacao(pag);
			driver.wait(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
