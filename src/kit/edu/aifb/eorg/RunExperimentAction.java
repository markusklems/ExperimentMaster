package kit.edu.aifb.eorg;

import org.apache.whirr.cli.JavaMain;

public class RunExperimentAction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			JavaMain.main("run-experiment", "--config=recipes/test.properties", "--ycsb-experiment-action=load");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
