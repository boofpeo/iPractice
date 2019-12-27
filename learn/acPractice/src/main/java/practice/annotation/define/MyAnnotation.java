package practice.annotation.define;


import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {

    String value() default "equals";

    Class<? extends Object>[] params() default {String.class, String.class};
}
