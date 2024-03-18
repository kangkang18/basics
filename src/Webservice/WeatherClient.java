//package Webservice;
//
//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;
//import java.net.URL;
//
//public class WeatherClient {
//    public static void main(String[] args) {
//        try {
//            // 创建服务的URL
//            URL url = new URL("http://ws.webxml.com.cn/WebServices/WeatherWS.asmx?wsdl");
//
//            // 指定命名空间和服务名称
//            QName qname = new QName("http://WebXml.com.cn/", "WeatherWS");
//
//            // 创建服务
//            Service service = Service.create(url, qname);
//
//            // 获取服务的端口
//            WeatherWSSoap weatherService = service.getPort(WeatherWSSoap.class);
//
//            // 调用电话号码归属地查询接口
//            String phoneNumber = "your_phone_number";
//            String result = weatherService.getMobileCodeInfo(phoneNumber, "");
//
//            System.out.println("电话号码归属地查询结果：");
//            System.out.println(result);
//
//            // 调用城市天气预报查询接口
//            String cityName = "your_city_name";
//            String weather = weatherService.getWeather(cityName, "");
//
//            System.out.println("城市天气预报查询结果：");
//            System.out.println(weather);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}




