package �ֽ���;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test3 {
	public static void main(String[] args) throws Exception {
		File from = new File("d:/�˿�/Wildlife.wmv");
		File to = new File("d:/�˿�/Wildlife1.wmv");

		InputStream in = new FileInputStream(from);
		OutputStream out = new FileOutputStream(to);

		byte[] datas = new byte[in.available()];

		in.read(datas);

		out.write(datas);
		to.createNewFile();

	}
}
