package NGS.NHN.practice.day13.second.ball;

import java.awt.Color;
import java.awt.Graphics;
import java.io.StringReader;

/**
 * Ball class.
 */
public class Ball {
   Point location;
   double radius;
   Color color;

    /**
     * 생성자.
     *
     * @param location 위치
     * @param radius 반지름
     * @param color 색
     */
   public Ball(Point location, double radius, Color color) {
	   this.location = location;
	   this.radius = radius;
	   this.color = color;
   }
    

    /**
     * 생성자.
     *
     * @param location 위치
     * @param radius 반지름
     */
   	public Ball(Point location, double radius) {
   		this(location, radius, Color.BLACK);
   	}
   	

    /**
     * 위치 반환.
     *
     * @return 위치
     */
   	public Point getLocation() {
   		return location;
   	}
   

    /**
     * 반지름 반환.
     *
     * @return  반지름
     */
   	public double getRadius() {
   		return radius;
   	}
  

    /**
     * 색 반환.
     *
     * @return 색
     */
   	public Color getColor() {
   		return color;
   	}
   	
    
    /**
     * 색 설정.
     *
     * @param color 색
     */
   	public void setColor(Color color) {
   		this.color = color;
   	}
 
	
    /**
     * 볼 영역 반환.
     *
     * @return 영역
     */
   	public Region getRegion() {
   		return new Region(location.getX()-radius, location.getY()-radius, 2*radius, 2*radius);
   	}
   	
    /**
     * 그리기.
     *
     * @param graphics 그래픽 컨텍스트
     */
    public void draw(Graphics graphics ) {
    	Color oldColor = graphics.getColor(); 

    	graphics.setColor(color);
    	graphics.fillOval((int) (location.getX()-radius), (int) (location.getY()-radius)
    			, (int) (2*radius), (int) (2*radius));
    	
    	graphics.setColor(oldColor);
    }
	
}
