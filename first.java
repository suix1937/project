

package net.shapelight.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 *
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TenLog {

	String value() default "";
}
