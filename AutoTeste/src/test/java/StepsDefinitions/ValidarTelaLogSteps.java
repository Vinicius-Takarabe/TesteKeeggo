package StepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.ValidarTelaLogPage;

public class ValidarTelaLogSteps {
	
	WebDriver driver = null;
	ValidarTelaLogPage  telalog;




	@Dado("que estou na tela de inicio AdvantageDemo")
	public void que_estou_na_tela_de_inicio_AdvantageDemo() {
	
		System.out.print(" === Estou em ValidarTelaLogSteps ===");
		System.out.println("Dentro do Step - tela inicial AdvantageDemo");
		
		 String projectPath = System.getProperty("user.dir");
	     System.out.println("Project path is:"+projectPath);
	
         System.setProperty("webdriver.chrome.driver", projectPath+"/src/main/resources/driver/chromedriver.exe");	    
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.navigate().to("https://advantageonlineshopping.com/#/");
	    
	}

	@Quando("clicar no botao User")
	public void clicar_no_botao_User() throws InterruptedException {
		
		telalog = new ValidarTelaLogPage(driver);
		telalog.clickUser();
		Thread.sleep(6000);

	   
	}

	@Entao("eu devo ver a tela de login.")
	public void eu_devo_ver_a_tela_de_login() {
		
		telalog.validartelalogin();
		driver.close();
		driver.quit();
		
		
	   
	}	
	
	
	//Validar login realizado
	
	@Dado("que estou na tela de login")
	public void que_estou_na_tela_de_login() throws InterruptedException {
		
		 String projectPath = System.getProperty("user.dir");
	     System.out.println("Project path is:"+projectPath);
	
         System.setProperty("webdriver.chrome.driver", projectPath+"/src/main/resources/driver/chromedriver.exe");	    
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.navigate().to("https://advantageonlineshopping.com/#/");
		telalog = new ValidarTelaLogPage(driver);

		telalog.clickUser();
		Thread.sleep(7000);
	   
	}

	@Quando("eu inserir os 	dados corretamente")
	public void eu_inserir_os_dados_corretamente() throws InterruptedException {
		
		telalog.inserirdadosvalidos();
		Thread.sleep(10000);

	   
	}

	@Quando("clicar no botao sign in")
	public void clicar_no_botao_sign_in() throws InterruptedException {

		telalog.clickSignIn();
		Thread.sleep(5000);

	  
	}

	@Entao("devo estar logado.")
	public void devo_estar_logado() {
		
		telalog.UsuarioLogado();
		driver.close();
		driver.quit();
		
	}
	
	// Validar dados incorretos
	
	@Quando("eu inserir os dados incorretamente")
	public void eu_inserir_os_dados_incorretamente() throws InterruptedException {
		
		telalog.inserirdadosIncorretos();
		Thread.sleep(4000);

	    
	}

	@Entao("erro no login.")
	public void erro_no_login() {
		
		telalog.DadosIncorretos();
		driver.close();
		driver.quit();
	    
	}
	
	//Validar obrigatoriedade dos campos

	@Quando("eu dar o click no campo e nao preencher")
	public void eu_dar_o_click_no_campo_e_nao_preencher() throws InterruptedException {
	    
		telalog.validarCamposObrigatorios();
		Thread.sleep(4000);

	}

	@Entao("devo ver mensagem de obrigatorio.")
	public void devo_ver_mensagem_de_obrigatorio() {
		
		telalog.msgObrigatoriedade();
		driver.close();
		driver.quit();
	    
	}
	
	//Validar Botão esqueci minha senha 
	
	@Dado("clicar no botao esqueci minha senha")
	public void clicar_no_botao_esqueci_minha_senha() {
		
		telalog.ClickEsqueciSenha();
	    
	}

	@Entao("devo ver o botao habilitado.")
	public void devo_ver_o_botao_habilitado() {
		
		telalog.botaoHabilitado();
		driver.close();
		driver.quit();
	   
	}	
}


