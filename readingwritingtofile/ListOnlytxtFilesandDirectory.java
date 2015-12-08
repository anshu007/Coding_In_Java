package com.readingwritingtofile;

import java.io.File;
import java.io.FilenameFilter;

public class ListOnlytxtFilesandDirectory {

	public static void main(String[] args) {

		File f = new File("C:/Files1");

		FilenameFilter fn = new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if (name.endsWith(".properties"))
					return true;
				else
					return false;
			}
		};

		File[] ff = f.listFiles(fn);
		for (File list : ff) {
			/*
			 * if(list.isDirectory()) System.out.println("ha"); else{
			 * System.out.println("ja"); }
			 */
			System.out.println(list.getAbsolutePath());
		}

	}

}
