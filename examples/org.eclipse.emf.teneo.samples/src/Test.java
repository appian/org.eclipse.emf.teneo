import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 
 */

/**
 * @author mtaal
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			final BufferedReader br = new BufferedReader(new FileReader("/home/mtaal/mytmp/news_sub.txt"));
			String line;
			String prevline = null;
			while ((line = br.readLine()) != null) {
				if (line.indexOf("\t") == -1) {
					prevline = line;
				} else {
					if (line.indexOf("Surface-mounted Resistor Chips (R-Chips)") != -1) {
						final String[] fields = line.split("\t");
						if (fields[0].length() == 0) {
							if (prevline == null) {
								throw new Error(line);
							}
							System.err.println(prevline);
							prevline = null;
						} else {
							System.err.println(fields[0]);
						}
					}
				}
			}

		} catch (Exception e) {
			throw new Error(e);
		}

	}
}
