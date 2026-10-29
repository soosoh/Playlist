public class Playlist {
    public Node head;
    public Node tail;
    
    public Playlist() {
        head = null;
        tail = null;
    }
    
    public Node find(String title) {
        Node search = head;
        while(search != null) {
            if(search.song.title.equals(title)) {
                return search;
            }
            search = search.next;
        }
        return null;
    }
    
    public void push(Song song) {
        if(head == null) {
            head = new Node(song);
            tail = head;
        }
        else {
            tail.next = new Node(song);
            tail.next.prev = tail;
            tail = tail.next;
        }
    }
    public void remove(String title) {
        Node found = find(title);
        if(found != null) {
            if(found != head) found.prev.next = found.next;
            if(found != tail) found.next.prev = found.prev;
        }
    }
    
    public void reverse() {
        Node node = tail;
        head = node;
        while(node.next != null) {
            Node prev = node.prev;
            Node next = node.next;
            if(prev != null) node.next = prev;
            node.prev = next;
            node = node.next;
        }
        Node next = node.next;
        node.prev = next;
        tail = node;
    }
    public void shuffle() {
    
    }
    public void sortByTitle() {
    
    }
    public void sortByDuration() {
    
    }
    
    public String toString() {
        String display = "";
        Node node = head;
        while(node != null) {
            display = display + "----\nTitle: " + node.song.title;
            display = display + "\nArtist: " + node.song.artist;
            display = display + "\nDuration: " + node.song.duration;
            display = display + "\n";
            node = node.next;
        }
        display = display + "----";
        return display;
    }
}