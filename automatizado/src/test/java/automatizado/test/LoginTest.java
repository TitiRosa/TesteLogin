import automatizado.page.GooglePO;

public class LoginTest extends BaseTest{

    
    private static LoginPO loginPage;

    @BeforeClass
    public static void prepararTestes(){

        loginPage = new LoginPO(driver);

    }
    
    @Test
    public void TC001_naoDeveLogarNoSistemaComEmailESenhaVazio(){
     
     loginPage.inputEmail.sendKeys("");
     loginPage.inputSenha.sendKeys("");
     loginPage.buttonEntrar.click();

    }
}
