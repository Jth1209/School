package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import controller.ChangePwdController;
import controller.LoginController;
import controller.LogoutController;
import controller.RegisterController;
import spring.AuthService;
import spring.ChangePasswordService;
import spring.MemberRegisterService;

@Configuration
public class ControllerConfig {

	@Autowired
	private MemberRegisterService memberRegSvc;
	@Autowired
	private AuthService authService;
	@Autowired
	private ChangePasswordService changePasswordService;

	@Bean
	public RegisterController registerController() {
		RegisterController controller = new RegisterController();
		controller.setMemberRegisterService(memberRegSvc);
		return controller;
	}

	@Bean
	public LoginController loginController() {
		LoginController loginController = new LoginController();
		loginController.setAuthService(authService);
		return loginController;
	}

	@Bean
	LogoutController logoutController() {
		LogoutController logout = new LogoutController();
		return logout;
	}

	@Bean
	ChangePwdController changePwdController() {
		ChangePwdController cpc = new ChangePwdController();
		cpc.setChangePasswordService(changePasswordService);
		return cpc;
	}

}
