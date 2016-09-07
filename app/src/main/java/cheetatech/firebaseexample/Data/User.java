package cheetatech.firebaseexample.Data;


public class User {
    private String name;
    private String surname;

    public User(){}
    public User(String name,String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return this.name + " "+this.surname;
    }
}
