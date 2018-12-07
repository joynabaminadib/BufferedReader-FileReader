import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;



public class Buffered {


	public static void main(String[] args) throws Exception {
		
     // FileReader fr = new FileReader("C:/Users/adibi/Desktop/joynab/nayna3");
	BufferedReader br = new BufferedReader(new FileReader("C:/Users/adibi/Desktop/joynab/nayna3"));
	String n ;  
	//int n;
	
	
	while ((n = br.readLine())!=null){ 
		
	//while(( n = br.read()) != -1) {
		System.out.println(n);     
		    
	//System.out.println((char)n);
		//printStackTrace() ;
			
	}
	                                    
	br.close();
	//fr.close();
	}

	
}
