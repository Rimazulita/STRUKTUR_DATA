package String;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MenghitungSimilaritas {
    
    public static void main(String[] args) {
        // Contoh dua teks yang akan dibandingkan
        String teks1 = "Ini adalah buah";
        String teks2 = "Ini adalah sayur";
        
        // Menghitung similaritas antara dua teks
        double similarity = calculateCosineSimilarity(teks1, teks2);
        
        // Menampilkan hasil similaritas
        System.out.println("Similaritas: " + similarity);
    }
    
    // Metode untuk menghitung similaritas menggunakan cosine similarity
    public static double calculateCosineSimilarity(String teks1, String teks2) {
        // Mendapatkan vektor kata untuk masing-masing teks
        Map<String, Integer> vektor1 = getWordVector(teks1);
        Map<String, Integer> vektor2 = getWordVector(teks2);
        
        // Menghitung intersection antara kedua vektor
        Set<String> intersection = new HashSet<>(vektor1.keySet());
        intersection.retainAll(vektor2.keySet());
        
        // Menghitung dot product antara kedua vektor
        double dotProduct = 0;
        for (String kata : intersection) {
            dotProduct += vektor1.get(kata) * vektor2.get(kata);
        }
        
        // Menghitung magnitudo vektor masing-masing teks
        double magnitudo1 = calculateMagnitude(vektor1);
        double magnitudo2 = calculateMagnitude(vektor2);
        
        // Menghitung similaritas menggunakan formula cosine similarity
        if (magnitudo1 == 0 || magnitudo2 == 0) {
            return 0; // Jika salah satu vektor memiliki magnitudo nol, similaritas akan nol
        } else {
            return dotProduct / (magnitudo1 * magnitudo2);
        }
    }
    
    // Metode untuk menghitung vektor kata dari teks
    public static Map<String, Integer> getWordVector(String teks) {
        Map<String, Integer> vektorKata = new HashMap<>();
        String[] kataKunci = teks.split("\\s+"); // Memisahkan teks menjadi kata-kata
        
        // Menghitung frekuensi masing-masing kata
        for (String kata : kataKunci) {
            vektorKata.put(kata, vektorKata.getOrDefault(kata, 0) + 1);
        }
        
        return vektorKata;
    }
    
    // Metode untuk menghitung magnitudo vektor
    public static double calculateMagnitude(Map<String, Integer> vektor) {
        double magnitudo = 0;
        for (int nilai : vektor.values()) {
            magnitudo += Math.pow(nilai, 2);
        }
        return Math.sqrt(magnitudo);
    }
}