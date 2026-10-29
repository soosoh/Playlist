//Hangyul, Nithilan

public class Main {
    public static void main(String[] args) {
        String toRemove = "";
        String toFind = "Kill Bill";
        
        Playlist playlist = new Playlist();
        System.out.println();
        playlist.push(new Song("Choosin' Texas", "Ella Langley", 232));
        playlist.push(new Song("Kill Bill", "SZA", 153));
        playlist.push(new Song("Stateside", "PinkPantheress", 184));
        playlist.push(new Song("Dracula", "Tame Impala", 209));
        playlist.push(new Song("So Easy(To Fall In Love)", "Olivia Dean", 169));
        System.out.println();
        System.out.println("Added/Initialized:\n" + playlist.toString());
        System.out.println();
        playlist.remove(toRemove);
        System.out.println("Removed " + toRemove + ":\n" + playlist.toString());
        System.out.println();
        System.out.println("Found " + toFind + ":\n" + playlist.find(toFind).song.toString());
        System.out.println();
        playlist.reverse();
        System.out.println("Reversed:\n" + playlist.toString());
        playlist.shuffle();
        System.out.println("Shuffled:\n" + playlist.toString());
        playlist.sortByTitle();
        System.out.println("Sorted By Title:\n" + playlist.toString());
        playlist.sortByDuration();
        System.out.println("Sorted By Duration:\n" + playlist.toString());
    }
}