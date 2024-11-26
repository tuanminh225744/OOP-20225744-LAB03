package hust.soict.dsai.test.store.StoreTest;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store.Store;

public class StoreTest {
    public static void main(String[] args) {
        
        Store store = new Store(5);

        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle", "Adventure", "John Doe", 120, 20.5f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Animation", "Jane Smith", 90, 15.0f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Titanic", "Drama", "James Cameron", 195, 25.0f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 88, 18.0f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Matrix", "Sci-Fi", "Wachowski Brothers", 136, 30.0f);
        

        
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);
        store.addDVD(dvd4);
        store.addDVD(dvd5);
       
        
        store.removeDVD("Jungle"); 
        
    }
}