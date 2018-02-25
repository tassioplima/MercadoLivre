#language: pt
#Version: 1.0
#Encoding: iso-8859-1
Funcionalidade: Buscar conteudo e valores MercadoLivre

  Contexto: Realizacao do acesso inicial como pre-requisito 
    Dado que estou na pagina inicial
    Quando selecionar a categoria na area de busca
    
      | 	 Categoria 							 | 
      | 	Celulares e Smartphones  |	


  @ID01 @PesquisaCenario
  
  Cenario: Realizar uma pesquisa no site do Mercado Livre e imprimir os resultados 
      
    Entao apresenta o resultado da busca do "5" produto

  @ID02 @PesquisaCenario
  
  Cenario: Realizar uma pesquisa no site do Mercado Livre que contenha paginacao
    
    Quando realizar paginacao
      | Pagina 			|
      | 2						|
    Entao apresenta o resultado da busca do "1" produto
