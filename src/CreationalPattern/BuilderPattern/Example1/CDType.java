package CreationalPattern.BuilderPattern.Example1;

import java.util.ArrayList;
import java.util.List;

public class CDType {
    private List<Packing> items = new ArrayList<Packing>();
    public void addItem(Packing packs){
        items.add(packs);
    }

    public void getCost(){
        for(Packing packs: items){
            packs.price();
        }
    }
    public void showItemss(){
        for(Packing packing: items){
            System.out.println("CD name: "+packing.pack());
            System.out.println("Price: "+ packing.price());
        }
    }
}
