package Tarea2PW;

public class Auto {
    final String MARCA;
    String matricula;
    Persona duenio;
    final static String MERCEDEZ_BENZ = "mercedez_benz";
     static final String VOLKSWAGEN = "Volkswagen";
     static final String CHEVROLET = "Chevrolet";
     static final String AUDI = "Audi";
     static final String BMW = "BMW";
    static final String FORD = "Ford";
     static final String SUBARU = "Subaru";

    public Auto (String MARCA, String matricula, Persona duenio ) {
        this.MARCA = MARCA;
        this.matricula = matricula;
        this.duenio = duenio;
    }

    public String getMARCA() {
        return marca;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public Persona getDuenio() {
        return duenio;
    }

    public void setMARCA(String marca) {
        this.marca = marca;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }
        
}
