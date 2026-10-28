public class Node {
    public Song song;
    public Node prev;
    public Node next;
    
    public Node(Song song) {
        this.song = song;
        this.prev = null;
        this.next = null;
    }
}