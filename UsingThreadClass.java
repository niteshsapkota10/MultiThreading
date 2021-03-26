class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println(i + " Thread 1 Running ");
            i++;
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println(i + " Thread 2 Running !! ");
            i++;
        }
    }
}

class UsingThreadClass {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}