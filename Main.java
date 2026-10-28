public class Main {
    public static void main(String[] args) {
        String toRemove = "";
        String toFind = "";
        
        Playlist playlist = new Playlist();
        
        playlist.push(new Song("", "", 0));
        playlist.push(new Song("", "", 0));
        playlist.push(new Song("", "", 0));
        playlist.push(new Song("", "", 0));
        playlist.push(new Song("", "", 0));
        
        System.out.println("Added/Initialized:\n" + playlist.toString());
        
        playlist.remove(toRemove);
        System.out.println("Removed " + toRemove + ":\n" + playlist.toString());
        
        System.out.println("Found " + toFind + ":\n" + playlist.find(toFind).toString());
        
        playlist.reverse();
        System.out.println("Reversed:\n" + playlist.toString());
    }
}