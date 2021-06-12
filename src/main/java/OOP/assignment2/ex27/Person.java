package OOP.assignment2.ex27;

final public class Person {
    String firstN;
    String lastN;
    String employeeID;
    int zipcode;

    public Person() {
        this.firstN = "";
        this.lastN = "";
        this.employeeID = "";
        this.zipcode = 0;
    }
    public Person(String firstname, String lastname, String employeeID, int zipcode) {
        this.firstN = firstname;
        this.lastN = lastname;
        this.employeeID = employeeID;
        this.zipcode = zipcode;
    }
}
