package br.estacio.cct0080.cadastrodecliente;

/**
 * Created by carlos on 22/05/2017.
 */
public enum EstadoCivil {

    S("Solteiro"),
    C("Casado"),
    D("Divercidado"),
    V("Viúvo"),
    U("União Estável");

    private String estadoCivil;


    EstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return estadoCivil;
    }
}
