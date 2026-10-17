
package com.unpri.charactermanager.model;

import java.util.Locale;

public class Character {
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int attack;
    private int mana;

    // Constructor pertama
    public Character(String name, CharacterType type) {
        this.name = name;
        this.type = type;
        setLevel(1);
        this.mana = 0;
    }

    // Constructor kedua
    public Character(String name, CharacterType type, int level) {
        this.name = name;
        this.type = type;
        setLevel(level);
        this.mana = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException(
                "Level minimal adalah 1"
            );
        }

        this.level = level;
        this.hitPoints = 100 + (level * 10);
        this.attack = 10 + (level * 5);
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getAttack() {
        return attack;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException(
                "Mana tidak boleh negatif"
            );
        }

        this.mana = mana;
    }

    public boolean isAlive() {
        return hitPoints > 0;
    }

    public void levelUp() {
        setLevel(level + 1);
    }

    // Membandingkan dua karakter berdasarkan nama
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Character)) {
            return false;
        }

        Character other = (Character) obj;

        if (name == null) {
            return other.name == null;
        }

        return other.name != null
            && name.equalsIgnoreCase(other.name);
    }

    // Hash code harus konsisten dengan equals()
    @Override
    public int hashCode() {
        return name == null
            ? 0
            : name.toLowerCase(Locale.ROOT).hashCode();
    }

    @Override
    public String toString() {
        return "Character{" +
            "name='" + name + '\'' +
            ", type=" + type +
            ", level=" + level +
            ", hitPoints=" + hitPoints +
            ", attack=" + attack +
            ", mana=" + mana +
            '}';
    }
}
