package Design_Modeling.MultiThreading;

public class ThreadClass extends Thread {
    public void run(){
        for(int i=10;i>=0;i--){
            System.out.println("Thread 2 is running "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        ThreadClass t=new ThreadClass();
        t.start();   // start new thread create krta hai orrr internally run method cll krta hai...
    }
}
