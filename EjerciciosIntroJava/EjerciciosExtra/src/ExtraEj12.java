public class ExtraEj12 {

    public static void main(String[] args) {
        String carac = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(i==3){
                        carac = carac.concat("E");
                    }else{
                        carac = carac.concat(Integer.toString(i));
                    }
                    
                    carac = carac.concat("-");
                    
                    if(j==3){
                        carac = carac.concat("E");
                    }else{
                        carac = carac.concat(Integer.toString(j));
                    }
                    
                    carac = carac.concat("-");
                    
                    if(k==3){
                        carac = carac.concat("E");
                    }else{
                        carac = carac.concat(Integer.toString(k));
                    }
                    
                    System.out.println(carac);
                    carac = "";
                }
            }
            System.out.println("-------");
        }
    }    
}