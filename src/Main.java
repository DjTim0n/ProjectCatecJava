public class Main {
    public static void main(String[] args) throws InterruptedException{

        Phone phone=new Phone("7779641122","Iphone 14 pro max","Vladislav","yellow","2313320","158", "128", "6.1", "1170 x 2532", "6.7", "oled");
        Phone phone2=new Phone("7085312356","Iphone 13","Timonchik","black","56033203","190","512","5.5","1290 x 2796", "5.3", "oled");
        Phone phone3=new Phone("7012353664","Oppo A5","Zjuzja","red","8403033203","176","32","6.6","750 x 1334", "6.0", "oled");
        Phone phone4=new Phone("7073529951","Samsung Galaxy S21 Ultra","Stavros","pink","4251312","204","128","5.4", "1080 x 1920", "4.1", "oled");
        Phone phone5=new Phone("7761225312","Xiaomi Mi 9T pro","Roman","blue","8145645","213","64","6.7","5536 x 4152", "4.4", "amoled");
        System.out.println(" ");
        System.out.println(phone.getNumber()+"\n"+phone.getModel() +"\n" +phone.getOwnerName());
        System.out.println(" ");
        System.out.println(phone2.getNumber()+"\n"+phone2.getModel() +"\n" +phone2.getOwnerName());
        System.out.println(" ");
        System.out.println(phone3.getNumber()+"\n"+phone3.getModel() +"\n" +phone3.getOwnerName());
        System.out.println(" ");
        System.out.println(phone4.getNumber()+"\n"+phone4.getModel() +"\n" +phone4.getOwnerName());
        System.out.println(" ");
        System.out.println(phone5.getNumber()+"\n"+phone5.getModel() +"\n" +phone5.getOwnerName());
        phone.setColorPhone("green");
        phone2.setModel("Iphone 14");
        phone3.setWeight("158");

    }
}