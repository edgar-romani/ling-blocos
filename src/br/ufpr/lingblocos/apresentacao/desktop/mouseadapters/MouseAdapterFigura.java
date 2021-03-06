/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.apresentacao.desktop.mouseadapters;

import br.ufpr.lingblocos.apresentacao.desktop.teladesenho.TelaDesenho;
import br.ufpr.lingblocos.logicapalco.Palco;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Helio
 */
public abstract class MouseAdapterFigura extends MouseAdapter {
    
    protected boolean pressed = false;
    protected int x;
    protected int y;
    protected TelaDesenho tela;
    protected Palco palco;

    public MouseAdapterFigura(TelaDesenho telaDesenho, Palco palco) {
        this.tela = telaDesenho;
        this.palco = palco;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        pressed = true;
        x = e.getX();
        y = e.getY();
    }

    @Override
    public abstract void mouseReleased(MouseEvent e);
    
}
