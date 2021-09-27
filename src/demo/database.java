package demo;

import java.sql.*;
import java.io.*;
public class database {

	String name;
	String pwd;


	public database() throws IOException {
		
		try (FileOutputStream output = new FileOutputStream("book.txt");)
		{
			for(int i=1;i<=100000;i++)
				output.write(i);
		}
		


	}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}}
