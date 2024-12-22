public class Principal {

    public static void main(String[] args) {
        //Criando o objeto mens parar instanciar a classe 
        Mensagem mens = new Mensagem();
        //O objeto pode acionar os métodos publicas da classe Mensagem
        mens.ExibirDadosCadastrados();
        mens.ExibirDadosIncorretosLG();
        mens.SenhaCadastrada();
    }
    
}
