import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
public class JavaGraphics2 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
		
		
		static int size;
		static String chosencolor;
		
    	public static void main(String[] args) 
    		{	
//    		Scanner userSize= new Scanner(System.in);
//    		System.out.println("Enter a size for a square. ");
//    		size = userSize.nextInt();
//    		Scanner userColor= new Scanner(System.in);
//    		System.out.println("Would you like it to be blue or red?");
//    		chosencolor = userColor.nextLine();
    			
	        JavaGraphics2 canvas = new JavaGraphics2();
	        JFrame frame = new JFrame();
	        frame.setSize(500, 400);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
    
    	public void paint(Graphics graphics) 
    		{
    			
    			
//    			if (chosencolor.equals("red"))
//    				{
//    					graphics.setColor(Color.red);
//    				}
//    			if (chosencolor.equals("blue"))
//    				{
//    					graphics.setColor(Color.blue);
//    				}
//    			graphics.fillRect(10,10,size,size); 
//    			
    		
//    	//change color
//	        for (int red = 0; red < 255; red++)
//	        	{
//	        	for(int green = 0; green<255; green++)
//	        		{
//	        		for(int blue =0; blue<255; blue++)
//	        			{
//	        				for(int i = 0; i < 350; i++)
//	        					{
//			        				graphics.setColor(new Color (red,green,blue));
//			        				graphics.fillRect(i, i, 50, 50);
//	        				
//			        				delay();
//			        			        
//			        			    graphics.setColor(Color.white);
//			        			    graphics.fillRect(i, i, 50, 50);
//	        					}
//				        }
//	        		}
//	        	}
    		
    		

		//checker board
    	for(int row = 0; row < 255; row+=100 )	
    		{
    			graphics.setColor(new Color(255,160,122));
    			graphics.fillRect(row, 0, 50, 50);	
    		}
    	
    	for(int row = 0; row < 255; row+=100 )	
    		{
    			graphics.setColor(new Color(255,160,122));
    			graphics.fillRect(50+row, 50, 50, 50);	
    		}
    	for(int row = 0; row < 255; row+=100 )	
    		{
    			graphics.setColor(new Color(255,160,122));
    			graphics.fillRect(row, 100, 50, 50);	
    		}
    	
    	
    	}
    	
    	
    	
		public void delay()
			{
	        try
					{
					Thread.sleep(30);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
    			}
    	}
	
