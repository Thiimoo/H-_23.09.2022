public class NumberTester {

   private String filename;
   private NumberTester oddEvenTester;



   private NumberTester primeTester;

   private NumberTester palindromeTester;

   public NumberTester(String filename)
   {
      this.filename = filename;
       //TODO
   }

   public void setOddEvenTester(NumberTester oddEvenTester)
   {
      this.oddEvenTester = oddEvenTester;
   }

   public void setPrimeTester(NumberTester primeTester) {
      this.primeTester = primeTester;
   }

   public void setPalindromeTester(NumberTester palindromeTester) {
      this.palindromeTester = palindromeTester;
   }
}
