package Design_Modeling.MultiThreading;



public class UserDefinedThread extends Thread{

    public void run(){
        System.out.println("this is user defined thread..");
    }
}

class ThreadOperations {
    public static void main(String[] args) {

        // getting reference to current thread
        Thread t=Thread.currentThread();

        // getting name of current thread
        String tName=t.getName();
        System.out.println("Current thread name is "+tName);


        // putting current thread to sleep for 5 seconds
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            System.out.println(e);
        }


        // getting id of current thread
        System.out.println("id of current thread is :" + t.getId());


        // changing name of current thread
        t.setName("Naveen");
        System.out.println("Current thread name is "+t.getName());

        System.out.println("---------------------------------------");


        // creating instance of user defined thread
        UserDefinedThread t1=new UserDefinedThread();
        // starting user defined thread
        t1.start();
    }
}
