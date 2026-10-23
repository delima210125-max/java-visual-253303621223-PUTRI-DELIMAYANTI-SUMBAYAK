# Character Manager — TP3 (Java Visual SIH-6406)

## Deskripsi
Character Manager adalah program Java sederhana untuk mengelola karakter berdasarkan nama, tipe, level, HP, attack, dan mana. Program ini menerapkan enum, constructor, encapsulation, getter/setter, validasi mana, dan method `isAlive()`.

## Fitur
- Menentukan tipe karakter menggunakan enum.
- Membuat karakter menggunakan dua constructor.
- Menampilkan informasi karakter melalui `toString()`.
- Menaikkan level karakter menggunakan `levelUp()`.
- Memvalidasi mana agar tidak bernilai negatif.
- Memeriksa status karakter menggunakan `isAlive()`.

## Struktur Project
```text
CharacterManager/
├── README.md
└── src/
    ├── Main.java
    └── com/
        └── unpri/
            └── charactermanager/
                └── model/
                    ├── Character.java
                    └── CharacterType.java
```

## Screenshot Output
Screenshot 2026-10-16 1334448.png

## Identitas Mahasiswa
- Nama Lengkap: [Putri Delimayanti Sumbayak]
- NIM: [253303621223]
- Mata Kuliah: Java Visual SIH-6406

## Analisis Desain
Link Google Docs: https://docs.google.com/document/d/10B8bNlRyuLRPlR7KpY26Zn9A6nTnUK37Vr02O8Cj20k/edit?usp=sharing

## TP5 — Character Manager Sprint #2

### Fitur TP5

- Menambahkan karakter dan menolak nama duplikat.
- Mencari karakter berdasarkan nama.
- Menghapus karakter dari daftar.
- Menghitung jumlah karakter dan rata-rata level.
- Mencari karakter berdasarkan tipe.
- Menguji `equals()` dan operator `==`.
- Membuktikan defensive copy melalui `getAllCharacters()`.
- Mencari karakter dengan nilai attack tertinggi menggunakan `findStrongest()`.

### Screenshot Output TP5

Screenshot output TP5 menampilkan pengujian penambahan karakter, penolakan nama duplikat, pencarian dan penghapusan karakter, rata-rata level, pencarian berdasarkan tipe, defensive copy, pengujian reference, serta fitur `findStrongest()`.

### Penjelasan Fitur Bagian C: findStrongest()

Metode `findStrongest()` dibuat untuk mencari karakter dengan nilai attack tertinggi. Metode ini membandingkan nilai attack setiap karakter dalam daftar dan mengembalikan karakter dengan nilai attack tertinggi. Jika daftar kosong, metode mengembalikan `null`.

Fitur ini membantu pengguna mengetahui karakter dengan serangan tertinggi tanpa membandingkan setiap karakter secara manual. Metode ini juga menjaga encapsulation karena daftar internal tidak diberikan langsung kepada pengguna.

### Google Docs — Analisis Reference dan Rancangan

Link Google Docs TP5: https://docs.google.com/document/d/1xtlhPikuaPmoXqg0Rlw-7Hg-x8InDUi6afTEVgOw6Z8/edit?usp=sharing

## TP8 / AP10 — Character Manager Sprint #3

### 1. Deskripsi

Character Manager Sprint #3 merupakan pengembangan aplikasi Character Manager menggunakan Java Swing. Pada tahap ini, aplikasi dikembangkan dengan menambahkan antarmuka grafis (GUI), menampilkan data karakter secara dinamis, serta menampilkan statistik rata-rata level karakter. Pengembangan ini juga menerapkan konsep Model-View-Controller (MVC) untuk memisahkan tanggung jawab pengelolaan data dan tampilan aplikasi.

### 2. Fitur AP10

- **MainWindow:** Menampilkan jendela utama aplikasi menggunakan `JFrame`.
- **Daftar Karakter Dinamis:** Menampilkan daftar karakter berdasarkan data yang diperoleh dari `CharacterManager`.
- **Statistik Rata-rata Level:** Menghitung rata-rata level karakter dan menampilkannya menggunakan `JLabel`.
- **Scrollable Interface:** Menggunakan `JScrollPane` agar daftar karakter dapat digulir apabila jumlah karakter bertambah.
- **Event Dispatch Thread (EDT):** Menggunakan `SwingUtilities.invokeLater()` untuk menjalankan antarmuka Swing dengan benar.
- **Penerapan MVC:** Memisahkan model karakter, pengelolaan data, dan tampilan antarmuka.

### 3. Struktur Project

```text
CharacterManager/
├── README.md
└── src/
    ├── Main.java
    └── com/
        └── unpri/
            └── charactermanager/
                ├── manager/
                │   └── CharacterManager.java
                ├── model/
                │   ├── Character.java
                │   └── CharacterType.java
                └── view/
                    └── MainWindow.java
```

### 4. Screenshot Output AP10

Screenshot ini menunjukkan tampilan GUI Character Manager, daftar karakter, dan statistik rata-rata level setelah aplikasi dijalankan.

### 5. Analisis MVC

Analisis MVC menjelaskan pembagian tanggung jawab antara Model, View, dan Controller pada aplikasi Character Manager, hubungan antarkomponen, serta manfaat pemisahan kode dalam pengembangan aplikasi Java Swing.

Link Google Docs Analisis MVC AP10: (https://docs.google.com/document/d/1Z-yQpaCUtLarax5MaCh1zlODWXHPozT-HgMNBguNusE/edit?usp=sharing)

### 6. Kesimpulan

Pada Sprint #3, aplikasi Character Manager dikembangkan dengan antarmuka grafis berbasis Java Swing. Data karakter ditampilkan berdasarkan isi `CharacterManager`, sedangkan rata-rata level dihitung dan ditampilkan melalui `JLabel`. Pengembangan ini menjadi latihan penerapan pemisahan tanggung jawab antarkomponen dan konsep MVC dalam aplikasi desktop Java.
