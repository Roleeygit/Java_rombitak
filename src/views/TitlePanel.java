/*
* File: TitlePanel.java
* Author: Juhász Roland
* Copyright: 2022, Juhász Roland
* Group: Szoft II N
* Date: 2022-12-15
* Github: https://github.com/Roleeygit
* Licenc: GNU GPL
*/

package views;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class TitlePanel extends JPanel 
{
    JLabel mainLabel;

    public TitlePanel() 
    {
        this.mainLabel = new JLabel("Rhombus Area and Volume calculation");   
        this.mainLabel.setBorder(new EmptyBorder(10, 10, 10, 300));
        this.add(this.mainLabel);
    }
    
}