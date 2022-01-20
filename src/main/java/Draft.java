public class Draft {
    public static void main(String[] args) {
        // Толщина листа бумаги около 0,08 мм. Сколько раз его можно сложить пополам, чтобы достичь высоты Эвереста (8848,13 метра)?
        int i = 0; // количество циклов
        double total = 0.08; // начальное значение
        while (total < 8848130.00) {
            total *= 2;
            i++;
        }
        System.out.println(i);
    }
}