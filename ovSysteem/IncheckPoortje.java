package ovSysteem;

public class IncheckPoortje
{
    private String plaats;

    // Method voor de plaats
    public void setPlaats(String newPlaats)
    {
	plaats = newPlaats;

    }

    public void GeldigheidChecken(ovKaart o)
    {
	if (o.getSaldo() >= 3.0)
	{
	    o.setIngecheckt(true);
	    o.setPlaats(plaats);
	    System.out.println("Ingecheckt!");
	}

	else if (o.getSaldo() < 3.0)
	{
	    o.setIngecheckt(false);
	    System.out.println("Error! Niet genoeg saldo.");
	}
    }

}
