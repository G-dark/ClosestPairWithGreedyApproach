package models;

public class Vertex {

    private Data data;
    

    public Vertex() {

    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void clearAll() {
        data = null;

    }

}

class Data {

    public Data(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public int x;
    public int y;

}
