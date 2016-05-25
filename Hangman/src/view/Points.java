package view;

public class Points {
	
	public static final int GALLOWS = 7;
	public static final int HEAD = 11;
	
	private int[] x;
	private int[] y;
	private int[] rx;
	private int[] ry;
	private int[] lx;
	private int[] ly;

	public Points(){
		
		this.x = new int[]{
				120,70,170,120,120,350,350,//gallows
				290,280,320,380,420,410,350,410,420,380,350,//head
				350,350,320,350,380,350,350,320,350,380//body
				};
		this.y = new int[]{
				380,400,400,380,30,30,50,//gallows
				80,130,170,170,130,80,50,80,130,170,170,//head
				300,200,250,200,250,200,300,350,300,350//body
				};
		this.rx = this.right();
		this.ry	= this.moveY();
		this.lx = this.left();
		this.ly = this.moveY();
	}

	public int[] getX() {
		return x;
	}

	public int[] getY() {
		return y;
	}

	public int[] getRx() {
		return rx;
	}

	public int[] getRy() {
		return ry;
	}

	public int[] getLx() {
		return lx;
	}

	public int[] getLy() {
		return ly;
	}

	public int[] right(){
		
		int[] right = new int[this.x.length];
		
		for(int i = 0; i < right.length; i++){
			if(i < GALLOWS -1)
				right[i] = this.x[i];
			else
				right[i] = this.x[i] + 10;
		}		
		return right;
	}
	
	public int[] left(){
		
		int[] left = new int[this.x.length];
		
		for(int i = 0; i < left.length; i++){
			if(i < GALLOWS -1)
				left[i] = this.x[i];
			else
				left[i] = this.x[i] - 10;
		}
		return left;
	}
	
	public int[] moveY(){
		
		int[] move = new int[this.y.length];
		
		for(int i = 0; i < move.length; i++){
			if(i < GALLOWS -1)
				move[i] = this.y[i];
			else
				move[i] = this.y[i] - 10;
		}
		return move;
	}

}
