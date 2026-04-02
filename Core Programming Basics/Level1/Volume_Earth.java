public class Volume_Earth {

    public static void main(String[] args) {
        int radius=6378;
        double pi=3.14;
        double volume=(4/3.0)*Math.pow(radius,3)*pi;
        double volumeMiles = volume / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volume+" and cubic miles is " + volumeMiles);
    }
}