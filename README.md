# LatihanOOP

Nama: Rafa fadhillah Akbar 
Kelas: X-RPL
Mata Pelajaran: Algoritma dan pemograman dasar


1. Jelaskan mengapa hasilnya false.
2. hapus satu kurung kurawal penutup di class Siswa. Catat pesan error NetBeans, lalu perbaiki.

Jawaban: 
1. karena line 25 (System.out.println(siswa1 == siswa3);) ada permasalahan siswa1 berbeda objek dari siswa 2 maka
hasilnya akan menjadi False
2. Exception in thread "main" java.lang.ExceptionInInitializerError
	at latihanoop.LatihanOOP.main(LatihanOOP.java:18)
Caused by: java.lang.RuntimeException: Uncompilable code - '{' expected
	at latihanoop.Siswa.<clinit>(LatihanOOP.java:1)
	... 1 more
C:\Users\Lenovo\AppData\Local\NetBeans\Cache\25\executor-snippets\run.xml:111: The following error occurred while executing this line:
C:\Users\Lenovo\AppData\Local\NetBeans\Cache\25\executor-snippets\run.xml:68: Java returned: 1
BUILD FAILED (total time: 0 seconds)
