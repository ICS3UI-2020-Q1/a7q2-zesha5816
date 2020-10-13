/**
 * a procedure-type method called factors that will take    an integer as a parameter and will print out every       number that will divide the parameter evenly.
 * @author Ahmad Zeshan
 */
public class Main {
/**creates a procedure which devides the factor number by the increasing increment of i until it reaches back to its origial number and prints out 
*/ 
	public static int factors(int factor){
		for(int i = 1; i < factor; i++){
			if(factor%i == 0){
				System.out.println(i);
			}else{}
		}
		return factor;
	}
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
   factors(10);  
  }
}
