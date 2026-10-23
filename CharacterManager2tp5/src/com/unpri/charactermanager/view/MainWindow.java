
package com.unpri.charactermanager.view;

import com.unpri.charactermanager.manager.CharacterManager;
import com.unpri.charactermanager.model.Character;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow(CharacterManager characterManager) {
        setTitle("Character Manager");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("Daftar Karakter");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(titleLabel);
        mainPanel.add(Box.createVerticalStrut(15));

        // Menampilkan karakter secara dinamis menggunakan loop
        for (Character character : characterManager.getAllCharacters()) {
            JLabel characterLabel = new JLabel(character.toString());
            characterLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            mainPanel.add(characterLabel);
            mainPanel.add(Box.createVerticalStrut(8));
        }

        // Menampilkan statistik rata-rata level
        double averageLevel = characterManager.getAverageLevel();

        JLabel averageLabel = new JLabel(
                String.format("Rata-rata Level: %.2f", averageLevel)
        );
        averageLabel.setFont(new Font("Arial", Font.BOLD, 14));
        averageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        mainPanel.add(Box.createVerticalStrut(15));
        mainPanel.add(averageLabel);

        add(new JScrollPane(mainPanel));
    }
}

