import java.util.Timer;
import java.util.TimerTask;

import ventanas.VentInicio;
import ventanas.VentanaLogin;

public class Main {
	
	public static Timer miTimer = new Timer();
	public static int cont=0;
		

	public static void main(String[] args) {
		
		VentInicio vista =new VentInicio();
		vista.setVisible(true);
		
        TimerTask timTask =new TimerTask() {
            
			@Override
			public void run() {
				
				if(cont==5) {	
					
					VentanaLogin ventLogin=new VentanaLogin();
					ventLogin.setVisible(true);
					miTimer.cancel();
				}
				cont+=1;
				}
		};
		
	    miTimer.scheduleAtFixedRate(timTask, 0, 600);
	}

}
