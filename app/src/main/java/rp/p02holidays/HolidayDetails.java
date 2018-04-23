package rp.p02holidays;

public class HolidayDetails {
    private String name;
    private String date;
    private String image;
    private String desc;


    public HolidayDetails(String name, String date, String image, String desc){
        this.name = name;
        this.date = date;
        this.image = image;
        this.desc = desc;
    }

    public String getName() {
        return name;}

    public String getDate(){
        return date;
    }

    public String getImage(){
        return image;
    }

    public String getDescription(){
        return desc;
    }
}
