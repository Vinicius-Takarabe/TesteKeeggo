$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/cadastro.feature");
formatter.feature({
  "name": "Validacao Cadastro",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Validar o botao possui conta",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@ValidarPossuiConta"
    }
  ]
});
formatter.step({
  "name": "que estou na tela de cadastro",
  "keyword": "Dado "
});
formatter.match({
  "location": "StepsDefinitions.ValidarTelaCadSteps.que_estou_na_tela_de_cadastro()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d88.0.4324.190)\nBuild info: version: \u00274.0.0-alpha-3\u0027, revision: \u00278c567de6dc\u0027\nSystem info: host: \u0027LAPTOP-66QTSAPG\u0027, ip: \u0027192.168.0.10\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.190, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\VIN\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:54313}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 28ca066788918a43213b52cc844a396a\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:191)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:125)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:161)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:576)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteNavigation.to(RemoteWebDriver.java:908)\r\n\tat StepsDefinitions.ValidarTelaCadSteps.que_estou_na_tela_de_cadastro(ValidarTelaCadSteps.java:87)\r\n\tat ???.que estou na tela de cadastro(file:///C:/Users/VIN/eclipse-workspace/AutoTeste/src/test/resources/Features/cadastro.feature:88)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "eu preencher novamente os dados ja cadastrados",
  "keyword": "Quando "
});
formatter.match({
  "location": "StepsDefinitions.ValidarTelaCadSteps.eu_preencher_novamente_os_dados_ja_cadastrados()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicar no botao already have an account ?",
  "keyword": "E "
});
formatter.match({
  "location": "StepsDefinitions.ValidarTelaCadSteps.clicar_no_botao_already_have_an_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "devo ver a tela de login de usuario.",
  "keyword": "Entao "
});
formatter.match({
  "location": "StepsDefinitions.ValidarTelaCadSteps.devo_ver_a_tela_de_login_de_usuario()"
});
formatter.result({
  "status": "skipped"
});
});