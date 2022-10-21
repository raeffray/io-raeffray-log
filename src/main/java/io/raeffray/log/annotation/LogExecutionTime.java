package io.raeffray.log.annotation;

import io.raeffray.log.AspectLogger;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)

/**
 *
 * It will mark method as a subject to be measured by @{@link AspectLogger}
 *
 * */ public @interface LogExecutionTime {


}
