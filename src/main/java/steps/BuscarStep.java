package steps;

import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import funcionalidades.BuscarFuncionalidade;
import funcionalidades.PaginaInicialFuncionalidade;

public class BuscarStep {
	PaginaInicialFuncionalidade paginaInicialStep = new PaginaInicialFuncionalidade();
	BuscarFuncionalidade buscandoProduto = new BuscarFuncionalidade();

	

	@Dado("^selecionar a categoria na area de busca$")
	public void selecionar_a_categoria_na_area_de_busca(DataTable credencial) throws Throwable {
		for (Map<String, String> map : credencial.asMaps(String.class, String.class)) {
			paginaInicialStep.selecionarCategoriaMercado(map.get("Categoria"));
		}
	}

	@Quando("^realizar busca de um produto$")
	public void realizarBuscaDeUmProduto(DataTable credencial) throws Throwable {
		for (Map<String, String> map : credencial.asMaps(String.class, String.class)) {
			paginaInicialStep.selecionarCategoriaMercado(map.get("Categoria"));
		}
	}
	
	
	@Entao("^apresenta o resultado da busca do \"([^\"]*)\" produto$")
	public void apresenta_o_resultado_da_busca_do_produto(int quantidade) throws Throwable {
		buscandoProduto.imprimindoResultadosGrid(quantidade);
		buscandoProduto.printTela();
	}

	@Quando("^realizar paginacao$")
	public void realizarPaginacao(DataTable credencial) throws Throwable {
		for (Map<String, String> map : credencial.asMaps(String.class, String.class)) {
			buscandoProduto.realizaPaginacao(map.get("Pagina"));
		}
	}
}
