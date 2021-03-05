package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ValidarTelaCadPage;

public class ValidarTelaCadSteps  {

	WebDriver driver = null;
	ValidarTelaCadPage  telacad;
	
	
	@Dado("que estou na tela inicial AdvantageDemo")
	public void que_estou_na_tela_inicial_AdvantageDemo() {
		
		System.out.print(" === Estou em ValidarTelaCadSteps ===");
		System.out.println("Dentro do Step - tela inicial AdvantageDemo");
		
		 String projectPath = System.getProperty("user.dir");
	     System.out.println("Project path is:"+projectPath);
	
         System.setProperty("webdriver.chrome.driver", projectPath+"/src/main/resources/driver/chromedriver.exe");	    
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.navigate().to("https://advantageonlineshopping.com/#/");
	   
	}

	@Quando("eu clicar no botao User")
	public void eu_clicar_no_botao_User() {
		
		telacad = new ValidarTelaCadPage(driver);
		telacad.clickUser();
	    
	}

	@E("clicar em Create New Account")
	public void clicar_em_Create_New_Account() throws InterruptedException {
		
		Thread.sleep(4000);
		telacad.clickCreateNewAccount();
	    
	}

	@Entao("devo ver a tela de cadastro.")
	public void devo_ver_a_tela_de_cadastro() throws InterruptedException {
		
		telacad.validarTelaCadastro();
		
		Thread.sleep(4000);
		driver.close();
		driver.quit();

	    
	}
	
	
	
	//Validar Cadastro com sucesso
	
	@Dado("que estou na tela de cadastro")
	public void que_estou_na_tela_de_cadastro() throws InterruptedException {
		
		System.out.print(" === Estou em ValidarTelaCadSteps ===");
		System.out.println("Dentro do Step - tela de cadastro AdvantageDemo");
		
		  String projectPath = System.getProperty("user.dir");
	      System.out.println("Project path is:"+projectPath);
	
          System.setProperty("webdriver.chrome.driver", projectPath+"/src/main/resources/driver/chromedriver.exe");
		
   
	    
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.navigate().to("https://advantageonlineshopping.com/#/");	  
		telacad = new ValidarTelaCadPage(driver);
		telacad.clickUser();
		Thread.sleep(4000);
		telacad.clickCreateNewAccount();
	}

	@Quando("eu preencher os dados corretamente")
	public void eu_preencher_os_dados_corretamente() throws InterruptedException {
		
		telacad.inserirdados();
	  
	}

	@Quando("clicar no botao Register")
	public void clicar_no_botao_Register() throws InterruptedException {
		
		telacad.clicarRegistrar();
		Thread.sleep(4000);

	  
	}
	
	@Entao("devo ver usuario cadastrado.")
	public void devo_ver_usuario_cadastrado() {
	    telacad.verUsuarioLogado();
	    driver.close();
		driver.quit();

	}
	
	
	
	// Validar Usuario Existente

	@Quando("eu preencher novamente os dados ja cadastrados")
	public void eu_preencher_novamente_os_dados_ja_cadastrados() throws InterruptedException {
		
		
		telacad.inserirdados();   
	}

	@Quando("clicar novamante no botao Register")
	public void clicar_novamante_no_botao_Register() throws InterruptedException {
		
		telacad.clicarRegistrar();	
		Thread.sleep(2000);

		    
	}

	@Entao("devo ver a mensagem de usuario ja existe.")
	public void devo_ver_a_mensagem_de_usuario_ja_existe() throws InterruptedException {
	    
		telacad.usuarioExistente();
		Thread.sleep(10000);
		driver.close();
		driver.quit();


			    
	}
	
	//Valida obrigatoriedade dos campos

	@Quando("eu clicar no campo e nao preencher")
	public void eu_clicar_no_campo_e_nao_preencher() throws InterruptedException {
		
		telacad.validarCamposObrigatorios();
		Thread.sleep(2000);
	    
	}

	@Entao("devo ver a mensagem de obrigatoriedade.")
	public void devo_ver_a_mensagem_de_obrigatoriedade() {
		
		telacad.verMsgObrigatoriedade();
		driver.close();
		driver.quit();

	}
	
	//Validar campos, minimo necessario
	
	@Quando("eu preencher os campos com apenas um caractere")
	public void eu_preencher_os_campos_com_apenas_um_caractere() {
		
		telacad.validarMinimo();
		
	}

