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
