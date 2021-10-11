# language: pt

Funcionalidade: Cadastrar Usuario

Como usuario 
Quero realizar meu cadastro com sucesso
Para utilizar o sistema

Esquema do Cenario: Cadastrar novo usuario
	Dado que estou acessando a pagina de register
	Quando preencho o campo username "<username>"
	E preencho o campo email "<email>"
	E preencho o campo password "<password>"
	E confirmo a password "<password>"
	E preencho o campo first name "<firstname>"
	E preencho o campo last name "<lastname>"
	E preencho o campo phone number "<phonenumber>"
	E seleciono o country "<country>"
	E preencho o campo city "<city>"
	E preencho o campo address "<address>"
	E preencho o campo state "<state>"
	E preencho o campo postal code "<postalcode>"
	E aceito os termos de servico
	Então clico no botao "Register"
	
	Exemplos:
|	username	|	email								|	password			|	firstname	|	lastname	|	phonenumber		|	country	|	city		|	address			|	state			|	postalcode	|	
|	Usertest	|	usertest@gmail.com	|	Test@Advant1	|	Test			|	Advantage	|	1199999-9999	|	Brazil	|	Cidade	|	Rua Test, 1	|	Sao Paulo	|	09999-000		|

#Contexto:
Esquema do Cenario: Não deverá Cadastrar usuario existente
	Dado que estou acessando a pagina de register
	Quando preencho o campo username "<username>"
	E preencho o campo email "<email>"
	E preencho o campo password "<password>"
	E confirmo a password "<password>"
	E preencho o campo first name "<firstname>"
	E preencho o campo last name "<lastname>"
	E preencho o campo phone number "<phonenumber>"
	E seleciono o country "<country>"
	E preencho o campo city "<city>"
	E preencho o campo address "<address>"
	E preencho o campo state "<state>"
	E preencho o campo postal code "<postalcode>"
	E aceito os termos de servico
	E clico no botao "Register"
	Entao o sistema apresenta a mensagem User name already exists
	
Exemplos:
|	username	|	email								|	password			|	firstname	|	lastname	|	phonenumber		|	country	|	city		|	address			|	state			|	postalcode	|	
|	Usertest	|	usertest@gmail.com	|	Test@Advant1	|	Test			|	Advantage	|	1199999-9999	|	Brazil	|	Cidade	|	Rua Test, 1	|	Sao Paulo	|	09999-000		|
