    Nama : Della Putri Herman
    No BP : 2201082024
    Kelas : TK 1A
-------------------------------------------------

    PENJELASAN CODINGAN EXCEPTION
    
Coding di atas adalah contoh penggunaan penanganan exception (kesalahan) dalam bahasa pemrograman Java. Berikut adalah penjelasan baris per baris dari coding tersebut:

1. Deklarasi kelas `Exception` sebagai kelas publik.
2. Metode `main` sebagai metode utama yang akan dieksekusi saat program dijalankan.
3. Blok `try` digunakan untuk menempatkan kode yang mungkin menghasilkan exception.
4. Di dalam blok `try`, ada perulangan `for` yang akan terus berjalan tanpa henti karena kondisinya `true`.
5. Di dalam perulangan `for`, terdapat pernyataan `System.out.println` yang mencetak nilai elemen array `args` berdasarkan indeksnya.
6. Jika terjadi `ArrayIndexOutOfBoundsException` (kesalahan saat mencoba mengakses indeks array yang tidak valid), blok `catch` akan menangkap exception tersebut.
7. Di dalam blok `catch`, akan dicetak pesan "Exception caught:" diikuti dengan informasi tentang exception yang terjadi (`e`).
8. Blok `finally` selalu dieksekusi, baik terjadi exception maupun tidak. Di sini, akan dicetak pesan "Quitting...".
9. Program akan berhenti setelah blok `finally` dieksekusi.

Dengan demikian, coding di atas mencoba untuk mencetak elemen-elemen array `args` dengan menggunakan indeks, tetapi jika indeks yang diakses tidak valid, akan ditangkap oleh `ArrayIndexOutOfBoundsException` dan pesan error akan dicetak.   

----------------------------------------------------------------------------------------------------------------------------------------------

    PENJELASAN CODINGAN HELLO WORLD

Coding di atas adalah contoh sederhana dari program "Hello, World!" dalam bahasa pemrograman Java. Berikut adalah penjelasan baris per baris dari coding tersebut:

1. Deklarasi kelas `HelloWorld` sebagai kelas publik.
2. Metode `main` sebagai metode utama yang akan dieksekusi saat program dijalankan.
3. Di dalam metode `main`, terdapat pernyataan `System.out.println` yang digunakan untuk mencetak pesan "Hello World!" ke konsol.
4. Pesan "Hello World!" akan ditampilkan sebagai output ketika program dijalankan.

Program tersebut sangat sederhana dan hanya mencetak pesan "Hello World!" ke konsol. Program semacam ini umumnya digunakan sebagai langkah awal untuk mempelajari bahasa pemrograman baru dan memastikan bahwa konfigurasi dan lingkungan pengembangan berfungsi dengan baik.    
    
 ----------------------------------------------------------------------------------------------------------------------------------------------

    PENJELASAN CODINGAN TESTEXCEPTION

Coding di atas adalah contoh penggunaan penanganan exception (kesalahan) dalam bahasa pemrograman Java. Berikut adalah penjelasan baris per baris dari coding tersebut:

1. Deklarasi kelas `TestException` sebagai kelas publik.
2. Metode `main` sebagai metode utama yang akan dieksekusi saat program dijalankan.
3. Blok `try` digunakan untuk menempatkan kode yang mungkin menghasilkan exception.
4. Di dalam blok `try`, ada perulangan `for` yang akan terus berjalan tanpa henti karena kondisinya `true`.
5. Di dalam perulangan `for`, terdapat pernyataan `System.out.println` yang mencetak nilai elemen array `args` berdasarkan indeksnya.
6. Jika terjadi `ArrayIndexOutOfBoundsException` (kesalahan saat mencoba mengakses indeks array yang tidak valid), blok `catch` akan menangkap exception tersebut.
7. Di dalam blok `catch`, parameter `i` digunakan untuk mewakili exception yang ditangkap. Pesan "Exception caught:" akan dicetak diikuti dengan informasi tentang exception yang terjadi (`i`).
8. Setelah itu, akan dicetak pesan "Quitting...".
9. Program akan berhenti setelah blok `catch` dieksekusi.

Dalam coding tersebut, terdapat sedikit perbedaan pada penamaan parameter pada blok `catch`. Biasanya, konvensi yang digunakan adalah menggunakan huruf `e` (atau `ex`) sebagai nama parameter yang mewakili exception. Namun, dalam coding tersebut, nama parameter digunakan sebagai `i`. Namun, secara fungsional, ini tidak mempengaruhi cara penanganan exception yang dilakukan.    

 
