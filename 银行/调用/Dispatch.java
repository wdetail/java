package 调用;

import 服务层.Service;
import 菜单.Menu;

public class Dispatch {

//	private static Service service = new Service();

	public static void dispatch(String forward) {

		switch (forward) {

		case "account.login":

			Service.doLogin();

			break;
			
		case "主函数":

			System.out.println("---主菜单---");
			Menu.MainMenu();

			break;

		default:
			break;
		}

	}

}
