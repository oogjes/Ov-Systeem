package ovSysteem;

public class inchecken
{
    
    public double withinchdraw (double amount) {
	
	ovKaart ov = new ovKaart();
	ovApparaat app = new ovApparaat();
	
	if (ov.saldo > ) {
	System.out.println("Not enough money on the account");
	}
	else if (saldo < 0) {
	System.out.println("Your saldo is negative");    
	} else {
	    saldo -= amount;
	}
	
	return saldo;
    }
}
