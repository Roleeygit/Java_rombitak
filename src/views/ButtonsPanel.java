/*
* File: ButtonsPanel.java
* Author: Juhász Roland
* Copyright: 2022, Juhász Roland
* Group: Szoft II N
* Date: 2022-12-15
* Github: https://github.com/Roleeygit
* Licenc: GNU GPL
*/

package views;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel 
{
    public JButton calcButton;
    public JButton aboutButton;
    public JButton copyrightButton;
    public JButton refreshButton;
    public JButton exitButton;

    public ButtonsPanel() 
    {
        calcButton = new JButton("Calculate");
        aboutButton = new JButton("About");
        copyrightButton = new JButton("Copyright");
        refreshButton = new JButton("Refresh");
        exitButton = new JButton("Exit");
        addComponents();
    }

    public void addComponents() 
    {
        add(calcButton);
        add(aboutButton);
        add(copyrightButton);
        add(refreshButton);
        add(exitButton);
    }
    
}