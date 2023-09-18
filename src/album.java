import java.util.ArrayList;
import java.util.LinkedList;

public class album {
    private String name;
    private String artisti;
    private ArrayList<song> songs;

    public album(String name, String artisti, ArrayList<song> songs) {
        this.name = name;
        this.artisti = artisti;
        this.songs = new ArrayList<song>();
    }

    public album(String album, int i) {

    }

    public song findSong(String name) {
        for (song ckecked : songs) {
            if (ckecked.getName().equals(name)) {
                return ckecked;
            }
        }
        return null;
    }

    public boolean addSongs(String name, double durata) {
        if (findSong(name) == null) {
            songs.add(new song(name, durata));
            System.out.println(name + "sa adaugat la lista noastra");
            return true;
        } else {
            System.out.println("aceasta piesa" + name + "deja exista in aceasta lista");
            return false;
        }

    }

    public boolean addPlayList(int tracknumber, LinkedList<song> PlayList) {
        int index = tracknumber - 1;
        if (index > 0 && index <= this.songs.size()) {
            PlayList.add(this.songs.get(index));
            return true;
        }
        System.out.println("acest album nu are aceasta piesa cu acest numar" + tracknumber);
        return false;

    }
    public boolean addToPlayList(String name,LinkedList<song>PlayList){
        for(song ckeckedSong:this.songs){
            if(ckeckedSong.getName().equals(name)){
                PlayList.add(ckeckedSong);
                return true;
            }
        }
        System.out.println(name + "aici nu este asa piesa");
        return false;

    }
}

