public class Pens_Distribution {
    public static void main(String[] args) {
        int pens=14;
        int students=3;
        int pensPerStudent=pens/students;
        int remainingPens=pens%students;
        System.out.println("Each student gets " + pensPerStudent + " pens and " + remainingPens + " pens are left undistributed");
    }
}
