public class FilmTerlaris {
    public static void main(String[] args) {
        Film[] filmArray = new Film[5];
        filmArray[0] = new Film(1, "The Flash", 2023, 7.3);
        filmArray[1] = new Film(2, "Spiderman:AS-V", 2023, 9.0);
        filmArray[2] = new Film(3, "Transformer:SOB", 2023, 6.6);
        filmArray[3] = new Film(4, "Avatar : TOW", 2022, 7.6);
        filmArray[4] = new Film(5, "The Little Mermaid", 2023, 7.2);

        System.out.println("Daftar Film Terlaris:");
        for (Film film : filmArray) {
            System.out.println(film);
        }

        for (int i = 0; i < filmArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < filmArray.length; j++) {
                if (filmArray[j].getRating() < filmArray[minIndex].getRating()) {
                    minIndex = j;
                }
            }
            Film temp = filmArray[minIndex];
            filmArray[minIndex] = filmArray[i];
            filmArray[i] = temp;
        }


        System.out.println("Daftar Film Terlaris (Setelah Diurutkan):");
        for (Film film : filmArray) {
            System.out.println(film);
        }
    }
}
