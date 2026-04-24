package AdvanceJava.Generics;

public class Example {
    Object container;

    Example(Object container){
        this.container=container;
    }

    public void getValue(){
        this.container=container;
        System.out.println("Value: "+container);
    }

    public static void main(String[] args) {
        Example example1=new Example(10);
        example1.getValue();

        Example example2=new Example("Hello");
        example2.getValue();
    }
}


