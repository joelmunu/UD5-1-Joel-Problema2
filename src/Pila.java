public class Pila {
    private Object data[] = null;
    private int length = 0;

    public Pila() {
        data = new Object[2];
    }

    public int getElement(int i) {
        return (int) data[i];
    }

    public int length() {
        return length;
    }

    public void insert(int element, int i) {

        if (length == data.length) {
            Object []aux = data;
            data = new Object[data.length * 2];

            for(int j = 0; j < length; j++) {
                data[j] = aux[j];
            }

            aux = null;
        }

        for (int j = length - 1; j >= i; j--) {
            data[j + 1] = data[j];
        }

        data[i] = element;
        length++;
    }


    public int delete(int i) {
        Object aux = data[i];

        for (int j = i; j < length - 1; j++) {
            data[j] = data[j + 1];
        }

        length--;
        return (int) aux;
    }

    public void push(int element) {
        insert(element, 0);
    }

    public int pop() {
        return delete(0);
    }

}
