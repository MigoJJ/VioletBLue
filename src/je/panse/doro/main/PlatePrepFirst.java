package je.panse.doro.main;

import java.io.File;	
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import je.panse.doro.comm.ReadWriteToChartPlate;

public class PlatePrepFirst {
	public static void main(String[] args) throws IOException {
		List<String> list=new ArrayList<String>();  
		  list.add("/3CC");  
		  list.add("/4PMH");  
		  list.add("/5SUJ");  
		  list.add("/6OBJ");  
		  list.add("/7LAB");  
		  list.add("/8ACC");  
		  list.add("/9PLAN");
	// ------------------------------------------------------Form Files Copying	
		  for(String fruit:list)  
			  copyfiler(fruit);
	// ------------------------------------------------------ChartPlate writing		  
		  for(String fruit:list)
			  	ReadWriteToChartPlate.readFile(Enter.wtf + fruit);
  }
	// ------------------------------------------------------Method for file copy	
		public static void copyfiler(String copyf) throws IOException {
			// 1. 원본 File, 복사할 File 준비
			File file = new File(Enter.wtf + "/hana" + copyf); 
			File newFile = new File(Enter.wtf + copyf);
			// 2. 복사
			Files.copy(file.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
// --------------------------------------------------------
    }
}
