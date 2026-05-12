package Design_Modeling.MultiThreading;
import java.util.*;
public class RunnableDemo implements Runnable{

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread 1 is running "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        RunnableDemo demo = new RunnableDemo();  // runnable object bana
        Thread t1=new Thread(demo);
        t1.start();
    }
}
