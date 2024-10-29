package config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.resource.DefaultServletHttpRequestHandler;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
//@EnableWebMvc //handlerAdapter와 handlerMapping, requestHandlerAdapter의 기능을 가지고 있다. handlerAdapter만 있어도 다 수행이 되긴함.
public class MvcConfig implements WebMvcConfigurer{//해당 인터페이스가 가지고 있는 기능이 SimpleUrlHandlerMapping와 DefaultServletHttpRequestHandler다.

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

//	@Bean
//	public HandlerMapping handlerMapping() {//요청에 맞는 컨트롤러를 찾아줌
//		RequestMappingHandlerMapping hm = new RequestMappingHandlerMapping();
//		hm.setOrder(0);
//		return hm;
//	}

	@Bean
	public HandlerAdapter handlerAdapter() {//
		RequestMappingHandlerAdapter ha = new RequestMappingHandlerAdapter();
		return ha;
	}

//	@Bean
//	public HandlerMapping simpleHandlerMapping() {//요청에 맞는 컨트롤러를 찾아줌
//		SimpleUrlHandlerMapping hm = new SimpleUrlHandlerMapping();
//		Map<String, Object> pathMap = new HashMap<>();
//		pathMap.put("/**", defaultServletHandler());
//		hm.setUrlMap(pathMap);
//		return hm;
//	}

//	@Bean
//	public HttpRequestHandler defaultServletHandler() {
//		DefaultServletHttpRequestHandler handler = new DefaultServletHttpRequestHandler();
//		return handler;
//	}

//	@Bean
//	public HandlerAdapter requestHandlerAdapter() {//controller가 가지고 온 데이터를 ModelAndView로 치환해서 Dispatcher에게 전달.
//		HttpRequestHandlerAdapter ha = new HttpRequestHandlerAdapter();
//		return ha;
//	}

	@Bean
	public ViewResolver viewResolver() {//view의 루트 이름을 조립해주는 역할
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/view/");
		vr.setSuffix(".jsp");
		return vr;
	}

}
