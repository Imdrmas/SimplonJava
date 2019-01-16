import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		/*
		 * Applacation Help On if Switch While Do While Choose one 1 The If:
		 * if(Condition) { Statment }else{ Statment }
		 */

		char confirm = 'y';
		while (confirm == 'y') {

			System.out.println("\nChoose One Of This List To Learn Java Statments\n");
			System.out.println("1 if staments \n------------------");
			System.out.println("2 Switch staments \n------------------");
			System.out.println("3 while staments \n------------------");
			System.out.println("4 do while staments \n-----------------");

			Scanner s = new Scanner(System.in);

			// Input Only Numbers
			while (!s.hasNextInt()) {
				s.next();
				System.out.println("Please Enter Number From This List");
			}

			int num = s.nextInt();

			switch (num) {
			case 1:
				System.out.println("\nJava if Statement");
				System.out.println("\nExample:");
				System.out.println(" int number = 10;\n" + "	 \n" + "      if (number > 0) {\n"
						+ "         System.out.println(\"Number is positive.\");\n" + "      }\n" + "      else {\n"
						+ "         System.out.println(\"Number is not positive.\");\n" + "      }\n" + " \n"
						+ "      System.out.println(\"This statement is always executed.\");");
				break;
			case 2:
				System.out.println("\n---------------\n");
				System.out.println("Java switch Statement");
				System.out.println("Example:");

				System.out.println("int week = 4;\n" + "      String day;\n" + "	        \n"
						+ "      switch (week) {\n" + "         case 1:\n" + "           day = \"Sunday\";\n"
						+ "           break;\n" + "         case 2:\n" + "           day = \"Monday\";\n"
						+ "	   break;\n" + "         case 3:\n" + "           day = \"Tuesday\";\n"
						+ "           break;\n" + "         case 4:\n" + "           day = \"Wednesday\";\n"
						+ "           break;\n" + "         case 5:\n" + "           day = \"Thursday\";\n"
						+ "           break;\n" + "         case 6:\n" + "           day = \"Friday\";\n"
						+ "           break;\n" + "         case 7:\n" + "           day = \"Saturday\";\n"
						+ "           break;\n" + "         default: \n" + "           day = \"Invalid day\";\n"
						+ "           break;\n" + "      }\n" + "      System.out.println(day);");
				break;
			case 3:
				System.out.println("\n---------------\n");
				System.out.println("Java while Loop Statments");
				System.out.println("Example:");

				System.out.println("      int i = 1;\n" + "	   \n" + "      while (i <= 10) {\n"
						+ "         System.out.println(\"Line \" + i);\n" + "         ++i;\n" + "      }");
				break;
			case 4:
				System.out.println("\n---------------\n");
				System.out.println("Java do...while Loop");
				System.out.println("Example:");

				System.out.println("      Double number, sum = 0.0;\n"
						+ "      Scanner input = new Scanner(System.in);\n" + "\n" + "      do {\n"
						+ "    	 System.out.print(\"Enter a number: \");\n" + "    	 number = input.nextDouble();\n"
						+ "    	 sum += number;\n" + "      } while (number != 0.0);\n" + "	   \n"
						+ "      System.out.println(\"Sum = \" + sum);");
				break;
			default:
				// System.out.println("We don't have any choice click (y) ?");
				System.out.println("You Have To Choose From The List");
				break;

			}

			System.out.println("\nIf You Want To Try Again Click (y) ? : Or Any Key To Exit");
			confirm = s.next().charAt(0);

			if (confirm != 'y') {
				System.out.println("\n You have been exit to program ?");
			}

		}

	}

}
