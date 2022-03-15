package TpServeurJava;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		
		
		
		Map<Integer,String> l = new TreeMap<Integer,String>();
		l.put(1,"a");l.put(2,"b");l.put(3,"c");l.put(4,"d");l.put(5,"e");l.put(6,"f");l.put(7,"g");
		l.put(8,"h");l.put(9,"i");l.put(10,"j");l.put(11,"k");l.put(12,"l");l.put(13,"m");l.put(14,"n");
		l.put(15,"o");l.put(16,"p");l.put(17,"q");l.put(18,"r");l.put(19,"s");l.put(20,"t");l.put(21,"u");
		l.put(22,"v");l.put(23,"w");l.put(24,"x");l.put(25,"y");l.put(26,"z");
		
		
		String s ="7li";
		String c =""+ s.charAt(0);
		c = c.toLowerCase();
		if(l.containsValue(c))
			System.out.println("s : "+s+"\nc : "+c+"\n contient");
		else
			System.out.println("ne contient pas");
//		Path path = Paths.get("/home/ousseini/Desktop/toto.txt");
//		List<String> lines;
//		try {
//			lines = Files.readAllLines(path);
//			lines.add(2, "test"); // index 3: between 3rd and 4th line
//			Files.write(path, lines);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("Modification terminée");
		
		
		
		/*Path p = Paths.get("/test");
		if(Files.isDirectory(p))
			System.out.println("dossier");
		else
			System.out.println("fichier");*/
		/*if(p.getFileName()==null){
			System.out.println(p.getFileName());
		}
		
		if(!(p.getParent()==null))
			System.out.println(p.getParent().resolve(p.getFileName()));
		else
			System.out.println(p);*/
		
		
		/*
		String line, fileName ="/";
		int begin;
		line = "onvatester?search=pour voir ?search=";
		if(line.contains("?search=")){
    		begin = line.indexOf("?search=");
    		System.out.println("\nbegin : "+begin);
    		fileName += line.substring(begin, line.lastIndexOf(" "));
    		//fileName = line.substring(4, line.lastIndexOf(" "));
    	}
		System.out.println("line : "+line+"\nfileName : "+fileName);
		
		*/
		/*float r = (float)1/2;
		System.out.println(12);
		System.out.println(r);*/
		
		/*
		if (args.length != 2) {
		    System.err.println("Usage: java " + ServerHttp.class.getName() + "portNumber directory");
		    System.exit(1);
		}

		int portNumber = 0;
		try {
		    portNumber = Integer.parseInt(args[0]);
		    if (portNumber < 0) {
			System.err.println(args[0] + " is not a positive integer");
		    }
		} catch (NumberFormatException e) {
		    System.err.println(args[0] + " is not an integer");
		    System.err.println("Usage: java " + ServerHttp.class.getName() + " portNumber directory");
		    System.exit(2);
		}
		Path root = Paths.get(args[1]);
		
		try{
		root.toRealPath();
		}catch (IOException e){
			System.err.println(args[1] + " is not a real path");
		    System.err.println("Usage: java " + ServerHttp.class.getName() + " portNumber directory");
		    System.exit(2);
		}
		
		System.out.println("portNumber : "+portNumber+""
			+ "\n root : "+root);
	*/
	}

}
