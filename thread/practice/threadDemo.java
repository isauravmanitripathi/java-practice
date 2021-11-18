import java.lang.Thread;
public class threadDemo {
    public static void main(String[] args){
        Mythread mt = new Mythread();
        mt.start();
        do {
            for (int i = 0; i < 50; i++)
                System.out.println("i = " + i + ", i * i = " + i * i);
        } while (true);
    }
}
class Mythread extends Thread { //
    public void run(){
        for (int count = 1, row = 1; row < 20; row++, count++) {
            for (int i = 0; i < count; i++)
                System.out.println('*');
            System.out.println('\n');
        }
    }
}
