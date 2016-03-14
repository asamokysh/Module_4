package HW_4_3;

public class Run_4_3 {
    public  static void main (String[] args) {
        double x1 = 3.4;
        double y1 = 6.4;
        double x2 = 4;
        double y2 = 11.1;

        double distanceX = Math.pow((x2 - x1), 2);
        double distanceY = Math.pow((y2 - y1), 2);

        double distance = Math.sqrt(distanceX + distanceY);


    System.out.println(distance);
}

}
