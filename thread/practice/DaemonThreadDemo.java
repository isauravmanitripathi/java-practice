public class DaemonThreadDemo {
    public static void main(String[] args) {
        if (args.length ==0 )
            new Thread6().start();
        else {
            Thread6 alpha = new Thread6();
            alpha.setDaemon(true);
            alpha.start();
        }
        try{
            Thread.sleep(100);
        } catch (InterruptedException e){
        }
    }
}
class Thread6 extends Thread {
    public void run(){
        System.out.println("Daemon is " + isDaemon());
        while(true);
    }
}
