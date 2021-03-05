# language: pt
# encoding: UTF-8
Funcionalidade: Validacao Login

  @validaTelaLogin
  Cenario: Validar tela de Login
    Dado que estou na tela de inicio AdvantageDemo
    Quando clicar no botao User
    Entao eu devo ver a tela de login.

  @validarUsuarioLog
  Cenario: Validar se o usuario esta logado
    Dado que estou na tela de login
    Quando eu inserir os 	dados corretamente
    E clicar no botao sign in
    Entao devo estar logado.

  @validarDadosIncorretos
  Cenario: Validar dados incorretos
    Dado que estou na tela de login
    Quando eu inserir os dados incorretamente
    E clicar no botao sign in
    Entao erro no login.
    
  @validarCamposObgt
  Cenario: Validar campos de textos obrigatorios
    Dado que estou na tela de login
    Quando eu dar o click no campo e nao preencher
    Entao devo ver mensagem de obrigatorio.
    
  @validarSenhaEsquecida
  Cenario: Validar se o botao de esqueci minha senha esta habilitado 
    Dado que estou na tela de login 
    E clicar no botao esqueci minha senha
    Entao devo ver o botao habilitado.
  
    
  
  
  
  
  
    
    
    
   
