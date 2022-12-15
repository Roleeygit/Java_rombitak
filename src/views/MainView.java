
/*
* File: MainView.java
* Author: Juhász Roland
* Copyright: 2022, Juhász Roland
* Group: Szoft II N
* Date: 2022-12-15
* Github: https://github.com/Roleeygit
* Licenc: GNU GPL
*/

package views;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainView extends JFrame 
{
    TitlePanel titlePanel;
    public AsitePanel asitePanel;
    public AlphaPanel alphaPanel;
    public AreaPanel areaPanel;
    public VolumePanel volumePanel;
    public ButtonsPanel buttonsPanel;

    public MainView() 
    {
        this.titlePanel = new TitlePanel();
        this.asitePanel = new AsitePanel();
        this.alphaPanel = new AlphaPanel();
        this.volumePanel = new VolumePanel();
        this.areaPanel = new AreaPanel();
        this.buttonsPanel = new ButtonsPanel();
        this.initWindow();
    }
    
    public void initWindow() 
    {
        this.setIconImage(new ImageIcon("logo.png").getImage());
        this.setTitle("rombitak");
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.addComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public void addComponents() 
    {
        this.add(this.titlePanel);
        this.add(this.asitePanel);
        this.add(this.alphaPanel);
        this.add(this.buttonsPanel);
        this.add(this.volumePanel);
        this.add(this.areaPanel);
        
    }
    
}