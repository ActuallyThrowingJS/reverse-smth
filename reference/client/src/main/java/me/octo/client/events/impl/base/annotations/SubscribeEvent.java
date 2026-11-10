package me.octo.client.events.impl.base.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import me.octo.client.events.impl.base.EventPriority;

@Retention(AnnotationRetention.RUNTIME)
@Target(allowedTargets = AnnotationTarget.FUNCTION)
@java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(ElementType.METHOD)
public @interface SubscribeEvent {
   EventPriority priority() default EventPriority.NORMAL;

   boolean receiveCanceled() default false;
}
