package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.hibernate.validator.internal.xml.binding.ElementType;

@Documented
@Constraint(validatedBy= PasswordCheckValidator.class)
@Target({java.lang.annotation.ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordCheck {
	String message() default " "; 
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
