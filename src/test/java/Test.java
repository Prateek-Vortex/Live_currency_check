import java.io.IOException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Test {
    public static void main(String arg[])throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("List Of currency to choose from.");
        System.out.println("SGD"+" MYR"+" EUR"+" USD"+" AUD"+" JPY"+" CNH"+" HKD"+" CAD"+" INR"+" DKK"+" GBP"+" RUB"+" NZD"+" MXN"+" IDR"+" TWD"+" THB"+" VND");
        System.out.print("Enter the from currency.");
        String from= scanner.next();
        System.out.println("Enter the to currency.");
        String too=scanner.next();
//        System.out.println("Enter the number.");
//        String num=scanner.next();

        try {
            HttpResponse<String> response = Unirest.get("https://currency-exchange.p.rapidapi.com/exchange?q=1.0&from="+from+"&to="+too+"")
                    .header("x-rapidapi-host", "currency-exchange.p.rapidapi.com")
                    .header("x-rapidapi-key", "e021e43216msh06464a0468ee136p129893jsnd1f2efee8b81")
                    .asString();
            System.out.println(response.getStatus());
            System.out.println(response.getBody());

//            HttpResponse<String> response1 = Unirest.get("https://currency-exchange.p.rapidapi.com/listquotes")
//                    .header("x-rapidapi-host", "currency-exchange.p.rapidapi.com")
//                    .header("x-rapidapi-key", "e021e43216msh06464a0468ee136p129893jsnd1f2efee8b81")
//                    .asString();
//            System.out.println(response1.getStatus());
//            System.out.println(response1.getBody());
//            System.out.println(response1.getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }

    }
}
