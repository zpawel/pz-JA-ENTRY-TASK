/**
 * Created by Pawel on 15.05.2017.
 */
public class KolkoKrzyzyk {

    private static char table[][] = {{' ', ' ', ' '},
                                    {' ', ' ', ' '},
                                    {' ', ' ', ' '}};


    private static void printTable() {
        System.out.println();
        System.out.println();
        System.out.println("    1 2 3");
        System.out.println("a   " + table[0][0]+ "|" + table[0][1]+ "|" + table[0][2]);
        System.out.println("b   " + table[1][0]+ "|" + table[1][1]+ "|" + table[1][2]);
        System.out.println("c   " + table[2][0]+ "|" + table[2][1]+ "|" + table[2][2]);

    }


    public static void main( String[] args){
    printTable();
    }
}

