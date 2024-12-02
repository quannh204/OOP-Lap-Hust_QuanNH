package hust.soict.dsai.aims.media;


import java.util.Comparator;


public class MediaComparatorByTitleCost implements Comparator<media>{


    @Override
    public int compare(media o1, media o2) {
        if(o1.getTitle().compareTo(o2.getTitle()) > 0 ) {
            return 1;
        }else if(o1.getTitle().compareTo(o2.getTitle()) < 0){
            return -1;
        }else {
            if(o1.getCost() - o2.getCost() < 0 ) {
                return 1;
            }else if(o1.getCost() - o2.getCost() > 0){
                return -1;
            }else {
                return 0;
            }
        }
    }
}
