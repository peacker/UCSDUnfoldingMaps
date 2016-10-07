package prove;

public class Person {
    private String name;
 
    public Person( String n ) {
        super();
        this.name = n;
    }
    public void setName( String n ) {
        this.name = n;
    }
    public void printName() {
        System.out.print(this.name);
    }
}