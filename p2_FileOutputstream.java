//write byte

// import java.io.FileOutputStream;  
// public class p2_FileOutputstream {  
//     public static void main(String args[]){    
//            try{    
//              FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
//              fout.write(65);    
//              fout.close();    
//              System.out.println("success...");    
//             }catch(Exception e){System.out.println(e);}    
//       }    
// }



       //write string
import java.io.FileOutputStream;  
public class p2_FileOutputstream {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}