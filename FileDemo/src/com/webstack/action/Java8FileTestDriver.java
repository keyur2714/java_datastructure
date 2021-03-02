package com.webstack.action;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FileTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		Path path = Paths.get("E:\\keyur-java\\FullStack@WebTech\\java_datastructure\\course.txt");
		
		try(Stream<String> lines = Files.lines(path)){
			//lines.forEach(line->System.out.println(line));
			List<String> filteredLines = lines.filter(line->line.contains("1 Hrs")).collect(Collectors.toList());
			filteredLines.forEach(fLine->System.out.println(fLine));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("---------------------");
		StringBuilder content = new StringBuilder("Hello From Java 8 Files.");
		
		Path newFilePath = Paths.get("E:\\keyur-java\\FullStack@WebTech\\java_datastructure\\dummy.txt");
		
		try {
			Files.write(newFilePath, content.toString().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Done...!");
	}

}
