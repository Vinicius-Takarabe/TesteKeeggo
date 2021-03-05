package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ValidarTelaCadPage {
	
	public WebDriver driver;
	
	//Validar tela de cadastro 
	
	public By btn_user = By.id("menuUser");
	public By btn_newaccount = By.linkText("CREATE NEW ACCOUNT");
	
	//Validar cadastro registrado com sucesso
	
	public By txt_username = By.name("usernameRegisterPage");
	public By txt_email = By.name("emailRegisterPage");
	public By txt_password = By.name("passwordRegisterPage");
	public By txt_confirmpass = By.name("confirm_passwordRegisterPage");
	//Personal Details
	public By txt_firstname = By.name("first_nameRegisterPage");
	public By txt_lastname = By.name("last_nameRegisterPage");
	public By txt_phone = By.name("phone_numberRegisterPage");
	//Address
	public By txt_country = By.name("countryListboxRegisterPage");
	public By txt_city = By.name("cityRegisterPage");
	public By txt_address = By.name("addressRegisterPage");
	public By txt_state = By.name("state_/_province_/_regionRegisterPage");
	public By txt_postalcode = By.name("postal_codeRegisterPage");
	// check and register
	public By check_iagree = By.name("i_agree");
	public By btn_register = By.id("register_btnundefined");
	
	// Obrigatoriedade dos campos
	
	public By msg_username = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/label");
	public By msg_email = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/label");
	public By msg_password = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/label");
	public By msg_confirmpass = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/label");
	
	//Mensagem de requisito Username
	
	public By msg_use5 = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/label");
	public By msg_max15 = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/label");
	
	//Mensagem de requisito Email
	
	public By msg_emailErro = By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/label");
	
	//Mensagem de requisito Senha
	
	public By msg_use4 = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/label");
	public By msg_max12 = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/label");
	public By msg_lower = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/label");
	public By msg_upper = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/label");
	public By msg_onenumber = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/label");
	
	//Mensagem de requisito ConfirmarSenha
	
	public By msg_notmatch = By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/label");
	
	//Personal Detail
	//Mensagem de requisito first name

	public By msg_use2 = By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/label");
	public By msg_max30 = By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/label");
	
	//Mensagem de requisito last name
	
	public By msg_lastNuse2 = By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/label");
	public By msg_lastMax30 = By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/label");
	
	//Mensagem de requisito phone 
	
	public By msg_phone = By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/label");
	
	
	
	//Address
	//mensagem do requisito campo city
	public By msg_max25 = By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/label");
	//mensagem do requisito campo address
	public By msg_max50 = By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/label");
	//mensagem do requisito campo state
	public By msg_Smax10 = By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/label");
	//mensagem do requisito campo postalcode
	public By msg_Pmax10 = By.xpath("//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/label");
	
	//Validar botão Already have account 
	
	public By already_haveacc = By.linkText("ALREADY HAVE AN ACCOUNT?");
	public By txt_facebook = By.xpath("/html/body/login-modal/div/div/div[3]/span");

	
	
	
	public ValidarTelaCadPage(WebDriver driver) {
		  
		this.driver=driver;
	}	
	
	//Validar tela de cadastro 
	
    public void clickUser() {
		
		driver.findElement(btn_user).click();
	}
	
    public void clickCreateNewAccount() {
		
		driver.findElement(btn_newaccount).click();	
	}
    
    public void validarTelaCadastro() {
		
    	Assert.assertTrue(driver.findElement(By.id("formCover")).getText().contains("ACCOUNT DETAILS"));
  	}
    
    public void validartelacad() {
    	
		driver.findElement(btn_user).click();	
		driver.findElement(btn_newaccount).click();	
    	Assert.assertTrue(driver.findElement(By.id("formCover")).getText().contains("ACCOUNT DETAILS"));
    	
    }
    
    
    
	//Validar cadastro registrado com sucesso
    
    public void inserirdados() {
		
		driver.findElement(txt_username).sendKeys("V34567899karabe");
		driver.findElement(txt_email).sendKeys("viniciustakarabe@outlook.com");
		driver.findElement(txt_password).sendKeys("945393611Vv");
		driver.findElement(txt_confirmpass).sendKeys("945393611Vv");
		//Personal Details
		driver.findElement(txt_firstname).sendKeys("Vinicius");
		driver.findElement(txt_lastname).sendKeys("Takarabe");
		driver.findElement(txt_phone).sendKeys("11 94539-3611");
		//Address
		Select select = new Select(driver.findElement(txt_country));
		select.selectByVisibleText("Brazil");
		
		driver.findElement(txt_city).sendKeys("Arujá");
		driver.findElement(txt_address).sendKeys("Rua La Paz, 57");
		driver.findElement(txt_state).sendKeys("São Paulo");
		driver.findElement(txt_postalcode).sendKeys("07400-370");
	    //check
		driver.findElement(check_iagree).click();
		
		
    }
    
    public void clicarRegistrar() {
    	
    	WebElement botao = driver.findElement(btn_register);
    	botao.click();
    	 	
    }
    
    public void verUsuarioLogado() {
    	
    	Assert.assertTrue(driver.findElement(By.id("menuUserLink")).getText().contains("V34567899karabe"));
    	
    }
    
    // Validar Usuario já existente
    
	public void usuarioExistente() {
		
		
		Assert.assertEquals("User name already exists", driver.findElement(By.xpath("//*[@id=\"registerPage\"]/article/sec-form/div[2]/label[1]")).getText());
		
    }
	
	//Validar Obrigatoriedade dos campos
	
	public void validarCamposObrigatorios( ) throws InterruptedException {
		
		driver.findElement(txt_username).click();
		driver.findElement(txt_email).click();
		driver.findElement(txt_password).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/label")).click();
		driver.findElement(txt_firstname).click();
		
	}
	
    public void verMsgObrigatoriedade( ) {
		
    	Assert.assertEquals("Username field is required", driver.findElement(msg_username).getText());
    	Assert.assertEquals("Email field is required", driver.findElement(msg_email).getText());
    	Assert.assertEquals("Password field is required", driver.findElement(msg_password).getText());
    	Assert.assertEquals("Confirm password field is required", driver.findElement(msg_confirmpass).getText());
	
	}
    
    //Validar minimo de caractere dos campos
    
    public void validarMinimo( ) {
		
    	//Username
    	driver.findElement(txt_username).sendKeys("1");
    	driver.findElement(txt_email).click();
    	//Password
    	driver.findElement(txt_password).sendKeys("1");
    	driver.findElement(txt_email).click();
    	//Firstname 
    	driver.findElement(txt_firstname).sendKeys("A");
    	driver.findElement(txt_email).click();
    	//Lastname	
    	driver.findElement(txt_lastname).sendKeys("A");
    	driver.findElement(txt_email).click();
	
	}
    
    public void msgNumeroMinimoNecessario() {
    	
     Assert.assertEquals("Use 5 character or longer", driver.findElement(msg_use5).getText());
     Assert.assertEquals("Use 4 character or longer", driver.findElement(msg_use4).getText());
     Assert.assertEquals("Use 2 character or longer", driver.findElement(msg_use2).getText());
     Assert.assertEquals("Use 2 character or longer", driver.findElement(msg_lastNuse2).getText());	
    }
    
    //Validar maximo de caractere permitido
    
    public void validarMaximo() {
    	//Username
    	driver.findElement(txt_username).sendKeys("11111111111111111");
    	driver.findElement(txt_email).click();
    	//Password
    	driver.findElement(txt_password).sendKeys("111111111111111");
    	driver.findElement(txt_email).click();
    	//Firtname
    	driver.findElement(txt_firstname).sendKeys("11111111111111111111111111111111");
    	driver.findElement(txt_email).click();
    	//Lastname
    	driver.findElement(txt_lastname).sendKeys("11111111111111111111111111111111");
    	driver.findElement(txt_email).click();
    	//Phone
    	driver.findElement(txt_phone).sendKeys("111111111111111111111111");
    	driver.findElement(check_iagree).click();
    	//City
    	driver.findElement(txt_city).sendKeys("1111111111111111111111111111");
    	driver.findElement(check_iagree).click();
    	//Adress
    	driver.findElement(txt_address).sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111");
    	driver.findElement(check_iagree).click();
    	//State
    	driver.findElement(txt_state).sendKeys("11111111111111111111");
    	driver.findElement(check_iagree).click();
    	//Postalcode
    	driver.findElement(txt_postalcode).sendKeys("1111111111111111");
		driver.findElement(check_iagree).click();
    	
    	
    }
    
    public void msgNumeroMaxidoPermitido() {
    	
    	Assert.assertEquals("Use maximum 15 character", driver.findElement(msg_max15).getText());
    	Assert.assertEquals("Use maximum 12 character", driver.findElement(msg_max12).getText());
    	Assert.assertEquals("Use maximum 30 character", driver.findElement(msg_max30).getText());
    	Assert.assertEquals("Use maximum 30 character", driver.findElement(msg_lastMax30).getText());
    	Assert.assertEquals("Use maximum 20 character", driver.findElement(msg_phone).getText());
    	Assert.assertEquals("Use maximum 25 character", driver.findElement(msg_max25).getText());
    	Assert.assertEquals("Use maximum 50 character", driver.findElement(msg_max50).getText());
    	Assert.assertEquals("Use maximum 10 character", driver.findElement(msg_Smax10).getText());
    	Assert.assertEquals("Use maximum 10 character", driver.findElement(msg_Pmax10).getText());
    }
    
    //Validar se o email e valido
    
    public void preencherEmail() {
    	
    	driver.findElement(txt_email).sendKeys("11111111111111");
    	driver.findElement(txt_username).click();
    	
    }
    
    public void msgEmailInvalido() {
    	
    	Assert.assertEquals("Your email address isn't formatted correctly", driver.findElement(msg_emailErro).getText());
    	
    }
    
    //Validar se a senha possui letra minuscula
    
    public void preencherSemLetraMin() {
    	
    	driver.findElement(txt_password).sendKeys("1234V");
    	driver.findElement(txt_username).click();
    }
    
    public void msgLetraMinRequerida() {
    	
    	Assert.assertEquals("One lower letter required", driver.findElement(msg_lower).getText());
    }
    
    //Validar se a senha possui letra maiuscula
    
    public void preencherSemLetraMaiusc() {
    	
    	driver.findElement(txt_password).sendKeys("1234v");
    	driver.findElement(txt_username).click();
    }
    
    public void msgLetraMaiuscRequerida() {
    	
    	Assert.assertEquals("One upper letter required", driver.findElement(msg_upper).getText());
    }
    
    //Validar se a senha possui um numero
    
    public void preencherSemNumero() {
    	
    	driver.findElement(txt_password).sendKeys("AAAAvV");
    	driver.findElement(txt_username).click();
    }
    
    public void msgUmNumeroErequerido() {
    	
    	
    	Assert.assertEquals("One number required", driver.findElement(msg_onenumber).getText());
    }
    
    //Validar se o confirmar senha correponde a senha
    
    public void preencherConfirmSenha() {
    	
    	driver.findElement(txt_password).sendKeys("123456Vv");
    	driver.findElement(txt_confirmpass).sendKeys("123456V");
    	driver.findElement(txt_username).click();
    }
    
    public void msgSenhaNaoCorrespondente() {
    	
    	
    	Assert.assertEquals("Passwords do not match", driver.findElement(msg_notmatch).getText());
    }
    
    //Validar Pais selecionado
    
    public void selecionarPais() {
    	
    	Select select = new Select(driver.findElement(txt_country));
		select.selectByVisibleText("Brazil");
    }
    
    public void verPaisSelecionado() {
    	
    	Select select = new Select(driver.findElement(txt_country));
    	Assert.assertEquals("Brazil",select.getFirstSelectedOption().getText());
    }
    
    //Validar se o botão register está habilitado
    
    public void registerHabilitado() {
    	
    	driver.findElement(btn_register).isEnabled();
    }
    
    //Validar botão se o usuario já possui conta 
    
    public void clickAlreadyHaveAcc() {
    	
    	driver.findElement(already_haveacc).click();
    }
    
    public void telaLogin( ) {
    	
    	Assert.assertEquals("SIGN IN WITH FACEBOOK", driver.findElement(txt_facebook).getText());
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

} 