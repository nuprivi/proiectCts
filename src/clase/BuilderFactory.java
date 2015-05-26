package clase;

public class BuilderFactory {
	public UIBuilder getUIBuilder(String str){
	    UIBuilder builder = null;
	    if (str.equals(SearchManager.CANDIDATE_SRCH)){
	      builder = new CandSrchBuilder();
	    } 
	    else if (str.equals(SearchManager.EMPLOYER_SRCH)){
	      builder = new EmpSrchBuilder();
	    }
	    return builder;
	  }
}
