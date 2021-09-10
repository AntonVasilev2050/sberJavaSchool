package Theme08Serialization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Cache {
    String accountableParameter() default "all";
    int cacheType() default 0;
    String fileNamePrefix() default "data";
    boolean zip() default false;
    int listList() default 10000;
//    Object[] identityBy() default {String.class, double.class};

}
