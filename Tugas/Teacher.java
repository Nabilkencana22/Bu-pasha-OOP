package Tugas;

 class Teacher extends Person {
    private String mapel;

    public Teacher(){
        super();
        mapel = "";
    }

    public Teacher(String mapel , String nama , int umur){
        super(nama,umur);
        this.mapel = mapel;
    }

    public String getMapel() {
        return mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }
    
    @Override
    public  void print(){
        super.print();
        System.out.println("Mapel : " + mapel);
    }

}
