package clase;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CandSrchBuilder extends UIBuilder {
	private JTextField txtUserName = new JTextField(15);

	  private JTextField txtSkill = new JTextField(10);

	  private JComboBox cmbExperience = new JComboBox();
	@Override
	public void addUIControls() {
		// TODO Auto-generated method stub
		searchUI = new JPanel();
	    JLabel lblUserName = new JLabel("Name :");
	    JLabel lblExperienceRange = new JLabel("Experience(min Yrs.):");
	    JLabel lblSkill = new JLabel("Skill :");
	    cmbExperience.addItem("<5");
	    cmbExperience.addItem(">5");

	    GridBagLayout gridbag = new GridBagLayout();
	    searchUI.setLayout(gridbag);
	    GridBagConstraints gbc = new GridBagConstraints();
	    gbc.anchor = GridBagConstraints.WEST;
	    searchUI.add(lblUserName);
	    searchUI.add(txtUserName);
	    searchUI.add(lblExperienceRange);
	    searchUI.add(cmbExperience);
	    searchUI.add(lblSkill);
	    searchUI.add(txtSkill);

	    gbc.insets.top = 5;
	    gbc.insets.bottom = 5;
	    gbc.insets.left = 5;
	    gbc.insets.right = 5;

	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gridbag.setConstraints(lblUserName, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    gridbag.setConstraints(lblExperienceRange, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    gridbag.setConstraints(lblSkill, gbc);

	    gbc.anchor = GridBagConstraints.WEST;
	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    gridbag.setConstraints(txtUserName, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 1;
	    gridbag.setConstraints(cmbExperience, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 2;
	    gridbag.setConstraints(txtSkill, gbc);
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		txtUserName.setText("Enter UserName Here");
	    txtSkill.setText("Internet Tech");
	}

	@Override
	public String getSQL() {
		String experience = (String) cmbExperience.getSelectedItem();
	    return ("Select * from Candidate where Username='"
	        + txtUserName.getText() + "' and Experience " + experience
	        + " and Skill='" + txtSkill.getText() + "'");
	}

}
