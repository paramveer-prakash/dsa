package com.param.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DSAProblem {
    String name();
    int number() default 0;
    String url() default "";
    String description() default "";
    String platform() default "";
}
