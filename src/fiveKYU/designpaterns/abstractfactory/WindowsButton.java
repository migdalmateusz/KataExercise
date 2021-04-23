package fiveKYU.designpaterns.abstractfactory;

public class WindowsButton implements Button{

    @Override
    public void paint() {
        System.out.println("This is WindowButton");
    }
}
