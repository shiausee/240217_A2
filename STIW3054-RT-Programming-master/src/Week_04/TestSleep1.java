package Week_04;

class TestSleep1 {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();
        Thread.sleep(5000);
        System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));
    }
}
