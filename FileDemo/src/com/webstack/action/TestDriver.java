package com.webstack.action;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		
		System.out.println("Hello Radhe Krishna...!");
		
		try {
			InputStream fileStream = new FileInputStream("E:\\keyur-java\\FullStack@WebTech\\java_datastructure\\course.txt");
			Scanner scanner = new Scanner(fileStream);
			StringBuilder fileContent = new StringBuilder();
			while(scanner.hasNext()) {
				//System.out.println(scanner.nextLine());
				String line = scanner.nextLine();
				System.out.println(line);
				fileContent.append(line+"\n");
			}
			fileStream.close();	
			OutputStream fileOuptPutStream = new FileOutputStream("E:\\keyur-java\\FullStack@WebTech\\java_datastructure\\course_1.txt");
			DataOutputStream dataOutputStream = new DataOutputStream(fileOuptPutStream);
			dataOutputStream.writeBytes(fileContent.toString());
			dataOutputStream.close();
			fileOuptPutStream.close();	
			
			System.out.println("==================");
			
			File files = new File("E:\\keyur-java\\FullStack@WebTech\\java_datastructure");
			
			File newDir = new File("E:\\keyur-java\\FullStack@WebTech\\java_datastructure\\NewDir\\a.txt");
			
			//newDir.mkdir();
			
			newDir.createNewFile();
						
			
			
			List<String> filesDirList = Arrays.asList(files.list());
			filesDirList.forEach(f->{
					File temp=new File("E:\\keyur-java\\FullStack@WebTech\\java_datastructure\\"+f);
					if(temp.isDirectory()) {
						System.out.println(f +" is a Directory.");
					}else if(temp.isFile()) {
						System.out.println(f +" is a File.");
					}					
				}
			);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Done...!");
		
		

	}

}
