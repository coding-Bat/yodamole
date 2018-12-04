package yodamole.gcs_trainer_yodamole;
/**
 * @author pbs2h17ale
 * @author pbd2h17ayo
 */
public class Reaction {

	/**
	 * String array containing the possible cases for GCS reactions regarding pain impulses.
	 * The array positions + 1 act as the points given in the GCS table for the given substrings.
	 */
	public static String[] react = {"zeigt keine Reaktion auf Schmerzreiz",
							  		"reagiert auf Schmerzreiz mit Strecksynergismen",
							  		"reagiert auf Schmerzreiz mit Beugeynergismen",
							  		"zeigt ungezielte Schmerzabwehr",
							  		"zeigt gezielte Schmerzabwehr",
							  		"befolgt Aufforderungen"
								   };
}