class Thread10 extends Thread {
    Thread10(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("Thread Runnning " + this.getName());
            i++;
        }
    }
}

public class PriorityThread {
    public static void main(String[] args) {
        Thread10 t1 = new Thread10("A1");
        Thread10 t2 = new Thread10("A2");
        Thread10 t3 = new Thread10("A3");
        Thread10 t4 = new Thread10("A4");
        Thread10 t5 = new Thread10("A5");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
