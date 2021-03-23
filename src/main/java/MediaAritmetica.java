import javax.swing.JOptionPane;

public class MediaAritmetica {
    public static void main(String[] args) {
        // Declaração de variáveis:
        float nota1;
        float nota2;
        float nota3;
        float calculoMedia;
        
        // Entrada de dados:
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a primeira nota: "));
        
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a segunda nota: "));
        
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a terceira nota: "));
        
        // Processamento de dados:
        calculoMedia = (nota1+nota2+nota3)/3;
        
        // Saída de dados:
        JOptionPane.showMessageDialog(null, "A média do aluno é: " + calculoMedia);
        
    }
}
