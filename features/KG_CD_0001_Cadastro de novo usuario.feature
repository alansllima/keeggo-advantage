# language: pt
@CadastroUsuario
Funcionalidade: Cadastro

  Cenario: Cadastro de novo usuario na loja
  
    Dado que acesso o site Advantage Online Shopping cadastro
		E clico para criar uma nova conta
		E preencho dados do cadastro
		Entao valido novo usuario cadastrado
	
		
	Cenario: Cadastro de usuario ja cadastrado
  
    Dado que acesso o site Advantage Online Shopping cadastro
		E clico para criar uma nova conta
		E preencho dados do cadastro
		Entao valido mensagem de usuario ja existente