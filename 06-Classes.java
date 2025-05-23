class Cookie{
    private String color;
    public Cookie(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
}

public class Main {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("purple");
        
        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}
