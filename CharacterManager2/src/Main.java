
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {
        Character c1 = new Character(
            "Aragorn", CharacterType.WARRIOR
        );

        Character c2 = new Character(
            "Merlin", CharacterType.MAGE, 3
        );

        Character c3 = new Character(
            "Legolas", CharacterType.ARCHER
        );

        System.out.println("=== DATA KARAKTER ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n=== DEMO LEVEL UP ===");
        c1.levelUp();
        System.out.println(c1);

        System.out.println("\n=== DEMO MANA DAN ISALIVE ===");
        Character c4 = new Character(
            "Luna", CharacterType.HEALER
        );

        c4.setMana(50);

        System.out.println(c4);
        System.out.println("Mana: " + c4.getMana());
        System.out.println("Masih hidup: " + c4.isAlive());
    }
}

