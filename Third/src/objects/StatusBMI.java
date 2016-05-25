package objects;

import objects.BMI;

public class StatusBMI {
	
	private BMI index;
	private char gender;
	
	public StatusBMI(){
		
		this(75, 1.80, 'M');
	}
		
	public StatusBMI(double weight, double height, char gender){
		
		this.index = new BMI(weight, height, gender);
		this.gender = gender;
	}
	
	public double getBMI(){
		
		return index.getBMI();
	}
	
	public char getGender(){
		
		return gender;
	}
	
	public void setBMI(double weight, double height){
		
		this.index = new BMI(weight, height);
	}
	
	public void setGender(char gender){
		
		this.gender = gender;
	}
	
	public String getStatus(){
		
		String result = "";
		
		switch(gender){		
			case 'M': 	if(index.getBMI() < 20.0){
							result = "underweight";
						}
						else{
							if(index.getBMI() < 26.0){
								result = "normal";
							}
							else{
								if(index.getBMI() < 31.0){
									result = "overweight";
								}
								else{
									result = "obese";
								}
							}
						}
				break;
			case 'F':	if(index.getBMI() < 20.0){
							result = "underweight";
						}
						else{
							if(index.getBMI() < 25.0){
								result = "normal";
							}
							else{
								if(index.getBMI() < 30.0){
									result = "overweight";
								}
								else{
									result = "obese";
								}
							}
						}
		}				
		return result;
	}

}
