package data;

import java.util.*;

public class Lotery {
	
	private int year;
	private int week;
	private ArrayList<Integer> balls;
	private ArrayList<Integer> stars;
	
	public Lotery(int year, int week) {
		
		this.setYear(year);
		this.setWeek(week);
		this.balls = new ArrayList<Integer>();
		this.stars = new ArrayList<Integer>();
		
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
	
	public final List<Integer> getBall(int i) {
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
