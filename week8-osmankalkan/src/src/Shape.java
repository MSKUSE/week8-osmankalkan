public class Shape {


    private String color = "white";

    public  Shape(){


    }
    public shape(String color) {
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
/*
    public void describe(int sideA,int sideB){
        System.out.println("Side a is " + sideA
        + " Side B is " + sideB);
    }

    public void describe(int sideA){
        System.out.println("Side a is " + sideA);
    }
    public void describe(double sideA){
        System.out.println("Radius is " + sideA);
    }

 */
    public void describe(){
        System.out.println("This is a Shape and its color is" + color);
    }






}
