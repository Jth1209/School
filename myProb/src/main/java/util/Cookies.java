package util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Cookies {
	private Map<String,Cookie> cookieMap = new java.util.HashMap<String,Cookie>();
	
	public Cookies(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				cookieMap.put(cookies[i].getName(), cookies[i]);//해당 쿠키의 key 값과 쿠키 본인을 cookieMap의 key 와 value 값으로 저장*************************
			}
		}
	}
	
	public Cookie getCookie(String name) {//쿠키 꺼내기
		return cookieMap.get(name);
	}
	
	public String getValue(String name) throws UnsupportedEncodingException {//쿠키 값 꺼내기
		Cookie cookie = cookieMap.get(name);
		if(cookie == null) {
			return null;
		}
		return URLDecoder.decode(cookie.getValue(),"utf-8");
	}
	
	public boolean exists(String name) {//쿠키 존재 여부
		return cookieMap.get(name) != null;
	}

	public static Cookie createCookie(String name, String value) throws IOException { //키값와 value값을 매개변수로 받아서 쿠키를 생성해주는 메소드
		return new Cookie(name, URLEncoder.encode(value, "utf-8"));
	}

	public static Cookie createCookie(String name, String value, String path, int maxAge) throws IOException {//매개변수로 키값 value값 패스값 최대 생존 시간 설정
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8"));
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
	}
	
	public static Cookie createCookie(String name, String value, String domain,String path, int maxAge) throws IOException {
		Cookie cookie = new Cookie(name, URLEncoder.encode(value, "utf-8"));
		cookie.setDomain(domain);
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
	}
}
