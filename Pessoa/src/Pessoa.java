import java.util.ArrayList;
import java.util.Objects;

public class Pessoa
{
    int pes_id;
    String pes_nome;
    String pes_data_nascimento;
    private String pes_sexo;
    private String pes_mae;
    private String pes_pai;
    String endereco_completo;
    private String email;
    private String telefone;
    String foto;

    public Pessoa(int pes_id, String pes_nome, String pes_data_nascimento, String endereco_completo, String foto, String email, String telefone, String pes_sexo, String pes_mae ,String pes_pai) {
        try {
            this.setPes_id(pes_id);
            this.setPes_nome(pes_nome);
            this.setPes_data_nascimento(pes_data_nascimento);
            this.setEndereco_completo(endereco_completo);
            this.setFoto(foto);
            this.setEmail(email);
            this.setTelefone(telefone);
            this.setPes_pai(pes_pai);
            this.setPes_mae(pes_mae);
            this.setPes_sexo(pes_sexo);

        }
        catch (Exception e)
        {
        }
    }
    Pessoa() {}

    public void listarPessoas(ArrayList<Pessoa> pessoa)
    {
        for (int i = 0; i < pessoa.size(); i++)
        {
            System.out.println("======= Lista de Pessoas=======");
            System.out.println(pessoa.get(i).listarPessoa());
            System.out.println("===============================");
        }
    }
    public String listarPessoa()
    {
        return "Id='" + this.getPes_id() + '\'' +
                "\nNome" + this.getPes_nome() + '\'' +
                "\nData Nascimento " + this.getPes_data_nascimento() +
                "\nEndereco Completo " + this.getEndereco_completo() +
                "\nFoto '" + this.getFoto() + '\'' +
                "\nEmail '" + this.getEmail() + '\''+
                "\nTelefone '" + this.getTelefone() + '\'' +
                "\nNome pai '" + this.getPes_pai() + '\'' +
                "\nNome Mãe '" + this.getPes_mae() + '\'' +
                "\nSexo '" + this.getPes_sexo() + '\'';

    }
    public void buscarTelefone(ArrayList<Pessoa> pessoa, String telefone)
    {
        for (int i = 0; i < pessoa.size(); i++)
        {
            if (Objects.equals(pessoa.get(i).getTelefone(), telefone))
            {
                System.out.println(pessoa.get(i).listarPessoa());
                break;
            }
            else
            {
                System.out.println("Não encontrou.");
            }
        }
    }

    public void BuscarId(ArrayList<Pessoa> pessoa, int pes_id)
    {
        for (int i = 0; i < pessoa.size(); i++)
        {
            if (Objects.equals(pessoa.get(i).getPes_id(), pes_id))
            {
                System.out.println(pessoa.get(i).listarPessoa());
                break;
            }
            else
            {
                System.out.println("Não encontrou.");
            }
        }
    }

    String BuscarTelefon(ArrayList<Pessoa> pessoa, String telefone)
    {
        return telefone;
    }
    int BuscarId(int pes_id)
    {
        return pes_id;
    }

    public String getPes_sexo()
    {
        return pes_sexo;
    }

    public void setPes_sexo(String pes_sexo)
    {
        this.pes_sexo = pes_sexo;
    }

    public String getPes_mae()
    {
        return pes_mae;
    }

    public void setPes_mae(String pes_mae)
    {
        this.pes_mae = pes_mae;
    }

    public String getPes_pai()
    {
        return pes_pai;
    }

    public void setPes_pai(String pes_pai)
    {
        this.pes_pai = pes_pai;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public int getPes_id() {
        return pes_id;
    }

    public void setPes_id(int pes_id) {
        this.pes_id = pes_id;
    }

    public String getPes_nome() {
        return pes_nome;
    }

    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    public String getPes_data_nascimento() {
        return pes_data_nascimento;
    }

    public void setPes_data_nascimento(String pes_data_nascimento) {
        this.pes_data_nascimento = pes_data_nascimento;
    }

    public String getEndereco_completo() {
        return endereco_completo;
    }

    public void setEndereco_completo(String endereco_completo) {
        this.endereco_completo = endereco_completo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void listarPessoa(ArrayList<Pessoa> pessoa) {
    }
}
