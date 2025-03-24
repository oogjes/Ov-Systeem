package ovSysteem;

public class ovApparaat
{
    static public double app = 3.0;
    
    public static void main(String[] args)
    {	ovKaart ov = new ovKaart();
	
	// Laat ov saldo zien
	System.out.println("Saldo in ov: €" + ov.saldo);
	
	// Als ov saldo meer is dan wat app nodig heeft
	if (ov.saldo > app ) {
		System.out.println("Ingecheckt!");
		}
	// Als ov saldo gelijk is aan wat app nodig heeft
	else if (ov.saldo == app) {
		System.out.println("Ingecheckt!");    
		} 
	// Als ov saldo minder is dan wat app nodig heeft
	else if (ov.saldo < app) {
		System.out.println("Error! Niet genoeg saldo.");    
		} 

    }
}
