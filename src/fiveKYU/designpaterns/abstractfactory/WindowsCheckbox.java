package fiveKYU.designpaterns.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("This is windows checkbox");
    }
}
