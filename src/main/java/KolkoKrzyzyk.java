import java.util.Scanner;

/**
 * Created by Pawel on 15.05.2017.
 */
public class KolkoKrzyzyk {

        private static int chosePlayer(){
            System.out.println("który gracz zaczyna? 1 - X czy 2 - O?");
            String first;
            Scanner odczyt = new Scanner(System.in);
            first = odczyt.nextLine();
            int x = Integer.valueOf(first);
            return x;

        }
        private static Scanner input = new Scanner(System.in);
        private static char table[][] = {{' ', ' ', ' '},
                                            {' ', ' ', ' '},
                                            {' ', ' ', ' '}};

        private static boolean checkResult(int x){
            if ((table[0][0] == table[1][0] && table[1][0] == table[2][0] && table[2][0] != ' ') ||
                    (table[0][1] == table[1][1] && table[1][1] == table[2][1] && table[2][1] != ' ') ||
                    (table[0][2] == table[1][2] && table[1][2] == table[2][2] && table[2][2] != ' ') ||
                    (table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] != ' ') ||
                    (table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] != ' ') ||
                    (table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] != ' ') ||
                    (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] != ' ') ||
                    (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] != ' ')) {
                if (x % 2 ==0) {
                    System.out.println("Win Player X");
                } else {
                    System.out.println("Win Player O");
                }
                return true;
            }
            return false;
        }

    private static void User(int x) {

        boolean correct = false;

        if(x % 2 == 0){

            System.out.println("Podaj wspolrzedne dla O (np: a1): ");
        }
        else {

            System.out.println("Podaj wspolrzedne dla X (np: a1): ");
        }
        while (!correct) {
            String coord = input.next();
            if (coord.length() != 2) {
                System.out.println("Nieprawidlowe wspolrzedne");
            } else if (coord.charAt(0) != 'a' &&
                    coord.charAt(0) != 'b' &&
                    coord.charAt(0) != 'c') {
                System.out.println("Nieprawidlowy poczatek wspolrzednych (moze byc a, b lub c)");
            }  else if (coord.charAt(1) != '1' &&
                    coord.charAt(1) != '2' &&
                    coord.charAt(1) != '3') {
                System.out.println("Nieprawidlowy koniec wspolrzednych (moze byc 1, 2 lub 3)");
            } else {
                int a, b;
                if (coord.charAt(0) == 'a') {
                    a = 0;
                } else if (coord.charAt(0) == 'b') {
                    a = 1;
                } else {
                    a = 2;
                }
                if (coord.charAt(1) == '1') {
                    b = 0;
                } else if (coord.charAt(1) == '2') {
                    b = 1;
                } else {
                    b = 2;
                }
                if (table[a][b] != ' ') {
                    System.out.println("To pole jest już zajęte");
                } else {
                    if(x%2 ==0){

                        table[a][b] = 'O';
                        correct = true;
                    }
                    else{

                        table[a][b] = 'X';
                        correct = true;
                    }

                    System.out.println("koniec x: "+x);
                }
            }
        }
    }
        private static void printTable() {
            System.out.println();
            System.out.println();
            System.out.println("    1 2 3");
            System.out.println("a   " + table[0][0] + "|" + table[0][1] + "|" + table[0][2]);
            System.out.println("b   " + table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
            System.out.println("c   " + table[2][0] + "|" + table[2][1] + "|" + table[2][2]);

        }

        public static void main(String[] args) {
            int a = chosePlayer();
            while (!checkResult(a)) {
                printTable();
                User(a);
                a++;
            }
            printTable();
            checkResult(a);

        }
}

