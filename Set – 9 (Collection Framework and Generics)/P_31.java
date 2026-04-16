import java.util.LinkedList;
import java.util.Scanner;

public class P_31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<String>();

        System.out.print("Enter number of songs: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Add songs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter song name: ");
            playlist.add(sc.nextLine());
        }

        // Display playlist
        System.out.println("\nFull Playlist: " + playlist);

        // Play first song
        if (!playlist.isEmpty()) {
            String firstSong = playlist.removeFirst();
            System.out.println("Playing First Song: " + firstSong);
            System.out.println("Playlist After Playing First Song: " + playlist);
        }

        // Skip last song
        if (!playlist.isEmpty()) {
            String lastSong = playlist.removeLast();
            System.out.println("Skipped Last Song: " + lastSong);
            System.out.println("Playlist After Skipping Last Song: " + playlist);
        }

        sc.close();
    }
}
