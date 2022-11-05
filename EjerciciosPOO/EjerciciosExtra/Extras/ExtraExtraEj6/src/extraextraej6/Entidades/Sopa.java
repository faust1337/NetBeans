package extraextraej6.Entidades;

import java.util.*;

public class Sopa {
    private char[][] sopa;
    //Builders
    public Sopa() {
        sopa = llenarSopaDefault();
    }

    
    public Sopa(char[][] sopa) {
        this.sopa = sopa;
    }
    //Setters & getters

    public char[][] getSopa() {
        return sopa;
    }
    public void setSopa(char[][] sopa) {
        this.sopa = sopa;
    }
    public static char[][] llenarSopaDefault() {
        String[] palabrasDefault = new String[]{"AAAAA", "BBBBB", "CCCCC", "DDDDD", "EEEEE", "FFFFF", "GGGGG", "HHHHH", "IIIII", "JJJJJ"};
        char[][] sopa = new char[10][10];
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                if (k < palabrasDefault[j].length()) {
                    sopa[j][k] = palabrasDefault[j].charAt(k);
                }else sopa[j][k] = ' ';
            }
        }
        return sopa;
    }
}
