package exercises.POO;

public class JuridicPerson extends Person {
    private long CNPJ;

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long cNPJ) {
        CNPJ = cNPJ;
    }

    @Override
    public void Apresentation() {
        // TODO Auto-generated method stub
        super.Apresentation();
        System.out.println("My CNPJ is: " + this.CNPJ);

    }

}
