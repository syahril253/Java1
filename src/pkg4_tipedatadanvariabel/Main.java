package pkg4_tipedatadanvariabel;

public class Main {
    public static void main(String[] args) {
        /*
        Tipe Data:
        
        Angka
            integer        -> int    -> bilangan bulat
            floating point -> float  -> bilangan berkoma
            double         -> double -> bilangan berkoma dengan digit dibelakangnya lebih banyak
        Text
            String      -> kata / kalimat -> contoh: (saya sedang makan)    -> nilai variable pakai tanda petik dua (")
            char        -> karakter       -> (A) (B) (-) (+)                -> nilai variable pakai tanda petik satu (')
        Boolean
            boolean     -> true / false   -> kalau true (1), kalau false (0) untuk bahasa pemrograman c++
        
        Variable:
        
        */
        //tipe data nama_variable = isi_variable;       -> cara menjalankan program kalau ada nilainya
        //tipe data nama_variable;                      -> cara menjalankan program kalau tidak ada nilainya
        
        int umur = 40;
        System.out.println(umur);
        
        int usia = 18;
        System.out.println("usia = " + usia + " tahun");
        
        float berat = (float) 77.7;
        System.out.println(berat);
        
        float massa = (float) 77.7;
        System.out.println("Berat = " + massa + " kg");
        
        double panjang = 20.199999;
        System.out.println(panjang);
        
        double panjangg = 20.199999;
        System.out.println("panjanggg = " + panjang + " cm");
        
        String nama = "Muhammad Syahril";
        System.out.println(nama);
        
        String namalengkap = "Muhammad Syahril Rahmatulloh";
        System.out.println("Nama = " + namalengkap);
        
        char gender = 'L';
        System.out.println("Gender = " + gender);
        
        boolean sehat = true;
        System.out.println("Sehat = " + sehat);
        
        boolean sakit = false;
        System.out.println("Sakit = " + sakit);
        }
    
}
