public class Damas {
    public static void main(String[] args) {
        int N = 8;
        char[][] tablero = new char[N][N];
        inicializarTablero(tablero);
        if (resolver8Damas(tablero, 0)) {
            imprimirTableroConBordes(tablero);
        } else {
            System.out.println("No hay solución");
        }
    }

    static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    static boolean esSeguro(char[][] tablero, int fila, int columna) {
        // Verificar la fila a la izquierda
        for (int i = 0; i < columna; i++) {
            if (tablero[fila][i] == 'Q') {
                return false;
            }
        }

        // Verificar la diagonal superior a la izquierda
        for (int i = fila, j = columna; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 'Q') {
                return false;
            }
        }

        // Verificar la diagonal inferior a la izquierda
        for (int i = fila, j = columna; i < tablero.length && j >= 0; i++, j--) {
            if (tablero[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static boolean resolver8Damas(char[][] tablero, int columna) {
        if (columna >= tablero.length) {
            return true;
        }

        for (int i = 0; i < tablero.length; i++) {
            if (esSeguro(tablero, i, columna)) {
                tablero[i][columna] = 'Q';

                if (resolver8Damas(tablero, columna + 1)) {
                    return true;
                }

                tablero[i][columna] = '-';
            }
        }

        return false;
    }

    static void imprimirTableroConBordes(char[][] tablero) {
        int N = tablero.length;

        System.out.println();
        // Imprimir la fila superior de bordes
        for (int i = 0; i < N + 2; i++) {
            System.out.print("X ");
        }
        System.out.println();

        // Imprimir el tablero con bordes laterales
        for (int i = 0; i < N; i++) {
            System.out.print("X "); // Borde izquierdo
            for (int j = 0; j < N; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.print("X"); // Borde derecho
            System.out.println();
        }

        // Imprimir la fila inferior de bordes
        for (int i = 0; i < N + 2; i++) {
            System.out.print("X ");
        }
        System.out.println();
        System.out.println();
    }
}