package fiveKYU.designpaterns.abstractfactory;

public class Demo {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        factory = new WindowsFactory();
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app= configureApplication();
        app.paint();
    }
}
