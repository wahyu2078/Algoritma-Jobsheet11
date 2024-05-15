public class linkedlist29 {
    node29 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            node29 currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data + "\t");
                currentNode = currentNode.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input) {
        node29 newNode = new node29(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        node29 newNode = new node29(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            node29 currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        node29 newNode = new node29(input, null);
        if (!isEmpty()) {
            node29 currentNode = head;
            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.print("Linked list kosong");
        }
    }

    public void insertBefore(int key, int newData) {
        if (head == null) {
            System.out.println("Linked list kosong");
            return;
        }

        if (head.data == key) {
            addFirst(newData);
            return;
        }

        node29 newNode = new node29(newData, null);
        node29 currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.next.data == key) {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                return;
            }
            currentNode = currentNode.next;
        }
        System.out.println("Keyword tidak ditemukan");
    }

    public void insertAt(int index, int newData) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        if (index == 0) {
            addFirst(newData);
            return;
        }

        node29 newNode = new node29(newData, null);
        node29 currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            currentNode = currentNode.next;
        }

        if (currentNode != null) {
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public int getData(int index) {
        node29 currentNode = head;
        for (int i = 0; i < index; i++) {
            if (currentNode == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return currentNode.data;
    }

    public int indexOf(int key) {
        node29 currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data == key) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.next == null) {
            head = null;
        } else {
            node29 currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
        }
    }

    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }

        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        node29 currentNode = head;
        for (int i = 0; i < index - 1; i++) {
            if (currentNode.next == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            currentNode = currentNode.next;
        }

        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            node29 currentNode = head;
            while (currentNode.next != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
}
