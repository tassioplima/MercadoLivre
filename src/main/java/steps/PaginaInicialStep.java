package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import funcionalidades.PaginaInicialFuncionalidade;

public class PaginaInicialStep {
	static PaginaInicialFuncionalidade pagIniFuncionalidade = new PaginaInicialFuncionalidade();

	@Dado("^que estou na pagina inicial$")
	public void queEstouNaPaginaInicial() throws Throwable {
		pagIniFuncionalidade.goToLogin();
	}


	@Entao("^e exibida o site do Mercado Livre$")
	public void e_exibida_o_site_do_Mercado_Livre() throws Throwable {
		pagIniFuncionalidade.isPaginaInicial();
	}
}
