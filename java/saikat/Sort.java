class Sort {

    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            for(int j = i+1; j < args.length; j++){
                if(args[j].compareTo(args[i]) < 0){
                    String t = args[i];
                    args[i] = args[j];
                    args[j] = t;
                }
            }
        }

        System.out.println("After sorting:");
        for(String s : args)
            System.out.print(s + " ");
    }
       
}
