package in.ineuron.main;

import in.ineuron.atm.AccountHolder;
import in.ineuron.atm.Bank;

public class MainApp {
    public static void main(String[] args) {
        String bank = "**************** WELCOME TO INEURON BANK*****************";
        try
        {
            for(int i=0;i<bank.length();i++)
            {
                System.out.print(bank.charAt(i));
                Thread.sleep(30);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println();


        Bank b = new Bank();
        b.initiate();

        AccountHolder cc=new AccountHolder();
        cc.customer();
    }
}
