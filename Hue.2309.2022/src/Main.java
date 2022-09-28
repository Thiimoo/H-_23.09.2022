import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        NumberTest isEven = (n) -> (n % 2) == 0;
        NumberTest isPrime = (n) -> {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
        };
        NumberTest isPalindrome = (n) ->
        {
            int rev_num = 0;
            while (n > 0) {
                rev_num = rev_num * 10 + n % 10;
                n = n / 10;
            }
            return n == rev_num;
        };
        NumberTester numberTester = new NumberTester("Numbers.txt");
        numberTester.setOddEvenTester(isEven);
        numberTester.setPrimeTester(isPrime);
        numberTester.setPalindromeTester(isPalindrome);
        numberTester.test();

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");


        CalculationOperation add = (Number x,Number y) -> {return new Number(x.getA()+y.getA(),x.getB()+y.getB());};
        CalculationOperation subtract = (Number x,Number y) -> {return new Number(x.getA()-y.getA(),x.getB()-y.getB());};
        CalculationOperation multiply = (Number x,Number y) -> {return new Number(x.getA()*y.getA(),x.getB()*y.getB());};
        CalculationOperation divide = (Number x,Number y) -> {return new Number(x.getA()*y.getB(),x.getB()*y.getA());};

        RationalCalculator abR = new RationalCalculator(add,subtract,multiply,divide);

        add = (Number x,Number y) -> {return new Number(x.getA()+y.getA(),x.getB()+y.getB());};
        subtract = (Number x,Number y) -> {return new Number(x.getA()+y.getA(),x.getB()+y.getB());};
        multiply = (Number x,Number y) -> {return new Number(x.getA()*y.getB(),x.getB()*y.getA());};
        divide = (Number x,Number y) -> {return new Number(x.getA()*x.getB(),x.getB()+y.getB());};

        VectorCalculator abV = new VectorCalculator(add,subtract,multiply,divide);

        int input = 0;
        Number erg = new Number(0,0);
        Scanner scanner = new Scanner(System.in);
        Number eins = new Number(0,0);
        Number zwei = new Number(0,0);
        double d1 = 0;
        double n1 = 0;
        double d2 = 0;
        double n2 = 0;
        while (true)
        {
            System.out.println("Choose Calculator:");
            System.out.println("1 - Rational Calculator");
            System.out.println("2 - Vector Calculator");
            System.out.println("3 - Exit Programm");
            //Frau Steininger sagte wir müssen nur 2 machen...
            input = scanner.nextInt();
            switch (input)
            {
                case 1:
                    System.out.println("Enter denominator for fraction 1 :");
                    d1 = scanner.nextDouble();
                    System.out.println("Enter nominator for fraction 1 :");
                    n1 = scanner.nextDouble();
                    System.out.println("Enter denominator for fraction 2 :");
                    d2 = scanner.nextDouble();
                    System.out.println("Enter nominator for fraction 2 :");
                    n2 = scanner.nextDouble();
                    eins = new Number(d1,n1);
                    zwei = new Number(d2, n2);
                    System.out.println("Choose Operation:");
                    System.out.println("1 - add");
                    System.out.println("2 - subtract");
                    System.out.println("3 - multiply");
                    System.out.println("4 - divide");
                    input = scanner.nextInt();
                    switch (input)
                    {
                        case 1:
                            erg = abR.add.calc(eins, zwei);
                            System.out.println(erg.getA());
                            System.out.println("-");
                            System.out.println(erg.getB());
                            break;
                        case 2:
                            erg = abR.subtract.calc(eins, zwei);
                            System.out.println(erg.getA());
                            System.out.println("-");
                            System.out.println(erg.getB());
                            break;
                        case 3:
                            erg = abR.multiply.calc(eins, zwei);
                            System.out.println(erg.getA());
                            System.out.println("-");
                            System.out.println(erg.getB());
                            break;
                        case 4:
                            erg = abR.divide.calc(eins, zwei);
                            System.out.println(erg.getA());
                            System.out.println("-");
                            System.out.println(erg.getB());
                            break;
                        default:
                            System.out.println("Falsche Eingabe!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Enter factor X for vector 1 :");
                    d1 = scanner.nextDouble();
                    System.out.println("Enter factor Y for vector 1 :");
                    n1 = scanner.nextDouble();
                    System.out.println("Enter factor X for vector 2 :");
                    d2 = scanner.nextDouble();
                    System.out.println("Enter factor Y for vector 2 :");
                    n2 = scanner.nextDouble();
                    eins = new Number(d1,n1);
                    zwei = new Number(d2, n2);
                    System.out.println("Choose Operation:");
                    System.out.println("1 - add");
                    System.out.println("2 - subtract");
                    System.out.println("3 - multiply");
                    System.out.println("4 - divide");
                    input = scanner.nextInt();
                    switch (input)
                    {
                        case 1:
                            erg = abV.add.calc(eins, zwei);
                            System.out.println("X:");
                            System.out.println(erg.getA());
                            System.out.println("Y:");
                            System.out.println(erg.getB());
                            break;
                        case 2:
                            erg = abV.subtract.calc(eins, zwei);
                            System.out.println("X:");
                            System.out.println(erg.getA());
                            System.out.println("Y:");
                            System.out.println(erg.getB());
                            break;
                        case 3:
                            erg = abV.multiply.calc(eins, zwei);
                            System.out.println("X:");
                            System.out.println(erg.getA());
                            System.out.println("Y:");
                            System.out.println(erg.getB());
                            break;
                        case 4:
                            erg = abV.divide.calc(eins, zwei);
                            System.out.println("Skalar:");
                            System.out.println(erg.getA());
                            break;
                        default:
                            System.out.println("Wrong Operation!");
                            break;
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Wrong Input!");
                    break;
            }
        }
    }
}
