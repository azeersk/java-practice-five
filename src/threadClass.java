class One extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}

class Two extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);}catch (Exception e){}
        }
    }
}

public class threadClass {
    public static void main(String[] args){
        One obj1 = new One();
        Two obj2 = new Two();
        obj1.start();
        try{Thread.sleep(10);}catch (Exception e){};
        obj2.start();
    }
}
