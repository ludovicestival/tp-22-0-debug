public class Main {
    public static void main(String[] args) {
        // Problème 1 : i <= numbers.length
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }

        // Problème 2 : division par zéro
        try {
            double result = calculateValue(5, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro");

        }

        // Problème 3 : boucle infinie
        int count = 0;
        while (count < 10) {
            System.out.println("Count: " + count);
            count += 2;
        }

        // Problème 4 : indice pour charAt en dehors de la taille de la chaîne de charactères
        String message = "Bonjour";
        System.out.println("Longueur du message : " + message.length());
        char character = message.charAt(1);
        System.out.println("Caractère à l'indice 1 : " + character);

        // Problème 5 : mauvaise comparaison, double égal au lieu d'utiliser equals()
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println("Comparaison de chaînes : " + (str1.equals(str2)));

        // Problème 6 : l'objet est null et ne pouvait pas appeller sa méthode method()
        Main mainObj = new Main();
        mainObj.method();
    }

    // Méthode pour le problème de division par zéro
    public static int calculateValue(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return a / b;
    }

    // Méthode pour le problème d'utilisation incorrecte d'une méthode de classe
    public void method() {
        System.out.println("Méthode appelée !");
    }
}
