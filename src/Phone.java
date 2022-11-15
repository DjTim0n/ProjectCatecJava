public class Phone {
    private String number;
    private String model;
    private String ownerName;
    private String colorPhone;
    private String recieverPhone;
    private String memoryPhone;
    private String heightPhone;
    private String resolutionPhone;
    private String frequencyPhone;
    private String screentypePhone;



    public void recieveCall(String name) {
        System.out.println("vam zvonit " + name);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setColorPhone(String colorPhone) {
        this.colorPhone = colorPhone;
    }

    public void setRecieverPhone(String recieverPhone) {
        this.recieverPhone = recieverPhone;
    }

    public void setPeremenay(int peremenay) {
        this.peremenay = peremenay;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }
    public String getMemoryPhone() {
        return memoryPhone;
    }
    public String getHeightPhone() {
        return heightPhone;
    }
        public String getFrequencyPhone() {
        return frequencyPhone;
    }
    public String getModel() {
        return model;
    }
    public String getScreentypePhone () {
        return  screentypePhone;
    }
    public String getResolutionPhone(){
        return resolutionPhone;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColorPhone() {
        return colorPhone;
    }

    public String getRecieverPhone() {
        return recieverPhone;
    }

    public int getPeremenay() {
        return peremenay;
    }

    public String getWeight() {
        return weight;
    }

    private int peremenay = 0;
    private String weight;

    public Phone(String number, String ownerName, String model, String weight) {
        this.number = number;
        this.ownerName = ownerName;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.model = model;
        this.number = number;
    }

    public Phone(String number, String model, String ownerName, String colorPhone, String recieverPhone, String weight,String memoryPhone,String heightPhone, String resolutionPhone, String frequencyPhone,String screentypePhone) {
        this.number = number;
        this.model = model;
        this.ownerName = ownerName;
        this.colorPhone = colorPhone;
        this.recieverPhone = recieverPhone;
        this.weight = weight;
        this.memoryPhone = memoryPhone;
        this.resolutionPhone = resolutionPhone;
        this.heightPhone = heightPhone;
        this.frequencyPhone = frequencyPhone;
        this.screentypePhone = screentypePhone;

    }
}