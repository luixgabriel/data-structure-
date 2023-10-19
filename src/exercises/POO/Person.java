package exercises.POO;

public abstract class Person {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Apresentation(){
        System.out.println("Hello! my name is " + this.name + "and this is my email" + this.email );
    }
}
