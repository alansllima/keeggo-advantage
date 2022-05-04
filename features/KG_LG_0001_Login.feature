# language: pt
@Login
Funcionalidade: Login


  Cenario: Login na Plataforma Advantage Online
 
    #Dado que acesso o site Advantage Online Shopping
		#E preencho dados para autenticacao
		#Entao valido usuario logado
	
	Cenario: Login na Plataforma Advantage Online com usuario nao cadastrado
 
    Dado que acesso o site Advantage Online Shopping
		E preencho dados com autenticacao invalida
		Entao valido erro de autenticacao
	
	