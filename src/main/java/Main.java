import ru.netology.stats.JavaHw6.services.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(service.minSales(arr));
        System.out.println(service.maxSales(arr));
        System.out.println(service.allSales(arr));
        System.out.println(service.midSalesPerMonth(arr));
        System.out.println(service.minSalesUnderMid(arr));
        System.out.println(service.maxSalesAboveMid(arr));


    }
}
