package Tugas;

class Student extends Person {
    private int nomorPelajar;
    private int nilai;
    private String jurusan;

    // Constructor Parameter
    public Student(String nama, int umur, int nomorPelajar, int nilai, String jurusan) {
        super(nama, umur);
        this.nomorPelajar = nomorPelajar;
        this.nilai = nilai;
        this.jurusan = jurusan;

    }

    public int getNomorPelajar() {
        return nomorPelajar;
    }

    public void setNomorPelajar(int nomorPelajar) {
        this.nomorPelajar = nomorPelajar;
    }

    public int getnilai() {
        return nilai;
    }

    public void setnilai(int nilai) {
        this.nilai = nilai;
    }

    public String getjurusan() {
        return jurusan;
    }

    public void setjurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override // Membuat Method Yang Sama Dengan Method Di SuperClass
    public void print() {
        super.print();
        System.out.println("Nomor Pelajar : " + nomorPelajar);
        System.out.println("Nilai : " + nilai);
        System.out.println("Jurusan : " + jurusan);
    }
}
