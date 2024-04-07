package utils;



public class AllurePropertiesUtils {

    public static boolean isDeleteHistoryEnabled() {
        try {
            // Eğer "deleteHistory" değeri "true" ise, Allure raporunu silme işlemini yap
            return Boolean.parseBoolean(System.getProperty("deleteHistory", "false"));
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Hata durumunda veya "deleteHistory" değeri "true" değilse false döndür
        }
    }
}
