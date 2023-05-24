import java.util.ArrayList;
import java.util.List;

public class Repo {
    private List<Vasarlas> vasarlasok;

    public Repo() {
        vasarlasok=new ArrayList<Vasarlas>();

        vasarlasok.add(new Vasarlas("Mindent visz KFT", "Ceruza",500,200));
        vasarlasok.add(new Vasarlas("Nekunk is kell KFT", "Töltőtoll",1500,100));
        vasarlasok.add(new Vasarlas("Vidd haza KFT", "Radirgumi",400,150));
        vasarlasok.add(new Vasarlas("Megy a munka KFT", "Toltartó",3000,40));
        vasarlasok.add(new Vasarlas("Mi is itt vagyunk KFT", "Mappa",2000,90));
        vasarlasok.add(new Vasarlas("Még én is beférek KFT", "Vonalzó",900,120));
    }
}
