package EstruturaDeDados.Fatec.AtividadeContato;

/**
 * 
 * @author Wesley Lima Dias do Vale
 * @author Gabriel Henrique da Silva Servini 
 * 
 */


public class ListaDupla {
    private NoDuplo inicio, fim;

    public ListaDupla() {
        inicio = null;
        fim = null;
    }

    public void adicionaContato(Contato contato) {
        NoDuplo novo = new NoDuplo(contato), atual;
        String nomeAtual;
        if (inicio != null) {
            atual = inicio;
            while (atual != null) {
                nomeAtual = atual.getContato().getNomeCompleto();
                if (nomeAtual.compareTo(contato.getNomeCompleto()) >= 0) {
                    if (inicio != atual) {
                        atual.getAnt().setProx(novo);
                        novo.setAnt(atual.getAnt());
                    } else inicio = novo;
                    novo.setProx(atual);
                    atual.setAnt(novo);
                    break;
                } else if (atual.getProx() == null) {
                    fim = novo;
                    novo.setAnt(atual);
                    atual.setProx(novo);
                    break;
                }
                atual = atual.getProx();
            }
        } else {
            inicio = novo;
            fim = novo;
        }
    }

    public Contato removerContato(String nome) {
        String nomeAtual;
        NoDuplo atual = inicio;
        while (atual != null) {
            nomeAtual = atual.getContato().getNomeCompleto();
            if (nomeAtual.equals(nome)) {
                if (atual == inicio) {
                    if (atual != fim) {
                        inicio = atual.getProx();
                        atual.getProx().setAnt(null);
                    } else {
                        inicio = null;
                        fim = null;
                    }
                } else {
                    if (atual != fim) {
                        atual.getAnt().setProx(atual.getProx());
                        atual.getProx().setAnt(atual.getAnt());
                    } else {
                        fim = atual.getAnt();
                        atual.getAnt().setProx(null);
                    }
                }
                atual.setAnt(null);
                atual.setProx(null);
                return atual.getContato();
            }
            atual = atual.getProx();
        }
        return null;
    }

    @Override
    public String toString() {
        String listaContatos = "Lista de Contatos\n";
        NoDuplo atual = inicio;
        while (atual != null) {
            listaContatos += atual.getContato().toString();
            atual = atual.getProx();
        }
        return listaContatos;
    }

}