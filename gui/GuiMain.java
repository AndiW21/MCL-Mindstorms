package gui;

import java.util.Iterator;
import javax.swing.JOptionPane;

import localization.Core;
import localization.NXTMove;
import localization.NXTPosition;
import robotics.Particle;
import robotics.concrete.datatypes.Angle;
import robotics.concrete.datatypes.RangeReading;

public class GuiMain {
	
	public static void main() {
		GuiMain gui = new GuiMain();
		Core core = new Core(gui);
		Thread thread = new Thread(core);
		thread.start();
		try {
			gui.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void displayRangeReadings(RangeReading[] rangeReadings) {
		// TODO
	}
	
	public void displayMove(NXTMove move) {
		// TODO
	}
	
	public void displayParticles(Iterator<Particle<NXTPosition,Angle,NXTMove>> iterator) {
		// TODO
	}

	public void displayResult(NXTPosition result) {
		// TODO
		
	}
	
	public void algorithmFinished() {
		// TODO: : enable grayed-out button(s) again
	}
	public void showMessageBox(String message, String title){
		
		Thread thread = new Thread(new Runnable() {
            		@Override
            		public void run() {
                		JOptionPane.showMessageDialog(null, message, 
                			title, JOptionPane.WARNING_MESSAGE);
            		}
        	});
        	thread.start();
	}
}
