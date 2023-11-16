package Task10_02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) {
        try {
            Cat cat = new Cat();
            Annotation[] classAnnotations = cat.getClass().getAnnotations();

            System.out.println(cat.getClass().getName() + "\nClass annotations:");
            for (Annotation annotation : classAnnotations)
                System.out.println("\t" + annotation);

            Method[] classMethods = cat.getClass().getDeclaredMethods();
            System.out.println("Method annotations:");
            for (Method method : classMethods) {
                Annotation[] methodAnnotations = method.getDeclaredAnnotations();
                if (methodAnnotations.length > 0) {
                    System.out.println("\t" + method.getName() + "():");
                }
                for (Annotation annotation : methodAnnotations) {
                    System.out.println("\t" + annotation);
                }
            }
            System.out.println("Field annotations:");
            Field field=cat.getClass().getField("name");
            Annotation[] fieldAnno=field.getAnnotations();
            for (Annotation annotation : fieldAnno) {
                System.out.println("\t" + annotation);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
