class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println(i + " Thread1 Running  ");
            i++;
        }
    }
}

class MyThreadRunnable implements Runnable {
    public void run() {
        int j = 0;
        while (j < 20) {
            System.out.println(j + " Runnable Thread Running ");
            j++;
        }
    }
}

class ConstructorsThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Nitesh");
        t1.start();
        System.out.println(" I.D : " + t1.getId());
        System.out.println(" Name :  " + t1.getName());
        MyThreadRunnable r1 = new MyThreadRunnable();
        Thread tr1 = new Thread(r1, "Runnable Thread 2.0 ");
        tr1.start();
        System.out.println("ID of Runnable Thread : " + tr1.getId());
        System.out.println("Name of RUnnable Thread : " + tr1.getName());
    }

}
