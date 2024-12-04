import java.util.Scanner;

// Song Node Class - Represents a song in the playlist
class Song {
    String title;  // The title of the song
    Song next;     // Pointer to the next song in the playlist
    Song prev;     // Pointer to the previous song in the playlist

    // Constructor to create a new song node with the given title
    public Song(String title) {
        this.title = title;
    }
}

// Playlist Manager Class - Manages the playlist and its operations
public class finalC4 {
    private Song current;  

    // Method to add a song to the playlist
    public void addSong(String title) {
        Song newSong = new Song(title);  
        
        if (current == null) {  
            current = newSong;  
            current.next = current;  
            current.prev = current; 
        } else {  // If the playlist already has songs
            Song last = current.prev;  
            last.next = newSong;  
            newSong.prev = last; 
            newSong.next = current; 
            current.prev = newSong; 
        }

        // Notify the user that the song has been added
        System.out.println("Song \"" + title + "\" added to the playlist.");
    }

    // Method to remove a song from the playlist
    public void removeSong(String title) {
        if (current == null) { 
            System.out.println("The playlist is empty. No song to remove.");
            return; 
        }

        Song temp = current;  // Start from the current song
        boolean found = false;  // Flag to check if the song is found

        // Traverse the playlist to find the song with the given title
        do {
            if (temp.title.equalsIgnoreCase(title)) {  // If the song matches
                found = true;
                break; 
            }
            temp = temp.next;
        } while (temp != current);

        // If the song was not found, notify the user
        if (!found) {
            System.out.println("Song \"" + title + "\" not found in the playlist.");
            return;
        }

        // If the song is the only one in the playlist
        if (temp.next == temp) {
            current = null;
        } else {  // If there are other songs in the playlist
            temp.prev.next = temp.next;  
            temp.next.prev = temp.prev; 

            // If the song to be removed is the current song, update the current pointer
            if (temp == current) {
                current = temp.next; 
            }
        }

        // Notify the user that the song has been removed
        System.out.println("Song \"" + title + "\" removed from the playlist.");
    }

    // Method to move to the next song in the playlist
    public void nextSong() {
        if (current == null) {  
            System.out.println("The playlist is empty.");
            return; 
        }

        current = current.next; 
        displayCurrentSong(); 
    }

    // Method to move to the previous song in the playlist
    public void previousSong() {
        if (current == null) {  // If the playlist is empty
            System.out.println("The playlist is empty.");
            return;  
        }

        current = current.prev;
        displayCurrentSong();
    }

    // Method to display the current song being played
    public void displayCurrentSong() {
        if (current == null) { 
            System.out.println("The playlist is empty.");
        } else {  // If there is a current song
            System.out.println("Now playing: \"" + current.title + "\""); 
        }
    }

    // Method to display all songs in the playlist
    public void displayPlaylist() {
        if (current == null) { 
            System.out.println("The playlist is empty.");
            return;
        }

        System.out.println("Playlist:"); 
        Song temp = current; 
        do { // Traverse the playlist and print the titles of all songs
            System.out.println("- " + temp.title);  
            temp = temp.next; 
        } while (temp != current); 
    }

    public static void main(String[] args) {
        finalC4 playlist = new finalC4();
        Scanner scanner = new Scanner(System.in);

        // Infinite loop to keep the program running until the user chooses to exit
        while (true) {
            // Display menu options to the user
            System.out.println("\n--- Music Playlist Manager ---");
            System.out.println("1. Add a Song");
            System.out.println("2. Remove a Song");
            System.out.println("3. Next Song");
            System.out.println("4. Previous Song");
            System.out.println("5. Display Current Song");
            System.out.println("6. Display Playlist");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            // Switch statement to handle different menu choices
            switch (choice) {
                case 1: 
                    System.out.print("Enter the song title to add: ");
                    String titleToAdd = scanner.nextLine();  
                    playlist.addSong(titleToAdd);  
                    break;
                case 2: 
                    System.out.print("Enter the song title to remove: ");
                    String titleToRemove = scanner.nextLine();  
                    playlist.removeSong(titleToRemove); 
                    break;
                case 3:
                    playlist.nextSong(); 
                    break;
                case 4: 
                    playlist.previousSong(); 
                    break;
                case 5: 
                    playlist.displayCurrentSong(); 
                    break;
                case 6:
                    playlist.displayPlaylist(); 
                    break;
                case 7:
                    System.out.println("Exiting Playlist Manager. Goodbye!");  
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
