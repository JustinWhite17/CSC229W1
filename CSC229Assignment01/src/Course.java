/*
* ToDo 01:
 Complete the followings:

The Course class should have:

    - ID 

    - Name

    - Code

 - You need to have setters and getters for all data members
 - You must have a default constructor and an overloaded one that accepts 3 parameters to update the member variables.

 - Using a driver class (with main), instantiate the Course class and call its methods to change the id, name, and code.

 - Test and run your code.

 - Add comments to explain your program.

 - Push the code to GitHub.

 - Submit the Github link here (make sure it is a public repo).


 */

/**
 *
 * @author MoaathAlrajab
 */

//default
public class Course {
    int ID;
    String name;
    String code;

    public Course() {}

//overload with 3 parameters 
Course (int ID, String name, String code) {
    this.ID = ID;
    this.name = name;
    this.code = code;
    
}

 
//setters
public void setID (int ID) {
    this.ID = ID;
}

public void setName (String name) {
    this.name = name;
}

public void setCode (String code) {
    this.code = code;
}
    
//getters
public int getID() {
    return this.ID;
}
public String getName() {
    return this.name;
}
public String getCode() {
    return this.code;
}

}