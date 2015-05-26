
package clase;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EmpSrchBuilder extends UIBuilder {
	JLabel lblUserName = new JLabel("Name :");

	  private JTextField txtUserName = new JTextField(15);

	  private JTextField txtCity = new JTextField(15);

	  private JTextField txtRenewal = new JTextField(10);

	@Override
	public void addUIControls() {
		// TODO Auto-generated method stub
		searchUI = new JPanel();
	    JLabel lblUserName = new JLabel("Name :");
	    JLabel lblCity = new JLabel("City:");
	    JLabel lblRenewal = new JLabel("Membership Renewal :");

	    GridBagLayout gridbag = new GridBagLayout();
	    searchUI.setLayout(gridbag);
	    GridBagConstraints gbc = new GridBagConstraints();
	    searchUI.add(lblUserName);
	    searchUI.add(txtUserName);
	    searchUI.add(lblCity);
	    searchUI.add(txtCity);
	    searchUI.add(lblRenewal);
	    searchUI.add(txtRenewal);

	    gbc.anchor = GridBagConstraints.WEST;

	    gbc.insets.top = 5;
	    gbc.insets.bottom = 5;
	    gbc.insets.left = 5;
	    gbc.insets.right = 5;

	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gridbag.setConstraints(lblUserName, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    gridbag.setConstraints(lblCity, gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    gridbag.setConstraints(lblRenewal, gbc);

	    gbc.anchor = GridBagConstraints.WEST;
	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    gridbag.setConstraints(txtUserName, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 1;
	    gridbag.setConstraints(txtCity, gbc);
	    gbc.gridx = 1;
	    gbc.gridy = 2;
	    gridbag.setConstraints(txtRenewal, gbc);
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		 Calendar cal = Calendar.getInstance();
		    cal.setTime(new java.util.Date());

		    txtUserName.setText("Enter UserName Here");
		    txtRenewal.setText((cal.get(Calendar.MONTH) + 1) + "/"
		        + cal.get(Calendar.DATE) + "/" + cal.get(Calendar.YEAR));
	}

	@Override
	public String getSQL() {
		// TODO Auto-generated method stub
		return ("Select * from Employer where Username='"
		        + txtUserName.getText() + "'" + " and City='"
		        + txtCity.getText() + "' and DateRenewal='"
		        + txtRenewal.getText() + "'");
	}

}
