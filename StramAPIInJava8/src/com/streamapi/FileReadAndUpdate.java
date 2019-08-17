package com.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReadAndUpdate {

	public static void main(String args[]) throws IOException{
		
		// Read the file and print the required message in a stream
		System.out.println("Read a file and print the required message in a stream");
		List<String> stringList = Files.lines(Paths.get("C:/Users/User/Desktop/stream-file-reader-updated.txt"))
			.filter(line -> line.contains("name"))
			.map(line -> line.replaceAll("name", "")
						.replaceAll("<", "")
						.replaceAll(">", "")
						.replaceAll("/", ""))
			.collect(Collectors.toList());
		
		System.out.println(stringList);
		
		// Read multiple files and print the required message in a stream
		System.out.println("Read multiple files and print the required message in a stream");
		List<String> stringOfUrl = Files.lines(Paths.get("C:/Users/User/Desktop/stream-file-reader-updated1.txt"))
		.filter(line -> line.contains("url"))
		.map(line -> line.replaceAll("url", "")
				.replaceAll("<", "")
				.replaceAll(">", "")
				.replaceAll("/", ""))
		.collect(Collectors.toList());
		
		System.out.println(stringOfUrl);
		
		/**
		 * File is containing below Data
		 * 
		 * <name>Ramesh</name>
		   <url>http://localhost:8080</url>
		 *  
		 **/
		
		
		/**
		 * OUTPUT:- 
		 * Read a file and print the required message in a stream
			[Ramesh]
			Read multiple files and print the required message in a stream
			[http:localhost:8080]
		 **/
	}
}
