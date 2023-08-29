package project1;

public class Task10DuplicateElements {

    public static void main(String[] args) {

        String [] names = {"Jake", "John", "Jeremy", "Kate", "Cathy", "Dean", "Kate", "Kylie", "Jake"};


        for(int i=0; i < names.length-1; i++){
            for (int j=i+1; j <   names.length; j++){
                if(names[i].equals(names[j])){
                    System.out.println("Duplicate elements at " + i +" and " + j + " index: " + names[i] +" and "+ names[j]);
                }
            }

        }
    }


}
