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
			FileInputStream fis=new FileInputStream("�ϻ������2-1.pdf");
			BufferedInputStream bis=new BufferedInputStream(fis,1000000);
			FileOutputStream fos=new FileOutputStream("�ϻ������2-1new.pdf");
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
			System.out.println("��ȡ��"+count+"��");
			System.out.println("��ȡʱ��Ϊ��"+(af-be)+" ms");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
