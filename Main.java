class Main {
  public static void main(String[] args) {

    System.out.println("M&M Color Counts");
    
    int total = 55*10;
    double blue = total*.24;
    double brown = total*.13;
    double green = total*.16;
    double orange = total*.20;
    double red = total*.13;
    double yellow = total*.14;
    double sumColors = blue+brown+green+orange+red+yellow;


    System.out.println("blue: " + blue);
    System.out.println("brown: " + brown);
    System.out.println("green: " + green);
    System.out.println("orange: " + orange);
    System.out.println("red: " + red);
    System.out.println("yellow: " + yellow);
    
    
    System.out.println("sum: " + sumColors);

    if (blue>brown&&green>orange){
      System.out.println("Blue over Brown and Green over Orange");
    }
    if (brown<=red){
      System.out.println("Brown is less than or equal to Red");
    }
    if (sumColors==total){
      System.out.println("Numbers Match!");
    }


  }
}