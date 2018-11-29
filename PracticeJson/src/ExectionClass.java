import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
//import org.json.simple.JSONArray;
//import org.json.simple.parser.ParseException;
//import org.json.simple.parser.JSONParser;

public class ExectionClass {

	public static void main(String[] args) throws JSONException, IOException {
		// TODO Auto-generated method stub
		

		Address a1=new Address(4100,"Ardo street","fremont","CA",94536);
		Address a2= new Address(2000,"vincentee street","sunnyvale","AZ",94086);
		Address a3= new Address(1000,"decoto street","newark","NY",54086);
		
		Employee e1= new Employee("santhusha","Thummala",1000,1001,"sales",a1);
		e1.age=20;
		e1.setEmpId(1);
		Employee e2=new Employee("Ainesh","Produturi",2000,2001,"production",a2);
		e2.age=8;
		e2.setEmpId(2);
		Employee e3=new Employee("tejas","produturi",3000,1001,"sales",a3);
		e3.age=2;
		e3.setEmpId(3);
		
		
		/*e1.setAddress(a1);
		e2.setAddress(a2);
		e3.setAddress(a3);
		*/
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> d1_employees=new ArrayList<Employee>();
		d1_employees.add(e1);
		d1_employees.add(e2);
		
		ArrayList<Employee> d2_employees=new ArrayList<Employee>();
		d2_employees.add(e2);
		d2_employees.add(e3);
		
		Department d1=new Department("sales", 1001, d1_employees);	
		Department d2=new Department("production", 2001, d2_employees);
		
		
		ArrayList<Department> ald=new ArrayList<Department>();
		ald.add(d1);
		ald.add(d2);
		System.out.println(ald.contains(d1));
		
		JSONObject obj=new JSONObject();
		obj.put("employees",al);
		obj.put("deparments", ald);
		System.out.println(obj.toString());
		String s=null;
		File f=new File("C:/Users/santh/Desktop/write Json object from java source code to text document.txt");
		FileWriter fw=new FileWriter(f);
		fw.write(obj.toString());
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=");
		//FileReader fr = new FileReader("C:/Users/santh/Desktop/write Json object from java source code to text document.txt");
		//BufferedReader br=new BufferedReader(fr);
		/*while((br.readLine())!=null) {
			s=br.readLine();
			System.out.println("ksjdhfskjfh");
			StringTokenizer strtok=new StringTokenizer(s," ");
			
			System.out.println(strtok);
		}
		System.out.println("");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			fw.flush();
			fw.close();
		}*/
		JSONParser parser = new JSONParser();		

	}

}
