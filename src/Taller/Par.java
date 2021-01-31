package Taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Par extends Thread{
	
	private static int limite;
	
	public void run()
	{
		for(int i=2;i<=limite;i+=2)
		{
			System.out.println(i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Par t1= new Par();
        System.out.print("Por favor, ingrese el límite superior: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        limite= Integer.parseInt(br.readLine());
        
        t1.start();
	}

} 