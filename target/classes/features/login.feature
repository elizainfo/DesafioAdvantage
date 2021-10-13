#language: pt

@tag
Funcionalidade: Login
  Eu como usuario
  Desejo realizar o login no sistema

  @tag1
 Esquema do Cenário: Deve realizar login com sucesso
    Dado que estou na pagina inicial
    E clico no botao User
    Quando no pop-up informo o username "<username>"
    E informo a password "<password>"
    Então clico no botao SingIn

Exemplos: 
      | username  		| password		 |
      | Usertest 	| Test@Advant1 |
     
     
    