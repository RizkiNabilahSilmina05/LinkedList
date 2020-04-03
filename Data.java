public class Data {
    private String name;
    private int freq;
    private LinkedList judul = new LinkedList();

    public Data(String name) {
        this.name = name;
        this.freq = 1;
    }

    public String getName() {
        return this.name;
    }

    public int getFreq() {
        return this.freq;
    }

    public void addFreq() {
        this.freq++;
    }

    public void addJudul(String artikel){
        judul.add(artikel);
    }

    public void getJudul() {
        Node current = judul.getHead();
        int i = 1;
        while(current != null){
            System.out.println(i+". "+current.getData().getName());
            if(current.getNext() == null){
                break;
            }
            current = current.getNext();
            i++;
        }
    }
}