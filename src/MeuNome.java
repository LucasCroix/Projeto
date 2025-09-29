public class MeuNome {
    public static void main(String[] args) {

        // a) Imprima todos os números de 100 a 200.
        System.out.println("a) Números de 100 a 200:");
        for (int i = 100; i <= 200; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // b) Imprima a soma dos números pares de 1 até 1000.
        int somaPares = 0;
        for (int i = 2; i <= 1000; i += 2) {
            somaPares += i;
        }
        System.out.println("b) Soma dos números pares de 1 até 1000: " + somaPares + "\n");

        // c) Imprima todos os múltiplos de 5, entre 1 e 100.
        System.out.println("c) Múltiplos de 5 entre 1 e 100:");
        for (int i = 5; i <= 100; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // d) Imprima os fatoriais de 1 a 6.
        System.out.println("d) Fatoriais de 1 a 6:");
        for (int i = 1; i <= 6; i++) {
            int fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println(i + "! = " + fatorial);
        }
        System.out.println();

        // e) Imprima os primeiros números da série de Fibonacci até passar de 50.
        System.out.println("e) Série de Fibonacci até passar de 50:");
        int a = 0, b = 1;
        while (a <= 50) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println("\n");

        // f) Dado x, aplique as regras até que x == 1.
        int x = 13;  // Você pode mudar esse valor para testar com outros
        System.out.println("f) Sequência para x = " + x + ":");
        while (x != 1) {
            System.out.print(x + " -> ");
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
        }
        System.out.println("1");  // imprime o último número da sequência

    }
}

