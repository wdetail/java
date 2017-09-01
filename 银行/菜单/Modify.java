package 菜单;

import 信息缓存.AccountCache;
import 内容.User;
import 工具.Input;
import 工具.Input.Type;

public class Modify {//修改

	public static void Reform(){		
		String card = AccountCache.getInstance().getWrapData().getAccount().getCard();
		User user = AccountCache.getInstance().getWrapData().getAccount().getUser();
		System.out.println("个人信息:"+card+"\t"+user.toString());		
		System.out.print("------修改信息------\n请修改联系方式:");
		String tel1=Input.getInput(Type.STRING).toString();
		System.out.println("修改结果为:"+tel1);
		System.out.print("请修改密码:");
		String cipher1=Input.getInput(Type.STRING).toString();
		System.out.println("修改结果为:"+cipher1);
		System.out.println("------信息修改成功------");
		
		AccountCache.getInstance().getWrapData().getAccount().setCipher(cipher1);
		AccountCache.getInstance().getWrapData().getAccount().getUser().setTel(tel1);
	    Menu.MainMenu();
	}
	
}
