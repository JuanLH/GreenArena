/*
 * HelpPane.java
 *
 * Created on 6 January 2008, 22:12
 */

package sydneyengine.ui;

import javax.swing.JInternalFrame;

import sydneyengine.Controller;
import sydneyengine.ServingController;
import sydneyengine.shooter.ViewPane;

/**
 *
 * @author  woodwardk
 */
public class HelpPane extends javax.swing.JPanel {
	ViewPane v;
	JInternalFrame f;
	/** Creates new form HelpPane */
	public HelpPane(final ViewPane v, final JInternalFrame f) {
		this.v = v;
		this.f = f;
		Controller c = v.getGameFrame().getController();
		initComponents();
		String serverIPAddressAndSocketExplanationString = "";
		if (c instanceof ServingController){
			serverIPAddressAndSocketExplanationString += "You are the server and your IP address and port is: "+((ServingController)c).getConnectionServer().getInetSocketAddress().toString();
			serverIPAddressAndSocketExplanationString += "\n";
		}
		String text = 
				serverIPAddressAndSocketExplanationString+
				"Aim: Capture the flag and bring it back to your team's nearest base to score a point.\n" +
				"\n======[ Controls ]======\n"+
				"Move with Arrow keys or W, A, S, D\n"+
				"Left mouse click: fires weapon\n"+
				"R: reloads weapon\n"+
				"Number keys (1-9) or Q/E or Mouse wheel: selects available weapons\n"+
				"`[funny key above TAB]: turn on/off player names and hit points\n"+
				"Enter or Shift+Enter: Activate chat, then and once you've typed the message, press enter again to send. "
				+ "\nIf shift is down when you first press enter, the 'send to allies' option is ticked\n"+
				"Page up or down: zoom in/ out\n"+
				"Escape: displays menu.\n"+
				
				"\n======[ Weapons ]======\n"+
				"\nPistol - Basic weapon with low damage.\n"+
				"\nMachine Gun - Standard rapid-firing rotating gatling.\n"+
				"\nFlamethrower - Close-range weapon that sprays napalm that will stick around for a while, useful for area denial. "
				+ "The napalm will cause damage to anyone that walks over it.\n"+
				"\nShotgun - Dual-shot weapon that fires a cloud of pellets. Most effective at close ranges\n"+
				"\nSniping Rifle - Accurate for long-distance one-hit kills, but slow-firing.\n"+
				"\nTranquilizer Gun - Fires in short bursts, stunning enemies and slowing them and making them unable to fire.\n"+
				"\nRocket Launcher - launches rockets that have a large explosion radius. More damage is dealt to objects that"
				+ "are closer to the epicenter of the explosion.\n"+
				"\nHoming Gun - launches three alien-technology orbs that will fire like a regular bullet unless there is an enemy"
				+ "in front of it, in which case it will automatically follow that target. The orbs are relatively slow, but are"
				+ "still useful around corners and against dug-in defenders.\n"+
				"\nNail Gun - An alternative to the machine gun, that spits out 3 nails at once very rapidly,"
				+ "but watch out for your ammo depletion, since it comes with a small clip considering its rate of fire.\n"+
				"\n***Note***\n"+
				"Both the Flamethrower and the Rocket Launcher are Variable-Range weapons, that is, their bullets can detonate or stick at a "
				+ "certain range away from the weapon by using the mouse to aim.\n"+
				
				"\n======[ Items ]======\n"+
				"\nHealthpack - Restores 33% health.\n"+
				"\nGodly Armor - Grants invincibility against all weapons for 15 seconds, but player can still be tranquilized.\n"+
				"\nSpeed Shoes - Significantly speeds up travel.\n"+
				"\nInvisibility Shroud - Enemies can't see and target you for 15 seconds.\n"+
				"\n***Note***\n"+
				"You can only use one of either the Godly Armor or the Invisibility Shroud, but not both. But, the Speedy Shoes can be"
				+ "use with anything.\n"+
				
				"\n======[ Extra ]======\n"+ 
				"\nThe wi-fi on laptops may cause noticeable lag over local LAN, but still very playable.\n" +
				
				"\n\nThis was slightly modified from the excellent Sydney Engine v. 0.2, made by Keith Woodward, "
				+ "whom can find me on the forums at www.javagaming.org or contact through keithphw@hotmail.com\n"+
				"If you'd like to expand on this game, you can download the source code of Sydney Engine on www.javagaming.org, "
				+ "just search for 'SydneyEngine'.";
		jTextPane1.setText(text);
	}
	
	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        returnToGameButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 36));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Defiance"); // NOI18N

        returnToGameButton.setText("Return to game"); // NOI18N
        returnToGameButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToGameButtonreturnToGame(evt);
            }
        });

        jTextPane1.setEditable(false);
        jScrollPane1.setViewportView(jTextPane1);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, returnToGameButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(returnToGameButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 458, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, 0)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 460, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, 0)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

	private void returnToGameButtonreturnToGame(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToGameButtonreturnToGame
		v.getGameFrame().getDesktopPane().remove(f);
		f.dispose();
		v.requestFocus();
	}//GEN-LAST:event_returnToGameButtonreturnToGame
	
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextPane jTextPane1;
    protected javax.swing.JButton returnToGameButton;
    // End of variables declaration//GEN-END:variables
	
}
