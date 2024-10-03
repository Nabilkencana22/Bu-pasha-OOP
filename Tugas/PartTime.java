package Tugas;

class PartTime extends Teacher {
    private int jamKerja;
    

    public PartTime() {
        super();
        jamKerja = 0;
        
    }

    public PartTime(int jamKerja, String mapel, String nama, int umur) {
        super(mapel, nama, umur);
        this.jamKerja = jamKerja;
        
    }

    public int setGaji() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    @Override
    public void print() {
        jamKerja = jamKerja * 4 * 20000;
        System.out.println("Gaji  : " + setGaji());
    }
}
