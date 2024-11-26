public class Store {
	private DigitalVideoDisc[] itemsInStore;
    private int qtyInStore;

    public Store(int size) {
        itemsInStore = new DigitalVideoDisc[size];
        qtyInStore = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < itemsInStore.length) {
            itemsInStore[qtyInStore] = dvd;
            qtyInStore++;
            System.out.println("Added DVD: " + dvd.getTitle());
        } else {
            System.out.println("Store is full! Cannot add more DVDs.");
        }
    }

    public void removeDVD(String title) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].isMatch(title)) {  
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];  
                }
                itemsInStore[qtyInStore - 1] = null;  
                qtyInStore--;  
                found = true;
                System.out.println("Removed DVD with title: " + title);
                break;
            }
        }
        if (!found) {
            System.out.println("DVD with title \"" + title + "\" not found in store.");
        }
    }
}
