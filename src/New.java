public class New {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int x;

        x = a > b ? b : a;
        // то же самое
        if (a > b) {
            x = b;
        } else {
            x = a;
        }
        // condition ? expression_when_true : expression_when_false
    }
}
