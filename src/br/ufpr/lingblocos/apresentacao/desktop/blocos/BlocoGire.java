/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.apresentacao.desktop.blocos;

import java.awt.Color;
import javax.swing.border.LineBorder;

/**
 *
 * @author Helio
 */
public class BlocoGire extends BlocoArrastavel{

    public BlocoGire() {
        super();
        setBorder(new LineBorder(Color.GREEN, 3));
        setBounds(0, 0, 100, 40);
        setOpaque(true);
    }
    
}