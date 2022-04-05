class Main {
  public static void main(String[] args) {

    int tree = 5;

    for(int i = tree; i > 0; i--){
      for(int j = 1; j > 0; j--)
        System.out.print(" ");
      for(int k = 2*(tree -i)+1; k > 0; k--)
           System.out.print("*");
      
    System.out.println();
    
    
  }
}
}