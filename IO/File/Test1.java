package File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Test1 {
	
	public static void main(String[] args) throws IOException {
		
		//�����ļ�
		File file = new File("d:/�˿�/renjun.txt");
		File test = new File("d:/�˿�");
		
		File io = new File("io.txt");//���·��
		
		//�����ļ�
		File newFile = new File("d:/�˿�/haijun.txt");
		
		
		System.out.println("file�Ƿ����:"+file.exists());
		System.out.println("test���ļ���:"+test.isDirectory());
		System.out.println("file length : " + file.length() + " �ֽ� ");
		System.out.println("file �����޸�ʱ���� : " + new Date( file.lastModified()));
		System.out.println("file �Ƿ��д�� : " + file.canWrite());
		file.setWritable(true);
		System.out.println("file �Ƿ��д�� : " + file.canWrite());
		
		//�����ļ�
	    boolean flag = newFile.createNewFile();
	    
	    //lists
	    File[] files = test.listFiles();
	    for(File f:files){
	    	System.out.println(f.getName());
	    }
	    
	    System.out.println("io �ľ���·�� : "+io.getAbsolutePath() );
	    
	    io.delete();
	    
	    System.out.println(file.getFreeSpace()/1024/1024/1024);
	    
	    System.out.println(file.getUsableSpace()/1024/1024/1024);
	    
	}

}
