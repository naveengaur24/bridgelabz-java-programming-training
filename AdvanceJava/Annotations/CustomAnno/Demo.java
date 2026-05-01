package AdvanceJava.Annotations.CustomAnno;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;


@MyAnnotation(
        value="Class Annotation run hoga",
        age=25
)

public class Demo {
    @MyAnnotation(
            value="Field Annotation run hoga",
            age=20
    )
    String name;

    @MyAnnotation(
            value="Method Annotation run hoga"
            // age=35       ye default value lega
    )
    public void show(){

    }

    public static void main(String[] args) throws Exception {
        Demo obj = new Demo();
        // CLASS Annotation
        MyAnnotation classAnno =obj.getClass().getAnnotation(MyAnnotation.class);
        System.out.println("Class Value "+ classAnno.value());
        System.out.println("Class Age "+ classAnno.age());



        // FIELD Annotation
        Field field=obj.getClass().getDeclaredField("name");
        MyAnnotation fieldAnno=field.getAnnotation(MyAnnotation.class);
        System.out.println("Field Value "+ fieldAnno.value());
        System.out.println("Field Age "+ fieldAnno.age());



        // METHOD Annotation 
        Method method=obj.getClass().getDeclaredMethod("show");
        MyAnnotation methodAnno=method.getAnnotation(MyAnnotation.class);
        System.out.println("Method Value "+ methodAnno.value());
        System.out.println("Method Age "+ methodAnno.age());
    }
}