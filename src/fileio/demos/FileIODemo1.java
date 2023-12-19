package fileio.demos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class FileIODemo1 {

	public static void main(String[] args) throws FileNotFoundException , IOException{
		File file = new File("./src/trippackage.txt");
		Reader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String line = null;
		
		List<TripPackage> list = new ArrayList();
		while((line=br.readLine())!=null) {
			String[] str = line.split(",");
			String packId = str[0];
			int custId = Integer.parseInt(str[1]);
			String custName = str[2];
			String source = str[3];
			String destination = str[4];
			double price = Double.parseDouble(str[5]);
			TripPackage pack = new  TripPackage(packId, custId, custName, source, destination, price);
			System.out.println(pack);
		}
		
	}
}