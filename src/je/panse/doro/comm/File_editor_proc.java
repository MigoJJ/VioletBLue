package je.panse.doro.comm;

import java.io.File;			
import java.awt.Desktop;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


import je.panse.doro.main.Enter;

public class File_editor_proc {
    public static void main(String args) throws InterruptedException 
    {
            Runtime obj = Runtime.getRuntime();
            try 
            {
                    obj.exec("gedit " + Enter.wt +"/samsara/ChartPlate");
                    Thread.sleep(10000); 
                    obj.exec("killall gedit");
            }
            catch(IOException e) 
            {
                    System.out.println(e);
            }   
    }   
	//	public static void main(String stringDir){
//		try{
//          File file = new File(stringDir);
//          if(!Desktop.isDesktopSupported())
//           {
//        	  	System.out.println("not supported");
//        	  	return;
//           }
//   		Desktop desktop = Desktop.getDesktop();
//   		if(file.exists())
//       			desktop.open(file);
////   		    Desktop.getDesktop().edit(file);
//         }
//		catch(Exception e){
//            e.printStackTrace();
//        }
//    }
	
	public static void linepickup(String pickupfile, String savefilename) {
		Desktop destination=Desktop.getDesktop();
		try {
			destination.open(new File(pickupfile));
			Scanner sc = new Scanner(System.in);
				System.out.println(">>> Enter a pickup line number :>>>");
				int lnol = sc.nextInt();
				System.out.println("User input is  : "+ lnol);
				String line3 = Files.readAllLines(Paths.get(pickupfile)).get(lnol-1);
				System.out.println(" : " + line3);
			File_cdrw_proc savef1 = new File_cdrw_proc();
				savef1.writeliner(savefilename, line3);
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
// ----------	
}