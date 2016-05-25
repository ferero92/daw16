package math;

public class Set {

	private int[] mySet;

	public Set(){

		this.mySet = new int[0];
	}

	public Set(int[] mySet){

		this.mySet = mySet;
	}

	public boolean isEmpty(){

		if(cardinality() == 0){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isBelongs(int e){

		for(int i = 0; i < this.cardinality(); i++){

			if(this.mySet[i] == e){
				return true;
			}
		}
		return false;
	}

	public void addElement(int e){

		if(!this.isBelongs(e)){

			int[] set = new int[this.cardinality() +1];

			for(int i = 0; i < this.cardinality(); i++){
				set[i] = mySet[i];
			}
			set[set.length -1] = e;

			this.mySet = set;
		}
	}

	public void deleteElement(int e){

		if(this.isBelongs(e)){

			int[] set = new int[this.cardinality() -1];

			for(int i = 0, j = 0; i < set.length; i++, j++){

				if(this.mySet[j] == e){
					j++;
				}
				else{
					set[i] = this.mySet[j];
				}
			}
			this.mySet = set;
		}
	}

	public void replaceElement(int e, int newE){

		if(this.isBelongs(e)){

			for(int i = 0; i < this.cardinality(); i++) {
				if(this.mySet[i] == e){
					this.mySet[i] = newE;
				}
			}
		}
	}

	public int cardinality(){

		return this.mySet.length;
	}

	public boolean equal(Set set){

		if(this.cardinality() == set.cardinality()){

			for(int i = 0; i < this.cardinality(); i++){

				if(!this.isBelongs(set.mySet[i])){
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public Set clon(){

		Set clon = new Set();

		for(int i = 0; i < this.cardinality(); i++){

			clon.addElement(this.mySet[i]);
		}
		return clon;
	}

	public Set union(Set set){

		Set union = this.clon();

		for(int i = 0; i < set.cardinality(); i++){

			union.addElement(set.mySet[i]);
		}
		return union;
	}

	public Set intersection(Set set){

		Set inter = new Set();

		for(int i = 0; i < this.cardinality(); i++){

			if(this.isBelongs(set.mySet[i])){

				inter.addElement(set.mySet[i]);
			}
		}
		return inter;
	}

	public String toString(){

		String string = "";

		for(int i = 0; i < this.cardinality(); i++){

			string += this.mySet[i] + "\t";
		}
		return string;
	}

}