	@Entao("e exibida a mensagem com o numero minimo de caracteres necessarios.")
	public void e_exibida_a_mensagem_com_o_numero_minimo_de_caracteres_necessarios() {
	    
		telacad.msgNumeroMinimoNecessario();
		driver.close();
		driver.quit();

	}
	
	//Validar campos, maximo permitido
	
	@Quando("eu ultrapassar o numero maximo de caracteres")
	public void eu_ultrapassar_o_numero_maximo_de_caracteres() {
		
		telacad.validarMaximo();
	}

	@Entao("e exibida a mensagem com o numero maximo de caracteres permitidos .")
		public void e_exibida_a_mensagem_com_o_numero_maximo_de_caracteres_permitidos() {
			
			telacad.msgNumeroMaxidoPermitido();
			driver.close();
			driver.quit();

		    
    }
	
	//Validar se o email é válido
	
	@Quando("eu preencher algo nao correspondente a um email")
	public void eu_preencher_algo_nao_correspondente_a_um_email() {
		
		telacad.preencherEmail();	
	}

	@Entao("e exibida a mensagem de email invalido.")
	public void e_exibida_a_mensagem_de_email_invalido() {
		
		telacad.msgEmailInvalido();
		driver.close();
		driver.quit();
	    
	}
	
	//Validar se a senha possui letra minuscula
	
	@Quando("eu preencher o campo password sem letra uma minuscula")
	public void eu_preencher_o_campo_password_sem_letra_uma_minuscula() {
		
		telacad.preencherSemLetraMin();
	   
	}

	@Entao("e exibida a mensagem de uma letra minuscula e requerida .")
	public void e_exibida_a_mensagem_de_uma_letra_minuscula_e_requerida() {
		
		telacad.msgLetraMinRequerida();
		driver.close();
		driver.quit();
	   
	}
	
	//Validar se a senha possui letra maiuscula
	
	@Quando("eu preencher o campo password sem letra uma maiuscula")
	public void eu_preencher_o_campo_password_sem_letra_uma_maiuscula() {
		
		telacad.preencherSemLetraMaiusc();
	    
	}

	@Entao("e exibida a mensagem de uma letra maiuscula e requerida .")
	public void e_exibida_a_mensagem_de_uma_letra_maiuscula_e_requerida() {
		
		telacad.msgLetraMaiuscRequerida();
		driver.close();
		driver.quit();
	    
	}
	
	//Validar se a senha possui um numero
	
	@Quando("eu preencher o campo password sem um numero")
	public void eu_preencher_o_campo_password_sem_um_numero() {
		
		telacad.preencherSemNumero();
	    
	}

	@Entao("e exibida a mensagem de um numero e requerido .")
	public void e_exibida_a_mensagem_de_um_numero_e_requerido() {
		
		telacad.msgUmNumeroErequerido();
		driver.close();
		driver.quit();
	    
	}
	
	//Validar confirmar senha
	
	@Quando("a comparacao de caractere do password e o confirm password for diferente")
	public void a_comparacao_de_caractere_do_password_e_o_confirm_password_for_diferente() {
		
		telacad.preencherConfirmSenha();
	   
	}

	@Entao("e exibida a mensagem senha nao correspondente.")
	public void e_exibida_a_mensagem_senha_nao_correspondente() {
		
		telacad.msgSenhaNaoCorrespondente();
		driver.close();
		driver.quit();
	    
	}
	
	//Validar campo country 
	
	@Quando("eu selecionar em pais")
	public void eu_selecionar_em_pais() {
		
		telacad.selecionarPais();
	    
	}

	@Entao("devo ver o nome do pais selecionado.")
	public void devo_ver_o_nome_do_pais_selecionado() {
		
		telacad.verPaisSelecionado();
		driver.close();
		driver.quit();
	    
	}
	 //Validar se o botao register estpa habilitado
	@Entao("devo ver o botao register habilitado.")
	public void devo_ver_o_botao_register_habilitado() {
	    
		telacad.registerHabilitado();
		driver.close();
		driver.quit();
	}
	
	//Validar botão "se o usuario já possui conta" 
	
	@Quando("clicar no botao already have an account ?")
	public void clicar_no_botao_already_have_an_account() throws InterruptedException {
		
		telacad.clickAlreadyHaveAcc();;
		Thread.sleep(4000);

	}

	@Entao("devo ver a tela de login de usuario.")
	public void devo_ver_a_tela_de_login_de_usuario() {
		
		telacad.telaLogin();
		driver.close();
		driver.quit();
		
	   
	}

	

}
