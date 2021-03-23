import javax.swing.JOptionPane;

public class DiasDeVida {
    public static void main(String[] args) {
        int idade;
        int idadeDias;
        
        // Entrada de dados:
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        
        // Processamento de dados:      
        idadeDias = idade * 365;
        
        // Saída de dados:
        JOptionPane.showMessageDialog(null, "Sua idade em dias é: " + idadeDias);
    }
}
