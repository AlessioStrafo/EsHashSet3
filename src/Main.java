//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> animaliSet = animali();
        String animale = "Orso";
        for (int i = 0; i < animali().size(); i++) {
            if (animaliSet.contains(animale)) {
                animaliSet.remove(animale);
            }
            System.out.println(animaliSet);
        }
    }
    public static HashSet<String> animali() {
        HashSet<String> animali = new HashSet<>();
        animali.add("Leone");
        animali.add("Tigre");
        animali.add("Orso");
        return animali;
    }
}