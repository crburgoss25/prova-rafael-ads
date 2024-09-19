import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();
        ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();

        int opcao;
        do
        {
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Listar as pessoas");
            System.out.println("3 - Buscar telefone ");
            System.out.println("4 - Buscar Id (implementada)");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();

            switch (opcao)
            {
                case 1:
                    sc.nextLine();
                    System.out.println("========= Cadastrar Pessoa =========");
                    System.out.println("Informe o Id");
                    int pes_id = sc.nextInt();

                    sc.nextLine();
                    System.out.println("Informe o Nome");
                    String pes_nome = sc.nextLine();

                    System.out.println("Informe a data de nascimento");
                    String pes_data_nascimento = sc.nextLine();

                    System.out.println("Informe o Endereco");
                    String endereco_completo = sc.nextLine();

                    System.out.println("Informe o seu email");
                    String email = sc.nextLine();

                    System.out.println("Informe o seu telefone");
                    String telefone = sc.nextLine();

                    System.out.println("Informe o nome do seu pai");
                    String pes_pai = sc.nextLine();

                    System.out.println("Informe o nome da sua mãe");
                    String pes_mae = sc.nextLine();

                    System.out.println("Informe o seu sexo:");
                    String pes_sexo = sc.nextLine();

                    pessoa.add(new Pessoa(pes_id, pes_nome, pes_data_nascimento, endereco_completo,email,telefone,pes_pai,pes_mae,pes_sexo,pes_pai));
                    break;

                case 2:
                    System.out.println("Lista de pessoas Cadastradas:\n");
                    p.listarPessoas(pessoa);
                    break;

                case 3:
                    System.out.println("Buscar Por TELEFONE");
                    sc.nextLine();
                    System.out.println("Informe o numero do telefone");
                    String pTelefone = sc.nextLine();
                    p.buscarTelefone(pessoa,pTelefone);
                    break;

                case 4:
                    System.out.println("Busca por ID");
                    sc.nextLine();
                    System.out.println("Informe o Id da pessoa");
                    int pId = sc.nextInt();
                    p.BuscarId(pessoa, pId);
                    break;
                case 5:
                    System.out.println("Saindo.");
                    break;
            }
        }while(opcao != 5);
    }
}