package com.aitrich.inventorysystem.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.aitrich.inventorysystem.domain.Customer;

public abstract class FileDataAccessObject implements DataAccessObject{
	

	private String persistenceFilePath;
	private int j = 0;
	private BufferedWriter bw;
	private BufferedWriter ibw;
	private BufferedReader br;
	private BufferedReader bread;
	private FileWriter fw;
	private FileReader fr;
	private FileReader fread;
	public FileDataAccessObject(String persistenceFilePath) {
		super();
		this.persistenceFilePath = persistenceFilePath;
	}
	public String getPersistenceFilePath() {
		return persistenceFilePath;
	}
	public void setPersistenceFilePath(String persistenceFilePath) {
		this.persistenceFilePath = persistenceFilePath;
	}
	
	@Override
	public void insert(Object object) {
		String details=objectToCSVRecord(object);
		try {
			System.out.println("============writing data to the file==============");
			fw=new FileWriter(persistenceFilePath,true);
			bw=new BufferedWriter(fw);
			bw.write(details);
			bw.newLine();
		} catch (Exception e) {
			System.out.println("error in file");
			e.printStackTrace();
		}				
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				System.out.println("i/o");
				e.printStackTrace();
			}
			
		}
		
					
	}
	
	@Override
	public Object[] findAll() {
		Object[] obj = null;
		try {
			 fread=new FileReader(persistenceFilePath);
			 bread=new BufferedReader(fread);
			String a;
			
			while((a=bread.readLine())!=null) {
				j++;
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			e.printStackTrace();
		}finally {
			try {
				bread.close();
				fread.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		try {
			System.out.println("======Reading from the file======");
			fr=new FileReader(persistenceFilePath);
			br=new BufferedReader(fr);
			
			String s;
			int i=0;
			obj=new Object[j];
			while((s=br.readLine())!=null) {
				obj[i]=csvRecordToObject(s);
				i++;
			}
		} catch (Exception e) {
			System.out.println("Exception: " + e);
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return obj;
		
	}

	protected abstract String objectToCSVRecord(Object object);

	protected abstract Object csvRecordToObject(String cvsRecord);
}
