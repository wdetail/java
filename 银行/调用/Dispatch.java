package ����;

import �����.Service;
import �˵�.Menu;

public class Dispatch {

//	private static Service service = new Service();

	public static void dispatch(String forward) {

		switch (forward) {

		case "account.login":

			Service.doLogin();

			break;
			
		case "������":

			System.out.println("---���˵�---");
			Menu.MainMenu();

			break;

		default:
			break;
		}

	}

}
