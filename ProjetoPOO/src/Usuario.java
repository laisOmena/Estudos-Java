public class Usuario extends Pessoa{
    private String login;
    private String senha;

    public String logar(String email, String senha){
        if (this.login == email & this.senha == senha){
            return  " ";
        }else{
            return "Email ou senha incorreto, tente novamente!";
        }

    }

    public String cadastrar(String email, String senha){
        this.login = email;
        this.senha = senha;
        return "Cadastro completo";
    }
}
