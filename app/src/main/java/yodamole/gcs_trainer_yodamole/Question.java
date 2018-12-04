package yodamole.gcs_trainer_yodamole;
/**
 * @author pbs2h17ale
 * @author pbd2h17ayo
 */
public class Question {
	
	/**
	 * @param randomPatient : String
	 * @param question      : StringBuilder
	 * @param gcsValue      : integer
	 */
	private Patient randomPatient;
	private StringBuilder question = new StringBuilder();
	private int gcsValue;
	
	/**
	 * Constructor.
	 * 
	 * Initializes a new Patient object.
	 * Generates a question StringBuilder.
	 * Calculates the gscValue.
	 */
	public Question() {
		// Initializes a new Patient object.
		this.randomPatient = new Patient();	
		// Generates a question StringBuilder and adds substrings from our patient object to a question frame.
		question.append("Der Patient ");
		question.append(this.randomPatient.getPerception());
		question.append(", ");
		question.append(this.randomPatient.getCommunication());
		question.append(" und ");
		question.append(this.randomPatient.getReaction());
		question.append(".");
		// Calculates the gscValue from our patient object values.
		gcsValue = this.randomPatient.getPerceptionValue()+this.randomPatient.getCommunicationValue()+this.randomPatient.getReactionValue();	
	}
	
	/**
	 * Getters for the question StringBuilder and gscValue.
	 * 
	 * @return generated question StringBuilder as string.
	 * @return calculated gcsValue as integer.
	 */
	
	public String returnQuestion(){
		return question.toString();
	}
	
	public String returnGcsValue(){
		return Integer.toString(gcsValue);
	}
}