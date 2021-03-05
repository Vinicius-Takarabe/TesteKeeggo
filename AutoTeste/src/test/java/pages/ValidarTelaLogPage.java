package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidarTelaLogPage {
	
    public WebDriver driver;
	
	//menu
    public By btn_facebook = By.xpath("/html/body/login-modal/div/div/div[3]/span");
	public By btn_user = By.id("menuUser");
	//campo telalogin
	public By txt_username = By.name("username");
	public By txt_password = By.name("password");
	public By check_remember = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/div/input");
	public By btn_signin   = By.id("sign_in_btnundefined");
	//msg de obrigatoriedade 
	public By msg_username = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/label");
	public By msg_password = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/label");
	//Validar campo esqueci minha senha 
	public By btn_esqueciSenha = By.xpath("/html/body/login-modal/div/div/div[3]/a[1]");
	
	
	public ValidarTelaLogPage(WebDriver driver) {
		  
		this.driver=driver;
	}
    
	//Validar tela de login

	public void clickUser() {
		
		driver.findElement(btn_user).click();	
	}
	
    public void validartelalogin() {
    	
		Assert.assertEquals("SIGN IN WITH FACEBOOK", driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/span")).getText());

    }
    
    //Validar logado com sucesso
    
    public void inserirdadosvalidos( ) {
    	driver.findElement(txt_username).sendKeys("Vini12Takarabe");
    	driver.findElement(txt_password).sendKeys("945393611Vv");
    }
    
    public void clickSignIn( ) {
    	
    	driver.findElement(btn_signin).click();
    	
    }
    
    public void UsuarioLogado() {
    	
    	Assert.assertTrue(driver.findElement(By.id("menuUserLink")).getText().contains("Vini12Takarabe"));

    }
    
    //Validar dados incorretos
    
    public void inserirdadosIncorretos( ) {
    	driver.findElement(txt_username).sendKeys("Vini12Taka");
    	driver.findElement(txt_password).sendKeys("945393611Vv");
    }
    
    public void DadosIncorretos( ) {
    	
		Assert.assertEquals("Incorrect user name or password.", driver.findElement(By.xpath("//*[@id=\"signInResultMessage\"]")).getText());

    }
    
    
    //Validar campos obrigatórios
    
    public void validarCamposObrigatorios() {
    	
    	driver.findElement(txt_username).click();
    	driver.findElement(txt_password).click();
    	driver.findElement(check_remember).click();
    }
    
    public void msgObrigatoriedade() {
    	
    	Assert.assertEquals("Username field is required", driver.findElement(msg_username).getText());
    	Assert.assertEquals("Password field is required", driver.findElement(msg_password).getText());
    }
    
    //Validar campo esqueci minha senha 
    
    public void ClickEsqueciSenha() {
    	
    	driver.findElement(btn_esqueciSenha).click();
    	
    }
    
    public void botaoHabilitado( ) {
    	
    	driver.findElement(btn_esqueciSenha).isEnabled();
    }
    
	
}

