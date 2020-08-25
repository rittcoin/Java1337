// ---------------------------------------------------
//                 TableLoops.java
// ---------------------------------------------------
import javax.swing.JOptionPane;

public class TableLoops
{
	public static void main ( String [ ] args )
	{
		String table = "     i     i-squared     ";		// Create the header
		table += "\n------------------------";			// Add the heading underline

		for ( int i = 0 ; i <= 10 ; i++ ) {


			table += "\n|     " + i + "  |\t  " + i*i + "   |";
		}

		System.out.println ( table );
		JOptionPane.showMessageDialog ( null, table );
	}
}

