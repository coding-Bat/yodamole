package yodamole.gcs_trainer_yodamole;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author pbs2h17ale
 * @author pbd2h17ayo
 */
public class Patient {

	/**
	 * @param perception		 : String
	 * @param communication      : String
	 * @param reaction			 : String
	 * 
	 * @param perceptionValue    : integer
	 * @param communicationValue : integer
	 * @param reactionValue      : integer
	 */
	private String perception;
	private String communication;
	private String reaction;
	
	private int perceptionValue;
	private int communicationValue;
	private int reactionValue;
	
	/**
	 * Constructor.
	 * 
	 * Setting the substrings.
	 * Assigning the values of the corresponding substrings.
	 */
	public Patient() {
		
		// Substrings.
		
		// Assign a random substring from the corresponding array.
		this.perception = Perception.per[getRandom(0,3)];
		// Assign a random substring from the corresponding array.
		this.communication = Communication.com[getRandom(0,4)];
		// Assign a random substring from the corresponding array.
		this.reaction = Reaction.react[getRandom(0,5)];
		
		/**
		 * Values.
		 * Iterate over arrays and assign the values.
		 * Values equal their array position + 1.
		 */
		
		// Perception.
		for (int i = 0; i < Perception.per.length; i++) {
			// Check if array at position i equals our generated substring.
			if(Perception.per[i] == this.perception){
				// Assign the value. (i = array position, +1 because our range is 1...X, not 0...X)
				this.perceptionValue = i+1;
			}
		}
		// Communication.
		for (int i = 0; i < Communication.com.length; i++) {
			// Check if array at position i equals our generated substring.
			if(Communication.com[i] == this.communication){
				// Assign the value. (i = array position, +1 because our range is 1...X, not 0...X)
				this.communicationValue = i+1;
			}
		
		}
		// Reaction.
		for (int i = 0; i < Reaction.react.length; i++) {
			// Check if array at position i equals our generated substring.
			if(Reaction.react[i] == this.reaction){
				// Assign the value. (i = array position, +1 because our range is 1...X, not 0...X)
				this.reactionValue = i+1;
			}
		}
	}

	public int getRandom(int min, int max){
		return (int) Math.floor(Math.random() * (max -min +1))+ min;
	}

	/**
	 * Getters for strings and values.
	 * 
	 * @return patient substrings as strings.
	 * @return corresponding substring value as integer.
	 */
	
	public String getPerception() {
		return perception;
	}
	
	public String getCommunication() {
		return communication;
	}

	public String getReaction() {
		return reaction;
	}

	public int getPerceptionValue() {
		return perceptionValue;
	}

	public int getCommunicationValue() {
		return communicationValue;
	}

	public int getReactionValue() {
		return reactionValue;
	}	
	
}