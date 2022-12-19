package work13;


import java.util.StringTokenizer;

public class Address {
    private int house;
    private int corpus;
    private int apartment;
    private String country;
    private String region;
    private String city;
    private String street;


    public void setAddressOnlyComma(String addres) {
        var address = addres.split(", ");
        country = address[0];
        region = address[1];
        city = address[2];
        street = address[3];
        house = Integer.parseInt(address[4]);
        corpus = Integer.parseInt(address[5]);
        apartment = Integer.parseInt(address[6]);
    }

    public void setAddress(String addres) {
        var tokenizer = new StringTokenizer(addres, ",.;");
        country = tokenizer.nextToken();
        region = tokenizer.nextToken().replaceFirst(" ", "");
        city = tokenizer.nextToken().replaceFirst(" ", "");
        street = tokenizer.nextToken().replaceFirst(" ", "");
        house = Integer.parseInt(tokenizer.nextToken().replace(" ", ""));
        corpus = Integer.parseInt(tokenizer.nextToken().replace(" ", ""));
        apartment = Integer.parseInt(tokenizer.nextToken().replace(" ", ""));
    }

    public String toString() {
        return "Адрес: " + country + ", " + region + ", " + city + ", " + street + ", " + house + ", " + corpus + ", " + apartment;
    }
    public static void main(String[] args) {
        var address = new Address();
        address.setAddressOnlyComma("Россия, Московская область, Москва, проспект Вернадского, 1, 2, 3");
        System.out.println(address);
        address.setAddress("Россия. Московская область. Москва. проспект Вернадского. 1. 2. 3");
        System.out.println(address);
        address.setAddress("Россия; Московская область; Москва; проспект Вернадского; 1; 2; 3");
        System.out.println(address);
        address.setAddressOnlyComma("НеРоссия, НеМосковская область, НеМосква, непроспект неВернадского, 3, 2, 1");
        System.out.println(address);
    }
}