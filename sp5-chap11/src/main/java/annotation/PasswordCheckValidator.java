package annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import spring.RegisterRequest;

public class PasswordCheckValidator implements ConstraintValidator<PasswordCheck, RegisterRequest> {

	@Override
	public void initialize(PasswordCheck constraintAnnotation) {
	}

	@Override
    public boolean isValid(RegisterRequest registerRequest, ConstraintValidatorContext context) {
        boolean isValid = registerRequest.getPassword().equals(registerRequest.getConfirmPassword());

        if (!isValid) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("입력하신 비밀번호와 확인된 비밀번호가 서로 다릅니다.")
                    .addPropertyNode("confirmPassword")
                    .addConstraintViolation();
        }
        return isValid;
    }
	

}
