//package abstractClassesChallenge;
//
//import animal.Parrot;
//import org.w3c.dom.Node;
//
//public class MyLinkedList implements NodeList {
//
//    private ListItem root = null;
//
//    public MyLinkedList(ListItem root) {
//        this.root = root;
//    }
//
//    @Override
//    public ListItem getRoot() {
//        return this.root;
//    }
//
//    @Override
//    public boolean addItem(ListItem newItem) {
//        if (this.root == null) {
//            // lista jest pusta, więc ten element staje sie nagłówkiem tej listy
//            this.root = newItem;
//            return true;
//        }
//
//        ListItem currentItem = this.root;
//        while (currentItem != null) {
//            int comparison = (currentItem.compareTo(newItem));
//            if (comparison < 0) {
//                // newItem jest większy, przesuń w prawo jeśli to możliwe
//                if (currentItem.next() != null) {
//                    currentItem = currentItem.next();
//                } else {
//                    // nie ma kolejnego itemu, wiec wstaw na koncu listy
//                    currentItem.setNext(newItem);
//                    newItem.setPrevious(currentItem);
//                    return true;
//                }
//            } else if (comparison > 0) {
//                // newItem jest mniejsze, wstaw wczesniej
//                if (currentItem.previous() != null) {
//                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
//                    newItem.setNext(currentItem).setPrevious(newItem);
//                } else {
//                    // węzeł z poprzednim jest zrodlem
//                    newItem.setNext(this.root).setPrevious(newItem);
//                    this.root = newItem;
//                }
//                return true;
//            } else {
//                // equal
//                System.out.println(newItem.getValue() + " is already present, not added");
//                return false;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public boolean removeItem(ListItem item) {
//        if (item != null) {
//            System.out.println("Deleting item " + item.getValue());
//        }
//        ListItem currrentItem = this.root;
//        while (currrentItem != null) {
//            int comparison = currrentItem.compareTo(item);
//            if (comparison == 0) {
//                // found the item to delate
//                if (currrentItem == this.root) {
//                    this.root = currrentItem.next();
//                } else {
//                    currrentItem.previous().setNext(currrentItem.next());
//                    if (currrentItem.next() != null) {
//                        currrentItem.next().setPrevious(currrentItem.previous());
//                    }
//                }
//                return true;
//            } else if (comparison < 0) {
//                currrentItem = currrentItem.next();
//            } else { //comarision > 0
//                // mam item wiekszy niz ten do usuniecia
//                // wiec itemu nie ma na liscie
//                return false;
//            }
//        }
//        // dotarlam do konca listy
//        // bez znaleznionego itemu usunietego
//        return false;
//    }
//
//    @Override
//    public void traverse(ListItem root) {
//        if (root == null) {
//            System.out.println("The list is empty");
//        } else {
//            while (root != null) {
//                System.out.println(root.getValue());
//                root = root.next();
//            }
//        }
//
//
//    }
//}
