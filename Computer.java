public class Computer extends TangibleAsset {
  private String version;
  public Computer(String name, int price, String color, String version){
    super(name, price, color);
    this.version = version;
  }
  public String getVersion(){
    return this.version;
  }
