package by.it.pilipuk._examples_.demo04;

// Loop until an S is typed.
class ForTest {
  public static void main(String args[])   
    throws java.io.IOException { 
 
    int i; 
 
    System.out.println("Press S to stop."); 
 
    for(i = 0; (char) System.in.read() != 'S'; i++) 
      System.out.println("Pass #" + i); 
  }   
}