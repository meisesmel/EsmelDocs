package org.example;

/**
 * Definim la classe programa amb un mètode main que crea dos objectes de la classe persona.
 * Assignem valors per als atributs nom i edat.
 */
public class programa {
    public static void main(String[] args) {
        persona e1 = new persona();
        e1.edat = 11;
        e1.nom = "Manuel Alfonseca";
        persona e2 = new persona();
        e2.edat = 25;
        e2.nom = "John Carmack";
        int edatManuel = e1.edat;
        int edatJohn = e2.edat;
        saberSiEsMajor(e1, edatManuel);
        saberSiEsMajor(e2, edatJohn);
    }

    /**
     * Tenim una funció que el programa crida per a comprovar si una persona té l'edat mínima per passar     *  Si la persona és més gran, imprimeix "pot passar, en cas contrari, imprimeix "no pot passar".
     *
     * @param e1         fa referència a la persona
     * @param edatManuel <18     * @return "no pot passar"
     * @param edatManuel >18     * @return "pot passar"
     */
    private static void saberSiEsMajor(persona e1, int edatManuel) {
        if (!(edatManuel < 18)) {
            System.out.println(e1.nom + " pot passar");
        } else {
            if (!(edatManuel >= 18)) {
                System.out.println(e1.nom + " no " + " pot passar");
            }
        }
    }
}