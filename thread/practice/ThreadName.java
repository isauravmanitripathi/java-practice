public class ThreadName {
    public static void main(String[] args) {
        Thread1 alpha;
        if (args.length == 0)
            alpha = new Thread1();
        else
            alpha = new Thread1(args [0]);
        alpha.start ();
    }
}
class Thread1 extends Thread {
    Thread1 () {

    }
    Thread1 (String name) {
        super (name);
    }
    public void run() {
        System.out.println("Name is: " + getName());
    }
}
