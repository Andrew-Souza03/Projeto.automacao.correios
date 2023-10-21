#Author: andrew.edsouza@gmail.com 

@regressivos
Feature: Buscar cep e endereço no site Correios
	Como usuario do correios
	Quero informar um cep e endereço
	Para validar o resultado da busca 

  @positivo
  Scenario: Realizar busca por cep 
    When enviar os dados
    Then validar o resultado da busca
    
  @positivo
 	Scenario: Realizar busca por endereco
    When enviar os dados para busca
    Then validar o resultado da busca

	@negativo
 	Scenario: Realizar busca com caracteres especiais
    But enviar os dados com caracteres especiais
    Then validar mensagem de dados invalidos
    
  @negativo
 	Scenario: Realizar busca com dados invalidos
    But enviar os dados com informacoes invalidas
    Then validar mensagem de dados inexistentes
    
  @negativo 
 	Scenario: Realizar busca com espaço no campo
    But enviar apenas espaço no campo de busca
    Then validar mensagem de dados nao informados
    
  @negativo 
 	Scenario: Realizar busca sem preencher o campo
    But enviar campo vazio
    Then validar nova pagina de busca
    