package jinjie;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exam1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("上机编程题2-1.pdf");
			BufferedInputStream bis=new BufferedInputStream(fis,1000000);
			FileOutputStream fos=new FileOutputStream("上机编程题2-1new.pdf");
			BufferedOutputStream bos=new BufferedOutputStream(fos,1000000);
			byte p[]=new byte[100000];
			int count=0;
			long be=System.currentTimeMillis();
			while(bis.read(p)!=-1){
				bos.write(p);
			count++;
			}
			bos.close();
			fos.close();
			bis.close();
			fis.close();
			long af=System.currentTimeMillis();
			System.out.println("读取了"+count+"次");
			System.out.println("读取时间为："+(af-be)+" ms");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
