import javax.swing.JOptionPane;

public class CotacaoDolar {
    public static void main(String[] args) {
        float cotacaoDolar;
        float quantidadeDolar;
        float conversaoReal;
        
        cotacaoDolar = Float.parseFloat(JOptionPane.showInputDialog("Informe a cotação atual do dólar: "));
        quantidadeDolar = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de dólares que você possui: "));
        
        conversaoReal = quantidadeDolar * cotacaoDolar;
        
        JOptionPane.showMessageDialog(null, "Seu dinheiro em reais é: " + conversaoReal);
    }
}
