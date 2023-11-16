package Task10_02;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnimalAnno {
    int age() default 0;
    String color() default "black";
}
