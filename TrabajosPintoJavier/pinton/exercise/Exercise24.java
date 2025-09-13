package exercise;

public class Exercise24 {
    public static void main(String[] args) {
        
        int serie = 1;

        while (serie < 1000) {
            System.out.println(serie);
            serie = (serie * serie) + 1; 
        }

    }
}
