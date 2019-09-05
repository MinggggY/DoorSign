import java.util.Random;

public class DoorSign {
    public static void main(String[] args) {
        //Define all the characters
        String[] character={"Harry Potter","Sirius Black","Susan Bones","Colin Creevey","Fleur Delacour"
                ,"Albus Dumbledore","Rubeus Hagrid","Neville Longbottom","Dean Thomas","Luna Lovegood","Remus Lupin","Draco Malfoy"
                ,"Minerva McGonagall", "Mad-Eye Moody","Peter Pettigrew","Severus Snape","Lord Voldemort","Ginny Weasley","George Weasley"
                ,"Ron Weasley","Hermione Granger","Pomona Sprout"};
        //Define all the rooms
        String[] room={"63B","63A","72","65","70","59","57","52","53","58","54","74","55","67","56","68","75","60","71","73","64","61"};
        int[] co=new int[22];//Define which room is link to which floor
        boolean[] flag=new boolean[22];//Define whether the character is taken or not
        Random random=new Random();
        for(int i=0;i<21;i++){
            while (co[i]==0){//It keeps going till find a character that h
                int number=random.nextInt(22);
                if(!flag[number]){
                    flag[number]=true;
                    co[i]=number+1;
                }
            }
        }
        for(int i=0;i<22;i++){
            if(flag[i]==false)
                co[21]=i+1;

        }
        for(int i=0;i<22;i++){
            System.out.println("Room "+room[i]+": "+character[co[i]-1]);//Printing out the result
        }

    }
}
