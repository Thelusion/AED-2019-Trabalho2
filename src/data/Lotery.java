package data;

import java.util.*;

public class Lotery {
	
	private int year;
	private int week;
	private ArrayList<Integer> balls = new ArrayList<Integer>();
	private ArrayList<Integer> stars = new ArrayList<Integer>();
	
	public Lotery(int year, int week) {
		
		this.setYear(year);
		this.setWeek(week);
		
	}
	
	public Lotery(String str) {
		
		String[] strKeys = str.split(" ");
		int[] intKeys = new int[strKeys.length];
		
		for(int i = 0; i < strKeys.length; i++)
			intKeys[i] = Integer.parseInt(strKeys[i]);
		
		this.setYear(intKeys[0]);
		this.setWeek(intKeys[1]);
		
		for (int i = 2; i < 7; i++)
			this.addBall(intKeys[i]);
		
		for (int i = 7; i < 9; i++)
			this.addStar(intKeys[i]);;
			
	}
	
	public void addBall(int n) {
		
		if (this.balls.size() < 5) {
			this.balls.add(n);
		}
		
	}
	
	public void addStar(int n) {
		
		if (this.stars.size() < 2) {
			this.stars.add(n);
		}
	}
	
	
	
	public final int getYear() {
		return year;
	}
	
	public final int getWeek() {
		return week;
	}
	
	public final List<Integer> getBalls() {
		return Collections.unmodifiableList(this.balls);
	}
	
	public final List<Integer> getStars() {
		return Collections.unmodifiableList(this.stars);
	}
	
	public final void setYear(int year) {
		
		if(year > 0)
			this.year = year;
		else
			throw new IllegalArgumentException();
	}
	
	public final void setWeek(int week) {
		if(week > 0)
			this.week = week;
		else
			throw new IllegalArgumentException();
	}
	
	

}
