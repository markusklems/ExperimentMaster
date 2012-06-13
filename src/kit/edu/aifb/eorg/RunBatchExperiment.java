/**
 * 
 */
package kit.edu.aifb.eorg;

import org.apache.whirr.cli.JavaMain;

/**
 * @author markus
 *
 */
public class RunBatchExperiment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			JavaMain.main("launch-cluster", "--config=recipes/test.properties");
			JavaMain.main("run-experiment", "--config=recipes/test.properties", "--ycsb-experiment-action=load");
			JavaMain.main("run-experiment", "--config=recipes/test.properties", "--ycsb-experiment-action=run");
			JavaMain.main("run-experiment", "--config=recipes/test.properties", "--ycsb-experiment-action=upload");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
