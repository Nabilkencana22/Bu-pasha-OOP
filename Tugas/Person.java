package Tugas;
class Person {
    private String nama;
    private  int umur;

    public Person(){
        nama = "";
        umur = 0;
    }

    //Constructor Parameter 
    public Person (String nama , int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getumur() {
        return umur;
    }

    public void setumur(int umur) {
        this.umur = umur;
    }

    public void print() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
    }

}
