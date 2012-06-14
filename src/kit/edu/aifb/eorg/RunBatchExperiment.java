/**
 * 
 */
package kit.edu.aifb.eorg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.whirr.cli.JavaMain;

/**
 * @author markus
 *
 */
public class RunBatchExperiment {

	static String dir="recipes/";
	static String filename = "test.properties";
	static String propfile = dir+filename;
	static BufferedWriter out;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			out = new BufferedWriter(new FileWriter("log-"+filename));
			log(out, "Starting experiment "+propfile);
			log(out, "launch-cluster",  System.currentTimeMillis());
			JavaMain.main("launch-cluster", "--config="+propfile);
			log(out, "run-experiment-load",  System.currentTimeMillis());
			JavaMain.main("run-experiment", "--config="+propfile, "--ycsb-experiment-action=load");
			log(out, "run-experiment-run",  System.currentTimeMillis());
			JavaMain.main("run-experiment", "--config="+propfile, "--ycsb-experiment-action=run");
			log(out, "run-experiment-upload",  System.currentTimeMillis());
			JavaMain.main("run-experiment", "--config="+propfile, "--ycsb-experiment-action=upload");
			log(out, "destroy-cluster",  System.currentTimeMillis());
			JavaMain.main("destroy-cluster", "--config="+propfile);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void log(BufferedWriter out, String phase, long currentTimeMillis) throws IOException {
		log(out, phase+","+currentTimeMillis);
	}
	private static void log(BufferedWriter out, String string) throws IOException {
		out.write(string);
		out.write("\n");
	}

}
