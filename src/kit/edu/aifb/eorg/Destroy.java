package kit.edu.aifb.eorg;

import org.apache.whirr.cli.JavaMain;

public class Destroy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			JavaMain.main("destroy-cluster", "--config=recipes/test.properties");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
