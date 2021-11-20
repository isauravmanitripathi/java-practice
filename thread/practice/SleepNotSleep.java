public class SleepNotSleep {
    public static void main(String[] args) {
        Thread2 alpha = new Thread2 ();
        alpha.start();
        try {
            Thread.sleep(10); // 10 milliseconds
        }
        catch (InterruptedException e) {
        }
        System.out.println("pi = " +alpha.pi);
    }
}
class Thread2 extends Thread{
    boolean negative = true;
    double pi;
    public void run(){
        for(int i = 3; i < 100000; i += 2) {
            if (negative)
                pi -= (1.0/i);
            else
                pi += (1.0/ i);
            negative = !negative;
        }
        pi += 1.0;
        pi *= 4.0;
        System.out.println("Done");
    }

}
