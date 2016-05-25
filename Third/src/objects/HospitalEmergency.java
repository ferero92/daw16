package objects;

import java.util.ArrayList;

public class HospitalEmergency extends ArrayList<Patient> {

	private static final long serialVersionUID = 1L;

	public HospitalEmergency(){

		super();
	}

	public Patient pop(){

		if(!isEmpty()){
			Patient p = get(0);
			remove(0);

			return p;
		}
		else{
			return null;
		}
	}

	public void push(Patient p){

		if(isEmpty()){
			add(p);
		}
		else{
			int i = 0;
			while(i < size() && get(i).getPriority() <= p.getPriority()){
				i++;
			}
			if(i == size()){
				add(p);
			}
			else{
				add(i, p);
			}
		}
	}

	public String toString(){

		String string = "";

		for(int i = 0; i < size(); i++){

			string += get(i).toString() + "\n";
		}
		return string;
	}

}
