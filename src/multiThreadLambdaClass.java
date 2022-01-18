public class multiThreadLambdaClass {
    public static void main(String[] args){
        Thread t1 = new Thread(()->{for(int i=0; i<5; i++) {
            System.out.println("hi class!!");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }});

        Thread t2 = new Thread(()->{for(int i=0; i<5; i++) {
            System.out.println("hello class!!");
            try {Thread.sleep(500);} catch (Exception e) {}

        }});
        t1.start();
        try{ Thread.sleep(10);}catch(Exception e) {}
        t2.start();
        }
    }