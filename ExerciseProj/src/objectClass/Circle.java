package objectClass;

public class Circle {
	public final static float PI = 3.14f;
	private float radius;
	public Circle(float radius) {
		this.radius = radius;
	}
	public Circle() {
		
	}
	public float calArea() {
		return Circle.PI*this.radius*this.radius;
	}
	public float getRadius() {
		return this.radius;
	}
	@Override
	public boolean equals(Object o) {
		Circle circle = (Circle)o;
		System.out.println(this.radius);
		System.out.println(circle.getRadius());
		if(this.radius == circle.getRadius()) {
			//System.out.println("Yes");
			return true;
		}return false;
	}
	@Override
	public int hashCode() {
		return 1;
	}
	@Override
	public String toString() {
		return String.valueOf(this.radius)+String.valueOf(this.calArea());
		
	}

}
