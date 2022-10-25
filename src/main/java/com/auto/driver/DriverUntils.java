package com.auto.driver;

import com.logigear.statics.Selaium;
import org.openqa.selenium.Alert;


public class DriverUntils {
    private static Alert switchToAlert() {
        return Selaium.driver().switchTo().alert();
    }

    public static String getAlertMessage() {
        return switchToAlert().getText();
    }
}
