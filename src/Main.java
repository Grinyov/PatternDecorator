/**
 * Created by green on 16.05.2015.
 */
public class Main {
    public static void main (String... s) {
        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent())));
        c.doOperation(); // ��������� ���������� ��������� "Hello, World!"
        c.newOperation(); // New hello operation
    }
}
