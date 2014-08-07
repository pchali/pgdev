package hw;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class HW1ReadFile {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String,Integer>();
		try {

			FileReader file = new FileReader("C:/git_projects/pgdev/gow_Java/solutions/Mysolutions/files/sample.txt");
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;
			while (!eof) {
				String line = buff.readLine();
				
				
				if (line == null)
					eof = true;
				else {
					StringTokenizer st = new StringTokenizer(line," \t\n\r\f,.:;?![]'");
					while(st.hasMoreElements()){
						String currword = st.nextToken();
						currword=currword.toLowerCase();
					if(map.containsKey(currword)&&map.get(currword)!=null){
						int count=map.get(currword);
						count++;
						map.put(currword, count);
					}
					else{
						map.put(currword, 1);
					}
					}
				}

			}
			buff.close();

		}
		catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}    
		//print the Hashmap
		for(Map.Entry<String,Integer> entry:map.entrySet()){
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}
}

