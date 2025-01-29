//Write a java program to print the copy of the given array.//


package assignment;

public class CopyArray {

	public static void main(String[] args) {
		String[] names = {"Sovna" , "Satya " , "Mama" , "Babi" };
		String[] copyOfNames = new String[names.length];
        for(int i=0;i<names.length;i++) {
        	copyOfNames[i] = names[i];
        }
       // for(int i=0;i<copyOfNames.length;i++) {
      	//System.out.println(copyOfNames[i]);
        //}
        
        
	//using for each loop
        for(String name : copyOfNames) {
        	System.out.println(name);
        }
	}
    
}
