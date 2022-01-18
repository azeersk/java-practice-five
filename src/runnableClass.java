class Hi implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
        System.out.println("hi class!!");
        try{Thread.sleep(500);}
        catch(Exception e){};
        }
    }
}

class hello implements Runnable{
    public void run(){
        for(int i=0; i<5; i++) {
            System.out.println("hello class!!");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

public class runnableClass {
    public static void main(String[] args){
        Runnable obj1 = new Hi();
        Runnable obj2 = new hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try{ Thread.sleep(10);}catch(Exception e){System.out.println("error");
        }
        t2.start();

    }
}
