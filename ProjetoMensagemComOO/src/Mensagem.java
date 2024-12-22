import javax.swing.JOptionPane;

public class Mensagem {
    
    public void ExibirDadosCadastrados(){
             JOptionPane.showMessageDialog(null, "Dados Cadastrados!");
        }
    
    public void ExibirDadosIncorretosLG(){
             JOptionPane.showMessageDialog(null, "Login/Senha Incorretos!");
        }
        
    public void SenhaCadastrada(){
             JOptionPane.showMessageDialog(null, "Senha já Cadastrada!"); 
       }
}
