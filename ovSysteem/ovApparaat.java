package ovSysteem;

import java.util.*;

public class ovApparaat
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
	// Andere classes
	ovKaart ov = new ovKaart();
	IncheckPoortje poort = new IncheckPoortje();
	opwaarderen opwaar = new opwaarderen(ov);

	// plaats: Nijmegen
	poort.setPlaats("Nijmegen");

	// Ov name
	ov.setName("Ov-kaart");
	// Ov saldo
	ov.setSaldo(2.0);

	// Checken of ov is ingecheckt
	poort.GeldigheidChecken(ov);

	// Laat ov naam zien
	// System.out.println(ov.name);

	// Laat ov saldo zien
	System.out.println("Saldo in ov: €" + ov.saldo);

	// Laat zien of ov is ingecheckt (boolean)
	// System.out.println(ov.ingecheckt);

	// Laat ov plaats zien
	// System.out.println(ov.plaats);

	System.out.println("     ");

	// Opwaardeer menu
	opwaar.menu(ov, scan);

	// Checken of ov is ingecheckt na opwaarderen
	System.out.println("     ");
	poort.GeldigheidChecken(ov);

    }

}
