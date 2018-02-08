package app;

public class FilmuebApp {
    public static void main(String[] args) {
        final String appName = "Filmueb v0.4";
        System.out.println(appName);
        ApplicationController appControl = new ApplicationController();
        appControl.mainLoop();
    }
}
