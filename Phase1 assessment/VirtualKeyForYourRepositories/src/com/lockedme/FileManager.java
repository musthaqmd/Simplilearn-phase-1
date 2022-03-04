package com.lockedme;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
	
	/**
	 * This method will return the file names and the folder
	 * @param folderpath
	 * @return
	 */
	public static List<String> getAllFiles(String folderpath)

	{
		//Creating File Object
		File f1 = new File (folderpath);
		
		//Getting all files into File array
		File [] listOfFiles = f1.listFiles();
		//Declare a list to store file names
		List<String> fileNames = new ArrayList<String>();
		
		for (File f:listOfFiles)
			fileNames.add(f.getName()); 
			//return the list
			return fileNames;
		
	}


	/**
	 * this method will create or append content in the folder
	 * @param folderpath
	 * @param fileName
	 * @return
	 */
	public static boolean addFiles(String folderpath,String fileName,List<String> content)
	
	{
		try 
		{
			File f = new File(folderpath,fileName);
			FileWriter fw =new FileWriter(f);
			for (String s:content)
			{
				fw.write(s+"\n");
			}
			fw.close();
			return true;
		}
		catch(Exception Ex)
		{
			return false;
		}
		
	}
	
	
	/**
	 * This method will delete the content in the folder
	 * @param folderpath
	 * @param fileName
	 * @return
	 */
	public static boolean deleteFile(String folderpath, String fileName)
	{
		//adding folder with file name and folderpath
		File file = new File(folderpath+"\\"+fileName);
		try
		{
			if(file.delete())
			return true;
			else 
				return false;
		}
		catch(Exception Ex)
		{
			return false;
		}
	}

	
	/**
	 * This method will search the content in the folder
	 * @param folderpath
	 * @param fileName
	 * @return
	 */
	public static boolean searcFile(String folderpath, String fileName)
	{
		//adding folder with file name and folderpath
		File file = new File(folderpath+"\\"+fileName);
		try
		{
			if(file.exists())
			return true;
			else 
				return false;
		}
		catch(Exception Ex)
		{
			return false;
		}
	}
	
	
	}
	
