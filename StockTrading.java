package codealphatask;


    import java.util.Scanner;

class StockTrading
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String stockName = "ABC";
        double stockPrice = 100.0;

        int ownedShares = 0;
        double balance = 10000.0;

        int choice, shares;

        do
        {
            System.out.println("\n----- STOCK TRADING PLATFORM -----");
            System.out.println("1. View Stock");
            System.out.println("2. Buy Shares");
            System.out.println("3. Sell Shares");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Stock Name: " + stockName);
                    System.out.println("Stock Price: Rs." + stockPrice);
                    break;

                case 2:
                    System.out.print("Enter number of shares to buy: ");
                    shares = sc.nextInt();

                    if(balance >= shares * stockPrice)
                    {
                        ownedShares = ownedShares + shares;
                        balance = balance - (shares * stockPrice);
                        System.out.println("Shares purchased successfully.");
                    }
                    else
                    {
                        System.out.println("Insufficient balance.");
                    }
                    break;

                case 3:
                    System.out.print("Enter number of shares to sell: ");
                    shares = sc.nextInt();

                    if(shares <= ownedShares)
                    {
                        ownedShares = ownedShares - shares;
                        balance = balance + (shares * stockPrice);
                        System.out.println("Shares sold successfully.");
                    }
                    else
                    {
                        System.out.println("Not enough shares.");
                    }
                    break;

                case 4:
                    System.out.println("Owned Shares: " + ownedShares);
                    System.out.println("Available Balance: Rs." + balance);
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 5);
    }
}
