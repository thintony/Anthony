package Chapter5;
//Switch statement example to count A, B, C, D, F
import java.util.Scanner;
public class LetterGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initialization phase
		int total = 0;
		int gradeCounter = 0;
		int aCount = 0, bCount = 0, cCount = 0, dCount = 0, fCount = 0;
		Scanner input = new Scanner(System.in);
//	"Enter the integer grades in the range of 0 - 100 or Z to quit",
		while(input.hasNext()) {
			int grade = input.nextInt();
			total = total + grade;
			++gradeCounter;
			//increment appropriate letter-grade counter
			//switch(grade / 10)
			switch(grade / 10) {
			case 9:
			case 10:
				++aCount;
			  break;
			case 8:
			    ++bCount;
			  break;
			case 7:
			    ++cCount;
				break;
			case 6:
				++dCount;
			    break;
			default:
				++fCount;
				break; //optional;exit switch
			}
		}
		     // display grade report
		System.out.printf("%nGrade Report:%n");
		//if user entered at least one grade..
		if (gradeCounter != 0) {
			double average = (double) total / gradeCounter;
			//output summary of results
			
			System.out.printf("GradeNumbers: %d grades, GradeTotal: %d", gradeCounter, total);
			System.out.printf("  class average 1s %.2f%n", average);
			System.out.printf("%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d","A :",  aCount,"B: ", bCount,"C: ", cCount,"D: ", dCount,
					"F: ", fCount);
		}
			else {
				System.out.println("No grade entered");
				/**Type	the	end-of-file	indicator	to	terminate	input:			
					On	UNIX/Linux/macOS	type	<Ctrl>	d	then	press	Enter			
				On	Windows	type	<Ctrl>	z	then	press	Enter*/
			}
	}

}
