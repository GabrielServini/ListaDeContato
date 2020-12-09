package EstruturaDeDados.Fatec.AtividadeContato;
/**
 * 
 * @author Gabriel Henrique da Silva Servini
 * @author Newton Paul Aranha
 * 
 */
public class Contato {
    public String nomeCompleto;
    public String telefonecelular;
    public String telefoneFixo;
    public String endereco;


    public Contato() {
    }

    public Contato(String nomeCompleto, String telefonecelular, String telefoneFixo, String endereco) {
        this.nomeCompleto = nomeCompleto;
        this.telefonecelular = telefonecelular;
        this.telefoneFixo = telefoneFixo;
        this.endereco = endereco;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefonecelular() {
        return telefonecelular;
    }

    public void setTelefonecelular(String telefonecelular) {
        this.telefonecelular = telefonecelular;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome:" + nomeCompleto + "  Telefone Celular:" + telefonecelular + "  Telefone fixo:" + telefoneFixo + "  Endereco:" + endereco + "\n";
    }

}
