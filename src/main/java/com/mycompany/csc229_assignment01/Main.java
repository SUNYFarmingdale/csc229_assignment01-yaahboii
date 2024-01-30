// test commit

package com.mycompany.csc229_assignment01;

/**
 *
 * @author Eric Paiz
 */
public class Course {
    // private members
    private int ID;
    private String Name;
    private String Code;

    // Default constructor
    public Course() {

    }
// overloaded constructor

    public Course(int ID, String Name, String Code) {
        this.ID = ID;
        this.Name = Name;
        this.Code = Code;
    }

    // setters aka mutator methods
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

// getters aka accessor methods

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getCode() {
        return Code;
    }


}
