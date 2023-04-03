package in.ineuron.atm;

import java.util.Scanner;

class Atm
{
    int userid = 12345;
    int pin = 123;
    int uid;
    int pw;

    public void input()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kindly enter the user id !");
        uid = scan.nextInt();

        System.out.println("Kindly enter the Pin !");
        pw = scan.nextInt();
    }

    public void verify() throws InvalidCustomerException
    {
        if((userid==uid) && (pin ==pw))
        {
            System.out.println();
        }
        else
        {
            InvalidCustomerException pas = new InvalidCustomerException("Invalid input Please try again !");
            System.out.println(pas.getMessage());
            throw pas;
        }
    }
}
