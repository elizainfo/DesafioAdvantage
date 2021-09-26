# language: pt

Funcionalidade: Cadastrar Usuario

Como usuario 
Quero realizar meu cadastro com sucesso
Para utilizar o sistema

Cenario: Cadastrar novo usuario
	Dado que estou acessando a pagina de register
	Quando informo o nome do usuario "eliztest"
	E informo o email "eliztest@gmail.com"
	E informo a senha "Test@Advant1"
	E confirmo a senha "Test@Advant1"
	E informo meu primeiro nome "Test"
	E informo meu ultimo nome "Advantage"
	E informo meu numero de telefone "1199999-9999"
	E seleciono o pais "Brazil"
	E informo a cidade "Itapevi"
	E informo o endereco "Rua Test, 1"
	E informo o estado de "Sao Paulo"
	E informo o CEP "09999-000"
	E desmarco a opcao de receber ofertas exclusivas
	E aceito os termos de servico
	E clico no botao "Register"
	Entao o cadastro e adicionado com sucesso