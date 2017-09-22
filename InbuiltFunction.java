/*program for coverting int variable to string using an inbuilt function of string class*/

package stringclass;//created pacakge as stringclass

public class InbuiltFunction {//created class as InbuitlFunction
	                          //classes are the basics of opps(object oriented programming)
                          //Here public is a access modifier which defines who can access this method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter

		int integer = 350;//initializing interger value
		
		String string = String.valueOf(integer);//string value of integer
		
		string = Integer.toString(integer);//integer to string
		
		System.out.println("After converting the integer variable to String ");//system is used to return code
		                                                                       //out is a static member
		                                                                  //println is used to print text and gives output
		System.out.println("it gives the output: " +integer);//system is used to return code
        //out is a static member
   //println is used to print text and gives output

	}

}