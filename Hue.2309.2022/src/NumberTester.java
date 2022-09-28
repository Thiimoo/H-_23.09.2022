import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester implements NumberTest{

   private String filename;
   private NumberTest oddEvenTester;

   private NumberTest primeTester;

   private NumberTest palindromeTester;

   public NumberTester(String filename)
   {
      this.filename = filename;
       //TODO
   }

   public void test()
   {
      try {
         File f = new File("D:\\Repositorys\\H-_23.09.2022\\Hue.2309.2022\\src\\Numbers.txt");
         Scanner s = new Scanner(f);
         String line = null;
         String[] parts;
         while (s.hasNextLine())
         {
            line = s.nextLine();
            parts = line.split(" ");
            switch(Integer.parseInt(parts[0]))
            {
               case 1:
                  if(oddEvenTester.testNumber(Integer.parseInt(parts[1])))
                  {
                     System.out.println("Even");
                  }
                  else
                  {
                     System.out.println("Odd");
                  }
                  break;
               case 2:
                  if(primeTester.testNumber(Integer.parseInt(parts[1])))
                  {
                     System.out.println("Prime");
                  }
                  else
                  {
                     System.out.println("Not a Prime");
                  }
                  break;
               case 3:
                  if(palindromeTester.testNumber(Integer.parseInt(parts[1])))
                  {
                     System.out.println("Palindrome");
                  }
                  else
                  {
                     System.out.println("Not a Palindrome");
                  }
                  break;
               default:
                  //System.out.println("Keine richtige Operation");
            }
         }
      } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
      }
   }

   public void setOddEvenTester(NumberTest oddEvenTester)
   {
      this.oddEvenTester = oddEvenTester;
   }

   public void setPrimeTester(NumberTest primeTester) {
      this.primeTester = primeTester;
   }

   public void setPalindromeTester(NumberTest palindromeTester) {
      this.palindromeTester = palindromeTester;
   }

   @Override
   public boolean testNumber(int number) {
      return false;
   }
}
