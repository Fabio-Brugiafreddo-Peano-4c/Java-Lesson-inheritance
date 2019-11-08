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
public class ContoBancarioEsteso extends ContoBancario {

    protected int fido;

    public ContoBancarioEsteso(String numConto) {
        super(numConto);
        this.fido = 1000;
    }

    public ContoBancarioEsteso(String numConto, int bilancio) {
        super(numConto, bilancio);
        this.fido = 1000;

    }

    public ContoBancarioEsteso(int fido, String numConto, int bilancio) {
        super(numConto, bilancio);
        this.fido = fido;
    }

    public int getFido() {
        return fido;
    }

    public void setFido(int fido) {
        this.fido = fido;
    }

    @Override
    public void prelievo(int prelievo) {
        if (bilancio + fido < prelievo) {
            throw new IllegalArgumentException("non puoi");
        }

        if (bilancio + fido > 0) {
            bilancio -= prelievo;

        }

    }

    @Override
    public String toString() {
        return super.toString()+"\n ContoBancarioEsteso:" + "\n fido= " + fido;
    }
    
}
