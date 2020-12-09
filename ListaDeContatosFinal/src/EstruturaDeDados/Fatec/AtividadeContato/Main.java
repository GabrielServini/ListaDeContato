/*
Projeto desenvolvido pelos alunos:

Gabriel Henrique da Silva Servini
RA: 2920481921018

Newton Paul Aranha
RA: 2920481921014

Vinicius de Oliveira Santos
RA: 2920481921039

Wesley Lima Dias do Vale
RA: 2920481921009 
*/
package EstruturaDeDados.Fatec.AtividadeContato;
/**
 * 
 * @author Vinicius de Oliveira Santos
 * @author Newton Paul Aranha 
 * 
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListaDupla l1 = new ListaDupla();
        String nome;
        Contato contato;
        int opcao = -1;
        while (opcao != 0) {
            opcao = obterOpcaoMenu(scan);
            switch (opcao) {
                case 1:
                    System.out.println("Adicionar Contato");
                    contato = adicionaContato();
                    l1.adicionaContato(contato);
                    break;
                case 2:
                    System.out.println("Remover Contato");
                    nome = obtemNome();

                    contato = l1.removerContato(nome);
                    if (contato == null) System.out.println("Contato não existe!");
                    else System.out.println("Contato removido com sucesso!");

                    break;
                case 3:
                    System.out.println(l1.toString());
            }

        }
    }

    private static Contato adicionaContato() {
        Scanner scan = new Scanner(System.in);
        Contato novoContato = new Contato();
        System.out.println("Entre com as informações do Contato:");
        System.out.println("Entre com o Nome Completo");
        novoContato.setNomeCompleto(scan.nextLine());
        System.out.println("Entre com o telefone Fixo");
        novoContato.setTelefoneFixo(scan.nextLine());
        System.out.println("Entre com o telefone celular");
        novoContato.setTelefonecelular(scan.nextLine());
        System.out.println("Entre com o endereço");
        novoContato.setEndereco(scan.nextLine());
        System.out.println("Contato Registrado com sucesso");
        return novoContato;
    }

    public static String obtemNome() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nome: ");
        return in.nextLine();
    }

    protected static int obterOpcaoMenu(Scanner scan) {
        boolean entradaValida = false;
        int opcao = 0;
        String entrada;
        while (!entradaValida) {
            System.out.println("1-Adicionar Contato");
            System.out.println("2-Remover Contato");
            System.out.println("3-Listar Contatos");
            System.out.println("0-Sair");
            try {
                entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao >= 0 && opcao <= 3) {
                    entradaValida = true;
                } else {
                    //entradaValida = false;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente\n\n");
            }
        }
        return opcao;
    }
}
