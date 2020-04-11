package abstractClassesChallenge;

import org.w3c.dom.Node;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currrentItem = this.root;
        while (currrentItem != null) {
            int comparison = currrentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currrentItem.next() != null) {
                currrentItem = currrentItem.next();
                } else {
                    currrentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                        if (currrentItem.previous() != null){
                            currrentItem = currrentItem.previous();
                        } else {
                            currrentItem.setPrevious(newItem);
                            return true;
                        }
            } else {
                System.out.println(newItem.getValue() + " is already present ");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        // rekurencja
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }

    }
}
