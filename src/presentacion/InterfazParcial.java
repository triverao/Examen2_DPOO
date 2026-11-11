package presentacion;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import logica.*;

public class InterfazParcial extends JFrame implements ActionListener
{
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JLabel resultado;

    public InterfazParcial()
    {
        setLayout(new GridLayout(4, 2));

        JLabel etiquetaA = new JLabel("a:", JLabel.RIGHT);
        JLabel etiquetaB = new JLabel("b:", JLabel.RIGHT);
        JLabel etiquetaC = new JLabel("c:", JLabel.RIGHT);
        txtA = new JTextField();
        txtB = new JTextField();
        txtC = new JTextField();
        JButton calcular = new JButton("Calcular");
        resultado = new JLabel("");

        calcular.addActionListener(this);

        add(etiquetaA);
        add(txtA);
        add(etiquetaB);
        add(txtB);
        add(etiquetaC);
        add(txtC);
        add(calcular);
        add(resultado);

        setTitle("Examen Tomas Rivera");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = Double.parseDouble(txtC.getText());

            Parcial parcial = new Parcial();
            resultado.setText(parcial.calcularRaices(a, b, c));
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Escriba solo números");
        }
        catch (EcuacionNoCuadraticaException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        catch (RaicesComplejasException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public static void main(String[] args)
    {
        new InterfazParcial();
    }
}