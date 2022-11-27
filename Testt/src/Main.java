import javax.swing.JFrame;
import java.util.ArrayList;

public class Main {

    static int a = 3;

    public static void main(String[] args) {
        // создаем окно
        test();
        System.out.println(a);
    }

    public static void test(){

        class Test {
            public void smena (){
                a=32;
            }
        }
        Test test1 = new Test();
        test1.smena();
    }
}