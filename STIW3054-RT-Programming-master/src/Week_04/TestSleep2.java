package Week_04;

class TestSleep2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
            //System.out.println("thread"+Thread.currentThread().getPriority());
            if((Thread.currentThread().getName()).equals("Three")){
                System.out.println("*******");
            }
            try {
                // thread to sleep for 5000 milliseconds
                Thread.sleep(5000);
                 
            } catch (Exception e) {
                System.out.println(e);
            }
           
        }
    }

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(new TestSleep2(), "One");
        Thread t2 = new Thread(new TestSleep2(), "TWO");
        Thread t3 = new Thread(new TestSleep2(), "Three");
       // Thread t4 = new Thread(new TestSleep2(), "******");
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.start();
        t3.setPriority(Thread.MIN_PRIORITY);
      /*  t4.start();
        t4.setPriority(Thread.MIN_PRIORITY);*/
        
       
        
    }
}
