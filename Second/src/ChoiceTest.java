import javax.swing.JOptionPane;
public class ChoiceTest {

	public static void main(String[] args) {
						
		int menu = 0;
		char[] solutions = solutionsTest();
		char[][] answers = numberStudents(solutions);
		
		do{
			menu = doMenu();
			
			switch(menu){
				case 1:inputMatrix(answers);
					break;
				case 2:randomMatrix(answers);
						System.out.println(printArray(solutions) + "\n");
						System.out.println(printMatrix(answers));
					break;
				case 3:double[] results = results(solutions, answers);
						JOptionPane.showMessageDialog(null, "Results:" + "\n" + printArray(results), "Test", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:break;
				default:JOptionPane.showMessageDialog(null, "Incorrect option. Please try again", "Test", JOptionPane.WARNING_MESSAGE);					
			}
			
		}while(menu != 4);

	}
	
	public static int doMenu(){//**********************************************************menu of the program
		
		String String = "Welcome to Choice Test, please select an option:" + "\n"
							+ "\n"							
							+ "1 = Answer of students" + "\n"
							+ "2 = Random answers" + "\n"
							+ "3 = See the results" + "\n"
							+ "4 = Exit" + "\n";
		
		int option = Integer.parseInt(JOptionPane.showInputDialog(null, String, "Working Bidimensional Arrays", JOptionPane.QUESTION_MESSAGE));
										
		return option;
	}
	
	public static char[] solutionsTest(){
		
		char[] solutions = new char[Integer.parseInt(JOptionPane.showInputDialog(null, "Number of questions", "Test", JOptionPane.QUESTION_MESSAGE))];
		
		for(int i = 0; i < solutions.length; i++){
			
			solutions[i] = (char)('A' + (Math.random() * (('E' - 'A') + 1)));
					//(JOptionPane.showInputDialog(null, "Answer for question " + (i + 1), "Test", JOptionPane.QUESTION_MESSAGE)).charAt(0);
		}
		return solutions;
	}
	
	public static char[][] numberStudents(char[] solutions){
		
		char[][] students = new char[Integer.parseInt(JOptionPane.showInputDialog(null, "Number of students", "Test", JOptionPane.QUESTION_MESSAGE))][solutions.length];
		
		return students;
	}
	
	public static void inputMatrix(char[][] answers){
		
		for(int i = 0; i < answers.length; i++){
			for(int j = 0; j < answers[0].length; j++){
				answers[i][j] = (JOptionPane.showInputDialog(null, "Answer of student number " + (i + 1) + " for question number " + (j + 1), "Test", JOptionPane.QUESTION_MESSAGE)).charAt(0);
			}
		}		
	}
	
	public static void randomMatrix(char[][] answers){
		
		for(int i = 0; i < answers.length; i++){
			for(int j = 0; j < answers[0].length; j++){
				
				answers[i][j] = (char)('A' + (Math.random() * (('E' - 'A') + 1)));
			}
		}		
	}
	
	public static double[] results(char[] solutions, char[][] answers){
		
		double[] results = new double[answers.length];
		
		for(int i = 0; i < answers.length; i++){
			for(int j = 0; j < answers[0].length; j++){
			
				if(answers[i][j] == solutions[j]){
					results[i]++;
				}
				else{
					results[i] -= 0.5;
				}				
			}			
		}		
		return results;
	}
	
	public static String printArray(double[] array){//******************************************print an array
		
		String String = "";
		
		for(int i = 0; i < array.length; i++){
			
			String += array[i] + "  ";
		}
		return String;
	}
	
	public static String printMatrix(char[][] matrix){//**************************print the values of a matrix
		
		String String = "";
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				
				String += matrix[i][j] + "  ";
			}
			String += "\n";			
		}						
		return String;
	}
	
	public static String printArray(char[] array){//********************************************print an array
		
		String String = "";
		
		for(int i = 0; i < array.length; i++){
			
			String += array[i] + "  ";
		}
		return String;
	}
	
	
}
