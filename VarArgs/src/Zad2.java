public class Zad2 {
    public static void main(String[] args) {
        String result = removeEveryNthWord(2,"Ala","nie","ma","test","kota i","psa","papugę");
        System.out.println(result);
    }
    public static String removeEveryNthWord(int n, String... words){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i< words.length; i++){
            if((i+1) % n !=0) {
                result.append(words[i]).append(" ");
            }
        }
        return result.toString().trim();
    }
}
