package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberNotFoundException;
import spring.WrongIdPasswordException;

public class Main2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppCtx.class);

        MemberDao dao = ctx.getBean(MemberDao.class);
        
        System.out.println(dao.countTest());
        
        System.out.println(dao.selectMemberTest2(2));
        
        System.out.println(dao.selectByEmail("aaa@korea.com"));
        
		ctx.close();

	}
}
