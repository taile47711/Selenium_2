package page_objects;

import com.logigear.element.Element;

public class DashboardPage {
    private Element lblWelcome = new Element("//a[@href='#Welcome']");

    public boolean doesWelcomeLabelDisplay() {
        return lblWelcome.isDisplayed();
    }
}
