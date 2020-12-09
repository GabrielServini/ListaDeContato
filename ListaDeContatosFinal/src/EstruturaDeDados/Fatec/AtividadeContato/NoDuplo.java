package EstruturaDeDados.Fatec.AtividadeContato;

/**
 * 
 * @author Wesley Lima Dias do Vale
 * @author Vinicius de Oliveira Santos
 * 
 */


public class NoDuplo {
    public NoDuplo ant, prox;
    public Contato contato;

    public NoDuplo(Contato contato) {
        this.ant = null;
        this.contato = contato;
        this.prox = null;
    }

    public NoDuplo getAnt() {
        return ant;
    }

    public void setAnt(NoDuplo ant) {
        this.ant = ant;
    }

    public NoDuplo getProx() {
        return prox;
    }

    public void setProx(NoDuplo prox) {
        this.prox = prox;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
}