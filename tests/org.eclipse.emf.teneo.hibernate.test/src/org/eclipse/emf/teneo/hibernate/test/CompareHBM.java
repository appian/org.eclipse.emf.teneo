/**
 * <copyright> Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others All rights
 * reserved. This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Martin Taal </copyright> $Id:
 * ReadEcore.java,v 1.6 2007/03/18 19:18:50 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Compare Hbm files
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.8 $
 */
public class CompareHBM {

	private static final String fromDir =
			"/home/mtaal/mydata/dev/workspaces/nextspace/org.eclipse.emf.teneo.hibernate.test/hbm";
	private static final String toDir =
			"/home/mtaal/mydata/dev/workspaces/nextspace/org.eclipse.emf.teneo.hibernate.test/hbm_old";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			walkFiles(new File(fromDir), new File(toDir));
// copyFiles(new File(fromDir), new File(toDir));
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	private static void walkFiles(File from, File to) throws Exception {
		for (File f : from.listFiles()) {
			if (f.getPath().indexOf("CVS") != -1) {
				continue;
			}
			if (f.isDirectory()) {
				walkFiles(f, to);
			} else {
				File t = getTargetFile(f.getName(), to);
				if (t != null) {
					final String result = compare(f, t);
					if (result != null) {
						System.err.println("NOT EQUAL: " + f.getAbsolutePath());
						System.err.println(result + "\n");
					} else {
						// System.err.println("EQUAL: " + f.getAbsolutePath());
					}
				}
			}
		}
	}

	private static File getTargetFile(String fileName, File directory) {
		for (File f : directory.listFiles()) {
			if (f.getName().compareTo(fileName) == 0) {
				return f;
			}
		}
		return null;
	}

	private static String compare(File f, File t) throws Exception {
		BufferedReader from = new BufferedReader(new FileReader(f));
		BufferedReader to = new BufferedReader(new FileReader(t));
		String fromLine;
		while ((fromLine = from.readLine()) != null) {
			String toLine = to.readLine();
			if (toLine == null) {
				return ">> Old file is smaller";
			}
			if (toLine.compareTo(fromLine) != 0) {
				return "New>> " + fromLine + "\n" + "Old>> " + toLine;
			} else {
				// System.err.println(">>> " + toLine);
			}
		}
		if (to.readLine() != null) {
			return ">> New file is smaller";
		}
		return null;
	}

//	private static void copyFiles(File from, File to) throws Exception {
//		for (File f : from.listFiles()) {
//			if (f.getPath().indexOf("CVS") != -1) {
//				continue;
//			}
//			if (f.isDirectory()) {
//				final File toDir = new File(to, f.getName());
//				if (!toDir.exists()) {
//					toDir.mkdir();
//				}
//				copyFiles(f, toDir);
//			} else {
//				File t = getTargetFile(f.getName(), to);
//				if (t != null) {
//					t.delete();
//				}
//				t = new File(to, f.getName());
//				copy(f, t);
//			}
//		}
//	}

//	private static void copy(File f, File t) throws Exception {
//		BufferedReader from = new BufferedReader(new FileReader(f));
//		FileWriter to = new FileWriter(t);
//		String fromLine;
//		boolean begin = true;
//		while ((fromLine = from.readLine()) != null) {
//			if (!begin) {
//				to.write("\n");
//			}
//			to.write(fromLine);
//		}
//	}
}