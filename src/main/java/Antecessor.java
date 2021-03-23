import javax.swing.JOptionPane;

public class Antecessor {
    public static void main(String[] args) {
        int numero, antecessor;
        
        // Entrada:
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        // Processamento:
        antecessor = numero - 1;
        
        // Saída:
        JOptionPane.showMessageDialog(null, "O antecessor do número digitado é: " + antecessor);
        
    }
}
