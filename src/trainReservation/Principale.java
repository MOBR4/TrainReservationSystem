package trainReservation;


public class Principale {


	public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new WelcomeIHM().setVisible(true);
            }
        });
    }

}