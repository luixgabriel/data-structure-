package exercises.POO;

public class NormalPerson extends Person {
    private long cpf;

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    @Override
    public void Apresentation() {
        // TODO Auto-generated method stub
        super.Apresentation();
        System.out.println("My CPF is: " + this.cpf);
    }
   
}
