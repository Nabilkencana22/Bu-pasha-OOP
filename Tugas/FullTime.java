package Tugas;

 class FullTime extends Teacher {
    private int gajiTahunan;
    private String unit;

    public FullTime (){
        super();
        gajiTahunan = 0;
        unit = "";

    }

    public FullTime(int gajiTahunan , String unit , String mapel, String nama , int umur ){
        super(mapel ,nama , umur);
        this.gajiTahunan = gajiTahunan;
        this.unit = unit;
    }

    public int getGajiTahunan() {
        return gajiTahunan;
    }

    public void setGajiTahunan(int gajiTahunan) {
        this.gajiTahunan = gajiTahunan;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public void print(){
        System.out.println("Gaji Tahunan :" + gajiTahunan);
        System.out.println("Unit : " + unit);
    }

}
