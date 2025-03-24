package com.kama.minispring.boot.autoconfigure;
import java.lang.annotation.*;
/**
 * 标记需要注入Environment的自动配置类
 * 
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequiresEnvironment {
} 