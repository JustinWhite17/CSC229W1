/**
 *
 * @author MoaathAlrajab
 */
public class NewClass {
    
     public static void main(String[] args) {
     Course classA = new Course(); // Instantiate 
     
     //Set class A's values
     classA.setID(12012);
     classA.setName("Data structures & Algorithms");
     classA.setCode("CSC229");
     
      //Get class A's values to print them out
     System.out.println("The classes ID is: " + classA.getID());
     System.out.println("The classes name is: " + classA.getName());
     System.out.println("The classes code is: " + classA.getCode());
    }
    
    
}