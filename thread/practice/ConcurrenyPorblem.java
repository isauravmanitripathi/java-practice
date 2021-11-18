public class ConcurrenyPorblem extends Thread{
    public static int amount = 1;

    public static void main(String[] args) {
        Main thread = new Main();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}
