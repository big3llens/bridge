import imp.GamingComputer;
import imp.OfficeComputer;
import imp.SimpleKeyboard;

public class App {
    public static void main(String[] args) {
        GamingComputer gc = new GamingComputer(8, true, false, 4.2);
        OfficeComputer oc = new OfficeComputer(2, false, false, 3.2);

        SimpleKeyboard simpleKeyboard1 = new SimpleKeyboard(gc);
        simpleKeyboard1.start();
        simpleKeyboard1.startWork();
        simpleKeyboard1.startGame();
        System.out.println("-------------------------------------------------------------");
        SimpleKeyboard simpleKeyboard2 = new SimpleKeyboard(oc);
        simpleKeyboard2.start();
        simpleKeyboard2.startWork();
        simpleKeyboard2.startGame();
    }
}
