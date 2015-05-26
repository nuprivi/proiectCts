package clase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ButtonHandler implements ActionListener {
	SearchManager manager;

	  UIBuilder builder;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if (e.getActionCommand().equals(SearchManager.EXIT)) {
		      System.exit(1);
		    }
		    if (e.getActionCommand().equals(SearchManager.GET_SQL)) {
		      manager.setSQL(builder.getSQL());
		    }
		    if (e.getSource() == manager.getSearchTypeCtrl()) {
		      String selection = manager.getSearchType();

		      if (selection.equals("") == false) {
		        BuilderFactory factory = new BuilderFactory();
		        //create an appropriate builder instance
		        builder = factory.getUIBuilder(selection);
		        //configure the director with the builder
		        UIDirector director = new UIDirector(builder);
		        //director invokes different builder
		        // methods
		        director.build();
		        //get the final build object
		        JPanel UIObj = builder.getSearchUI();
		        manager.displayNewUI(UIObj);
		      }
		    }
	}
		    public ButtonHandler() {
		    }

		    public ButtonHandler(SearchManager inManager) {
		      manager = inManager;
		    }


}
