import java.util.Scanner;

public class BollywoodWrapped {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Core Data: 5 tracks on heavy rotation this year
        String[] tracks = {
            "Tum Hi Ho (Aashiqui 2)", 
            "Kesariya (Brahmastra)", 
            "Chaiyya Chaiyya (Dil Se)", 
            "Tum Hi Ho (Aashiqui 2)", 
            "Zingaat (Sairat)"
        };
        
        String[] artists = {"Arijit Singh", "Arijit Singh", "A.R. Rahman", "Arijit Singh", "Ajay-Atul"};
        int[] playCounts = {145, 92, 88, 210, 175}; // Total streams per entry
        int[] trackLengths = {4, 4, 6, 4, 4};        // Song duration in minutes

        System.out.println("🎵 🇮🇳 BOLLYWOOD SPOTIFY WRAPPED - 2026 REWIND");
        System.out.println("Processing your ultimate desi playback history...\n");

        int totalMinutesListened = 0;
        int topTrackIndex = 0;

        // Single-pass processing loop to crunch aggregate metrics
        for (int i = 0; i < tracks.length; i++) {
            // Formula: Total Minutes = Sum of (Play Count * Song Duration)
            totalMinutesListened += (playCounts[i] * trackLengths[i]);

            // Linear search logic to isolate the song with the highest play count
            if (playCounts[i] > playCounts[topTrackIndex]) {
                topTrackIndex = i;
            }
        }

        // Displaying the dynamic, creative analytical summary card
        System.out.println("====================================================");
        System.out.println("       🎉 YOUR 2026 BOLLYWOOD MUSIC INSIGHTS 🎉     ");
        System.out.println("====================================================");
        System.out.printf("🎧 Total Time Logged: %,d minutes of pure melodies!\n", totalMinutesListened);
        System.out.println("🔥 Your #1 Anthem: \"" + tracks[topTrackIndex] + "\"");
        System.out.println("🎤 Top Artist Domination: " + artists[topTrackIndex]);
        
        // Creative conditional badge based on listening thresholds
        System.out.print("\n🎭 Your Vibe Check Status: ");
        if (totalMinutesListened > 2000) {
            System.out.println("Certified Bollywood Drama King/Queen 👑");
        } else {
            System.out.println("Casual Melodic Listener 📻");
        }
        System.out.println("====================================================");

        in.close();
    }
}

    