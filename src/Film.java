public class Film {
    private int IdFilm;
    private String NamaFilm;
    private int Tahun;
    private double Rating;

    public Film(int idFilm, String namaFilm, int tahun, double rating) {
        this.IdFilm = idFilm;
        this.NamaFilm = namaFilm;
        this.Tahun = tahun;
        this.Rating = rating;
    }

    public int getIdFilm() {
        return IdFilm;
    }

    public void setIdFilm(int idFilm) {
        this.IdFilm = idFilm;
    }

    public String getNamaFilm() {
        return NamaFilm;
    }

    public void setNamaFilm(String namaFilm) {
        this.NamaFilm = namaFilm;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int tahun) {
        this.Tahun = tahun;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        this.Rating = rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "idFilm=" + IdFilm +
                ", namaFilm='" + NamaFilm + '\'' +
                ", tahun=" + Tahun +
                ", rating=" + Rating +
                '}';
    }
}
