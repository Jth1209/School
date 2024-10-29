package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import spring.RegisterRequest;

public class RegisterRequestValidator implements Validator{
	
	//정규식이라고 찾아보면 나옴 AI 쓰셈
	private static final String emailRegExp =
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
			"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private Pattern pattern;
	
	public RegisterRequestValidator() {
		pattern = Pattern.compile(emailRegExp);
	}

	@Override
	public boolean supports(Class<?> clazz) {
		//검증 가능하지 판단
		return RegisterRequest.class.isAssignableFrom(clazz);
	}

	@Override
	//target을 검증하고 오류가 있으면 errors에 저장
	public void validate(Object target, Errors errors) {
		//target을 regReq로 설정해서 controller에 적용
		RegisterRequest regReq = (RegisterRequest) target;
		if(regReq.getEmail() == null || regReq.getEmail().trim().isEmpty()) {
			//이메일을 적지 않았을 경우
			errors.rejectValue("email", "required");
		}else {
			Matcher matcher = pattern.matcher(regReq.getEmail());//패턴을 정규식으로 초기화해서 해당 규격에 맞는지 확인
			if(!matcher.matches()) {
				//잘못된 형식의 이메일일 경우
				errors.rejectValue("email","bad");
			}
		}
		
		//이름,비밀번호,비밀번호 확인을 입력하지 않았을 경우
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required");
		ValidationUtils.rejectIfEmpty(errors, "password", "required");
		ValidationUtils.rejectIfEmpty(errors, "confirmPassword", "required");
		
		//비밀번호 확인에 대한 오류 (같지 않을 경우)
		if(!regReq.getPassword().isEmpty()) {
			if(!regReq.isPasswordEqualToConfirmPassword()) {
				errors.rejectValue("confirmPassword", "nomatch");
			}
		}
		
	}

}
