package serializationDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStreamDemo {
	public static void main(String[] args) {
		try (ObjectOutputStream objStreamOut = new ObjectOutputStream(new FileOutputStream("EmployeeData.txt"));
				ObjectInputStream objStreamIn = new ObjectInputStream(new FileInputStream("EmployeeData.txt"));) 
		{
			
			//Use this code for demo of serialization and de-serialization
//		  EmployeeDTO eDTO = new EmployeeDTO("1234", "Sachin", "SE", 5);
//		  objStreamOut.writeObject(eDTO);  //Serialization
//		
//		  EmployeeDTO e = (EmployeeDTO) objStreamIn.readObject();  //De-Serialization
//		  System.out.println(e);
           
			
			//Use this code for collection serialization 
                   
//            EmployeeDTO eDTO = new EmployeeDTO("1234", "Sachin", "SSE", 3, new Address("Mumbai", 560076));
//			EmployeeDTO eDTO1 = new EmployeeDTO("1235", "Virat", "SE", 3, new Address("Delhi", 600017));
//			EmployeeDTO eDTO2 = new EmployeeDTO("1236", "Rohit", "TA", 4, new Address("Pune", 500008));
//			ArrayList<EmployeeDTO> emp = new ArrayList<>();
//			emp.add(eDTO);
//			emp.add(eDTO1);
//			emp.add(eDTO2);
//			
//			objStreamOut.writeObject(emp);
//			ArrayList<EmployeeDTO> emp1 = (ArrayList<EmployeeDTO>) objStreamIn.readObject();
//			for (EmployeeDTO employeeDTO : emp1) {
//				System.out.println(employeeDTO + " " + employeeDTO.getAddress());
//			} 
			
			
			
			//Use this code for Serialization with Inheritance (IS-A Relationship)
			
			EmployeeDTO pObj = new PermanentEmployee("8888", "Ramesh", "Manager", 7,  new Address("Pune", 500008), 25000);
            objStreamOut.writeObject(pObj);  //Serialization
			PermanentEmployee e1 = (PermanentEmployee) objStreamIn.readObject();  //De-Serialization
			System.out.println(e1);
			
			
			
			
			//Use this code for Serialization with Aggregation (Has-A Relationship)
//			EmployeeDTO eDTO3 = new EmployeeDTO("9999", "Sachin", "SE", 6, new Address("Pune", 422567));
//            objStreamOut.writeObject(eDTO3);  //Serialization
//			EmployeeDTO e2 = (EmployeeDTO) objStreamIn.readObject();  //De-Serialization
//			System.out.println(e2);
//			System.out.println("City="+e2.getAddress().getCity() + " Pincode=:"+e2.getAddress().getPincode());
		
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
