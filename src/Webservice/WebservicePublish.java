//package Webservice;
//import javax.xml.ws.Endpoint;
//public class WebservicePublish {
//    public static void main(String[] args) {
//        //定义一个WebService的发布地址，也是外界访问的WebService的URL地址
//        String address = "http://localhost:8282/side_server/webservice";
//        //使用Endpoint类提供的publish方法发布WebService，发布时要确保使用的端口没有被占用
//        Endpoint.publish(address,new PhoneInfoService());
//        System.out.println("发布WebService成功");
//    }
//}
