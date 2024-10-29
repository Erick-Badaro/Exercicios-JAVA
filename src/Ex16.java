public class Ex16 {
    public static void main(String[] args) {
        /* Crie um algoritmo que resolva a seguinte equação 𝑥
2 − 5𝑥 + 6 = 0*/
        int a = 1;
        int b = -5;
        int c = 6;
        double delta = Math.pow(b,2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta))/(2 * a);
        double x2 = (-b - Math.sqrt(delta))/(2 * a);
        System.out.println("O valor de x1 é: " +x1 + "\nO valor de x2 é: "+x2);

    }
}
