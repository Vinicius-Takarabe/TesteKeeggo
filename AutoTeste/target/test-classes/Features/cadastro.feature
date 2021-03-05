# language: pt
# encoding: UTF-8
Funcionalidade: Validacao Cadastro

  @validaTela
  Cenario: Validar tela de Cadastro
    Dado que estou na tela inicial AdvantageDemo
    Quando eu clicar no botao User
    E clicar em Create New Account
    Entao devo ver a tela de cadastro.

  @validaCadSucesso
  Cenario: Validar Cadastro com Sucesso
    Dado que estou na tela de cadastro
    Quando eu preencher os dados corretamente
    E clicar no botao Register
    Entao devo ver usuario cadastrado.

  @validaUsuarioExistente
  Cenario: Validar Usuario existente
    Dado que estou na tela de cadastro
    Quando eu preencher novamente os dados ja cadastrados
    E clicar novamante no botao Register
    Entao devo ver a mensagem de usuario ja existe.

  @validaCamposObg
  Cenario: Validar campos
    Dado que estou na tela de cadastro
    Quando eu clicar no campo e nao preencher
    Entao devo ver a mensagem de obrigatoriedade.
    
  @ValidarMinimoChar
  Cenario: Validar numero minimo de caracteres
    Dado que estou na tela de cadastro
    Quando eu preencher os campos com apenas um caractere
    Entao e exibida a mensagem com o numero minimo de caracteres necessarios.
    
  @ValidarMaximoChar
  Cenario: Validar numero maximo de caracteres
    Dado que estou na tela de cadastro
    Quando eu ultrapassar o numero maximo de caracteres  
    Entao e exibida a mensagem com o numero maximo de caracteres permitidos .
    
  @ValidarEmail
  Cenario: Verficar se o email e valido
    Dado que estou na tela de cadastro
    Quando eu preencher algo nao correspondente a um email  
    Entao e exibida a mensagem de email invalido.
  
  @ValidarSenhaLetraMin
  Cenario: Validar se a senha possui letra minuscula
    Dado que estou na tela de cadastro
    Quando eu preencher o campo password sem letra uma minuscula  
    Entao e exibida a mensagem de uma letra minuscula e requerida .
    
  @ValidarSenhaLetraMaiusc
  Cenario: Validar se a senha possui letra maiuscula
    Dado que estou na tela de cadastro
    Quando eu preencher o campo password sem letra uma maiuscula  
    Entao e exibida a mensagem de uma letra maiuscula e requerida .
    
  @ValidarSenhaTemNumero
  Cenario: Validar se a senha possui um numero
    Dado que estou na tela de cadastro
    Quando eu preencher o campo password sem um numero  
    Entao e exibida a mensagem de um numero e requerido .
    
  @ValidarConfirmarSenha
  Cenario: Validar se o confirmar senha corresponde a senha
    Dado que estou na tela de cadastro 
    Quando a comparacao de caractere do password e o confirm password for diferente
    Entao e exibida a mensagem senha nao correspondente.
  
  @ValidarCampoCountry
  Cenario: Validar o campo country
    Dado que estou na tela de cadastro 
    Quando eu selecionar em pais 
    Entao devo ver o nome do pais selecionado. 
    
  @ValidarBotaoRegister
  Cenario: Verificar se o botao register esta habilitado
    Dado que estou na tela de cadastro 
    Quando eu preencher os dados corretamente
    Entao devo ver o botao register habilitado. 
    
  @ValidarPossuiConta
  Cenario: Validar o botao possui conta
    Dado que estou na tela de cadastro 
    Quando eu preencher novamente os dados ja cadastrados
    E clicar no botao already have an account ?
    Entao devo ver a tela de login de usuario. 
  
  
    
    
