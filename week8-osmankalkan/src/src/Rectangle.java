import java.util.Objects;

public class Rectangle extends Shape{

    int sideA = 0, sideB = 0;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Side A " + sideA +
                "Side  B " + sideB);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return sideA == rectangle.sideA && sideB == rectangle.sideB
                && Objects.equals(this.getColor(), rectangle.getColor());

    }


}
