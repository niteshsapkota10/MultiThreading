class ThreadRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println(i + " Thread 1 Running !!! ");
            i++;
        }
    }
}

class ThreadRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println(i + " Thread 2 Running !!! ");
            i++;
        }
    }
}

class RunnableThread {
    public static void main(String[] args) {
        ThreadRunnable1 tr1 = new ThreadRunnable1();
        ThreadRunnable2 tr2 = new ThreadRunnable2();
        Thread t1 = new Thread(tr1);
        Thread t2 = new Thread(tr2);
        t1.start();
        t2.start();
    }
}
