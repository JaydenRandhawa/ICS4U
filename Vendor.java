/*
   This class implements a vendor that sells one kind of items.
   A vendor carries out sales transactions.
*/

public class Vendor
{
  // Fields:
  private static double totalSales = 0.00;
  private int PRICE;
  private int STOCK;
  private int CHANGE;
  private int CENTS = 0;

  //  Constructor
  //  Parameters:
  //    int price of a single item in cents
  //    int number of items to place in stock
  public Vendor(int price, int stock){
    PRICE = price;
    STOCK = stock;
  }

  //  Sets the quantity of items in stock.
  //  Parameters:
  //    int number of items to place in stock
  //  Return:
  //    None
  public void setStock(int items){
    STOCK += items;
  }

  //  Returns the number of items currently in stock.
  //  Parameters:
  //    None
  //  Return:
  //    int number of items currently in stock
  public int getStock(){
    return(STOCK);
  }

  //  Adds a specified amount (in cents) to the deposited amount.
  //  Parameters:
  //    int number of cents to add to the deposit
  //  Return:
  //    None
  public void addMoney(int cents){
    CENTS += cents;
  }

  //  Returns the currently deposited amount (in cents).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current deposit
  public int getDeposit(){
    return CENTS;
  }

  //  Implements a sale.  If there are items in stock and
  //  the deposited amount is greater than or equal to
  //  the single item price, then adjusts the stock
  //  and calculates and sets change and returns true;
  //  otherwise refunds the whole deposit (moves it into change)
  //  and returns false.
  //  Parameters:
  //    None
  //  Return:
  //    boolean successful sale (true) or failure (false)
  public boolean makeSale(){
    if(STOCK > 0 && CENTS >= PRICE){
      STOCK--;
      CENTS-=PRICE;
      CHANGE = CENTS;
      CENTS = 0;

      totalSales += (PRICE/100) + (PRICE%100)/100.00;

      return true;
    }
    return false;
  }

  //  Returns and zeroes out the amount of change (from the last
  //  sale or refund).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current change
  public int getChange(){
    int change = CHANGE;
    CHANGE = 0;
    return change;
  }

  public static double getTotalSales(){
    double ts = totalSales;
    totalSales = 0.00;
    return ts;
  }
}