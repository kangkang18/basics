//package Webservice;
//
//import net.webservicex.PhoneInfo;
//import net.webservicex.PhoneInfoSoap;
//import net.webservicex.Weather;
//import net.webservicex.WeatherSoap;
//
//public class WebServiceClient {
//    public static void main(String[] args) {
//        // 电话号码归属地查询
//        System.out.println("Phone Number Location:");
//        String phoneNumber = "13800138000"; // 替换为你要查询的电话号码
//        queryPhoneNumberLocation(phoneNumber);
//
//        // 城市天气预报查询
//        System.out.println("\nCity Weather:");
//        String city = "Beijing"; // 替换为你要查询的城市
//        queryCityWeather(city);
//    }
//
//    private static void queryPhoneNumberLocation(String phoneNumber) {
//        PhoneInfo phoneInfoService = new PhoneInfo();
//        PhoneInfoSoap phoneInfo = phoneInfoService.getPhoneInfoSoap();
//        String result = phoneInfo.getMobileCodeInfo(phoneNumber, null);
//        System.out.println("Phone Number: " + phoneNumber);
//        System.out.println("Location: " + result);
//    }
//
//    private static void queryCityWeather(String city) {
//        Weather weatherService = new Weather();
//        WeatherSoap weather = weatherService.getWeatherSoap();
//        String result = weather.getWeather(city, null);
//        System.out.println("City: " + city);
//        System.out.println("Weather: " + result);
//    }
//}
