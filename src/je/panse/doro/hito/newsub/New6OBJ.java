package je.panse.doro.hito.newsub;

import java.io.IOException;	
import java.util.Scanner;
import je.panse.doro.comm.File_cdrw_proc;
import je.panse.doro.comm.File_cw_chart;
import je.panse.doro.comm.NineDeux;
import je.panse.doro.comm.item_exec.CalcBMI;
import je.panse.doro.comm.item_exec.CalcBP;
import je.panse.doro.comm.item_exec.CalcHbA1c;
import je.panse.doro.hito.Newcategory;
import je.panse.doro.hito.StartForm;
import je.panse.doro.main.Enter;

public class New6OBJ {
	public static void main(String args) throws IOException { 
		File_cdrw_proc ob2 = new File_cdrw_proc(); 
    	ob2.readfiler(Enter.wt + "/singlebeam/submenu/6OBJ_List");

    	try (Scanner new_code = new Scanner(System.in)) {
			int select_code = 0;

			while (true) {
		 	
			System.out.println("Enter selected code number ...   : ");
			select_code = Integer.valueOf(new_code.nextLine().trim());

			switch (select_code) {
			  	case 1 : CalcBMI  lab1 = new CalcBMI(); 
			  			lab1.main(null);	  			break;
				case 2 : CalcBP lab2 = new CalcBP(); 
						lab2.main(null); 				break;
//			  case 2 : new4PMH.main(null);  	break;
//					  case "3" : new5SUJ.main(null);  	break;

//					  case "5" : new7LAB.main(null);  	break;
//					  case "6" : new8ACC.main(null);  	break;
//					  case "7" : new9PLAN.main(null);  	break;
//					  case "c" : Com.main(null);  	break;
//					  case "q" : InputButton.quitButton(null);  	break;
//					  case "qq" : InputQuitSave.main(null);  	break;
			 	case 9 : NineDeux.unnine(); 
 							Newcategory.main(null); break;						
						
				}
			}
			} catch (NumberFormatException e) {
			e.printStackTrace();
		}
   	}		
// ----------------------------------------------
}
