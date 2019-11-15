/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

import javax.swing.JOptionPane;

/**
 *
 * @author brugiafreddo.fabio
 */
public class TestContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomeCont = JOptionPane.showInputDialog("Nome Conto");
        int bilancio = Integer.parseInt(JOptionPane.showInputDialog("inserisci bilancio"));
        int fido = Integer.parseInt(JOptionPane.showInputDialog("inserisci fido"));
        ContoBancario c2 = new ContoBancarioEsteso(fido, nomeCont, bilancio);
        int deposito = Integer.parseInt(JOptionPane.showInputDialog("inserisci deposito"));
        c2.deposito(deposito);
        int prelievo = Integer.parseInt(JOptionPane.showInputDialog("inserisci prelievo"));
        c2.prelievo(prelievo);
        JOptionPane.showMessageDialog(null, c2);
    }
    
}
