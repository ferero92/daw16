package objects;

public class Patient {

	private String name;
	private String disease;
	private int priority;

	public Patient(){

		this("John", "heart attack", 1);
	}

	public Patient(String name, String disease, int priority){

		this.name = name;
		this.disease = disease;
		this.priority = priority;
	}

	public String getName(){

		return this.name;
	}

	public String getDisease(){

		return this.disease;
	}

	public int getPriority(){

		return this.priority;
	}

	public void setPriority(int priority){

		this.priority = priority;
	}

	public String toString(){

		return 	"Patient: " + name + "\n" +
				"Disease: " + disease;
	}

}
