package 服务层;

import 信息缓存.AccountCache;
import 内容.Account;
import 实现层.Handler;
import 工具.Input;
import 工具.Input.Type;
import 调用.Dispatch;

public class Service {

	private static Handler handler = new Handler();
	
	static int time = 0; //计数器 3
	
	public static void doLogin() {
		System.out.println("＄欢迎登录★★银行＄");
		Account temp = new Account();
		System.out.print("请输入您的卡号:");
		temp.setCard(Input.getInput(Type.STRING).toString());
		System.out.print("请输入您的密码:");
		temp.setCipher(Input.getInput(Type.STRING).toString());
		int result = (int)(Math.random() * 10000+1000 );
		String r = String.valueOf(result);
		System.out.print("请输入验证码:("+result+")");		
		String number = Input.getInput(Type.STRING).toString();
		
		temp = handler.CheckAccount(temp);   // 此时的 temp 已经是库的里 某位用户的全部信息了
		
		if(temp!=null && number.equals(r)) { 
			//如果登录成功将登录成功的用户  保存进缓存.
			AccountCache.getInstance().getWrapData().setAccount(temp);
	
			Dispatch.dispatch("主函数");
			
		}else {
			if(time<2) {
				System.out.println("---第 "+ ++time +" 次登录失败 , 请重新登录---");
				doLogin();
			} else {
				System.out.println("---对不起,您今天登陆次数超限,请明天再来!!!---");
				System.exit(0);
			}
		}
	}
	
}
