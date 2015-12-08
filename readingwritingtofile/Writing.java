package com.readingwritingtofile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Writing {
	public static void main(String[] args)
	{
		File file =new File("C:\\anshufile.txt");
		try {
			OutputStream fop=new FileOutputStream(file);
			if(!file.exists()){
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
			String content="This is file";
			byte[] contentbytes=content.getBytes();
			fop.write(contentbytes);
		//	fop.write()
			fop.flush();
			fop.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
