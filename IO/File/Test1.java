package File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Test1 {
	
	public static void main(String[] args) throws IOException {
		
		//访问文件
		File file = new File("d:/人俊/renjun.txt");
		File test = new File("d:/人俊");
		
		File io = new File("io.txt");//相对路径
		
		//创建文件
		File newFile = new File("d:/人俊/haijun.txt");
		
		
		System.out.println("file是否存在:"+file.exists());
		System.out.println("test是文件？:"+test.isDirectory());
		System.out.println("file length : " + file.length() + " 字节 ");
		System.out.println("file 最后的修改时间是 : " + new Date( file.lastModified()));
		System.out.println("file 是否可写入 : " + file.canWrite());
		file.setWritable(true);
		System.out.println("file 是否可写入 : " + file.canWrite());
		
		//创建文件
	    boolean flag = newFile.createNewFile();
	    
	    //lists
	    File[] files = test.listFiles();
	    for(File f:files){
	    	System.out.println(f.getName());
	    }
	    
	    System.out.println("io 的绝对路径 : "+io.getAbsolutePath() );
	    
	    io.delete();
	    
	    System.out.println(file.getFreeSpace()/1024/1024/1024);
	    
	    System.out.println(file.getUsableSpace()/1024/1024/1024);
	    
	}

}
