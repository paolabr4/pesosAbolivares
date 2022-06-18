import javax.swing.*;

public class pesosAbolivares {

    double pesos = 0;
    double valorBol = 0.0014;
    double bolivares = 0;

    public pesosAbolivares() {
        // TODO Auto-generated constructor stub

        JOptionPane.showMessageDialog(null, "Convertidor de Pesos a Bolivares");
        pesos = Double.parseDouble(JOptionPane.showInputDialog("Porfavor ingreses el valor en pesos: "));

        bolivares = pesos * valorBol;

        JOptionPane.showMessageDialog(null, pesos + " pesos, equivalen a " + bolivares + " bolivares");

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        new pesosAbolivares();

    }
}
