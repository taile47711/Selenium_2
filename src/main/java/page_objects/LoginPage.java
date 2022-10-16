package page_objects;

import com.logigear.element.Element;

public class LoginPage {
    //Locator
    private Element txtUsername = new Element("id=username");
    private Element txtPassword = new Element("id=password");
    private Element btnLogin = new Element("//div [@class='btn-login']");

    //Method
    public void Login (String username, String password){
        txtUsername.enter(username);
        txtPassword.enter(password);
        btnLogin.click();
    }
}
