public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
    }
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo){
        numOne *= 1000;
        numTwo *= 1000;
        if((int)numOne - (int)numTwo == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
