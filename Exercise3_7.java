public class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int)((5f / 9 * (fahrenheit - 32) + 0.005) * 100) / 100f;

        System.out.println(fahrenheit);
        System.out.println(celcius);
    }
}
