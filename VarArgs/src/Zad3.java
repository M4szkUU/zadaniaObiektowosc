public class Zad3 {
    public static void main(String[] args) {
        int[] array1={1,2,3};
        int[] array2={4,5,6};
        int[] array3={7,8,9};

        int suma = sumaArrays(array1,array2,array3);
        System.out.println("Suma liczby wszytkich lizcb: "+suma);
    }
    public static int sumaArrays(int[]... arrays){
        int sum = 0;

        for (int[] array : arrays) {
            for (int number : array){
                sum+=number;
            }
        }
        return sum;
    }
}
