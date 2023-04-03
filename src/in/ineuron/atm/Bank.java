package in.ineuron.atm;
public class Bank
{
    public void initiate()
    {
        Atm a = new Atm();
        try
        {
            a.input();
            a.verify();
        }
        catch(InvalidCustomerException e)
        {
            try
            {
                a.input();
                a.verify();
            }
            catch(InvalidCustomerException f)
            {
                try
                {
                    a.input();
                    a.verify();
                }
                catch(InvalidCustomerException g)
                {
                    try
                    {
                        a.input();
                        a.verify();
                    }
                    catch(InvalidCustomerException h)
                    {
                        System.out.println("Your card has been blocked");
                        System.exit(0);
                    }
                }
            }
        }
    }
}