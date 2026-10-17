
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;
import com.unpri.charactermanager.manager.CharacterManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Demo lama: tetap dipertahankan
        Character c1 = new Character("Aragorn", CharacterType.WARRIOR);
        Character c2 = new Character("Merlin", CharacterType.MAGE, 3);
        Character c3 = new Character("Legolas", CharacterType.ARCHER);

        System.out.println("=== DATA KARAKTER ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n=== DEMO LEVEL UP ===");
        c1.levelUp();
        System.out.println(c1);

        System.out.println("\n=== DEMO MANA DAN ISALIVE ===");
        Character c4 = new Character("Luna", CharacterType.HEALER);
        c4.setMana(50);
        System.out.println(c4);
        System.out.println("Mana: " + c4.getMana());
        System.out.println("Masih hidup: " + c4.isAlive());

        // TP5: Pengujian CharacterManager
        System.out.println("\n=== TP5: CHARACTER MANAGER ===");
        CharacterManager manager = new CharacterManager();

        System.out.println("Tambah Aragorn: " + manager.addCharacter(c1));
        System.out.println("Tambah Merlin: " + manager.addCharacter(c2));
        System.out.println("Tambah Legolas: " + manager.addCharacter(c3));
        System.out.println("Tambah Luna: " + manager.addCharacter(c4));

        Character duplicate = new Character("aragorn", CharacterType.WARRIOR);
        System.out.println("Tambah nama duplikat Aragorn: "
                + manager.addCharacter(duplicate));

        System.out.println("Cari Merlin: " + manager.findByName("Merlin"));
        System.out.println("Total karakter: " + manager.getTotalCharacters());
        System.out.println("Rata-rata level: " + manager.getAverageLevel());

        System.out.println("\n=== KARAKTER BERTIPE WARRIOR ===");
        for (Character character : manager.findByType(CharacterType.WARRIOR)) {
            System.out.println(character);
        }

        System.out.println("Jumlah WARRIOR: "
                + manager.countByType(CharacterType.WARRIOR));

        // Eksperimen: membuktikan daftar yang dikembalikan adalah snapshot
        System.out.println("\n=== EKSPERIMEN GET ALL CHARACTERS ===");
        List<Character> salinan = manager.getAllCharacters();

        System.out.println("Jumlah dalam salinan: " + salinan.size());

        manager.addCharacter(new Character("Gandalf", CharacterType.MAGE));

        System.out.println("Jumlah dalam salinan setelah manager berubah: "
                + salinan.size());
        System.out.println("Jumlah dalam manager sekarang: "
                + manager.getTotalCharacters());

        // Daftar salinan juga tidak dapat dimodifikasi langsung
        try {
            salinan.clear();
            System.out.println("Daftar berhasil diubah.");
        } catch (UnsupportedOperationException e) {
            System.out.println("Daftar salinan tidak dapat diubah langsung.");
        }

        // Pengujian hapus
        System.out.println("\n=== DEMO REMOVE ===");
        System.out.println("Hapus Merlin: " + manager.removeCharacter("Merlin"));
        System.out.println("Total setelah hapus: " + manager.getTotalCharacters());

        // Pengujian list kosong
        System.out.println("\n=== UJI RATA-RATA LIST KOSONG ===");
        CharacterManager managerKosong = new CharacterManager();
        System.out.println("Rata-rata level list kosong: "
                + managerKosong.getAverageLevel());
                  // Pengujian equals TP5
        System.out.println("\n=== UJI EQUALS TP5 ===");

        Character a = new Character(
                "Aragorn", CharacterType.WARRIOR);

        Character b = new Character(
                "aragorn", CharacterType.MAGE);

        System.out.println("Nama sama: " + a.equals(b));
        System.out.println("Objek sama (==): " + (a == b));
        
        System.out.println("\n=== FITUR FIND STRONGEST ===");

        Character strongest = manager.findStrongest();

        if (strongest != null) {
            System.out.println("Karakter terkuat: "
                    + strongest.getName());
            System.out.println("Attack tertinggi: "
                    + strongest.getAttack());
        }

    }
    
}
