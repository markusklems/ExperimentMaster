/**
 * 
 */
package kit.edu.aifb.eorg;

import org.apache.whirr.cli.Main;

/**
 * @author markus
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Main.main("launch-cluster", "--config=recipes/test.properties");
			Main.main("run-experiment", "--config=recipes/test.properties", "--ycsb-experiment-action=load");
			Main.main("run-experiment", "--config=recipes/test.properties", "--ycsb-experiment-action=run");
			Main.main("run-experiment", "--config=recipes/test.properties", "--ycsb-experiment-action=upload");
			Main.main("destroy-cluster", "--config=recipes/test.properties");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
