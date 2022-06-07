import java.util.Scanner;
//imports for reading
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//imports for writing
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String password;
    private int rowWidth;


    public User(String n,String p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A User Name: ");
        n = sc.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please Enter A Password: ");
        p = sc2.nextLine();

        rowWidth = 10;
        name =padRecord(n);
        password =padRecord(p);
    }

    public String toString(){
        return name + "," + password;
    }

    public String[] splitString(String s){
        return s.split(",");
    }

    public String padRecord(String n) {
        //pad data to correct record width
        int currentLength= n.length();
        int paddingNeeded = rowWidth - currentLength;
        String tempVar = n;
        for (int i=0; i<paddingNeeded; i++){
            tempVar= tempVar + " ";
        }
        //error if data is too long for record
        if (currentLength>rowWidth){
            System.out.println("ERROR: Tried to write " + n + " to field width of " + rowWidth);

        }
        return tempVar;
    }

    public ArrayList userVerification(String fileName)throws IOException{
        //file into list
        ArrayList<String> userPass = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                userPass.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }

        return userPass;
    }

    //split at comma
    //put into 2 lists
    //if both equal --> true

    // USER VERIFICATION- doesn't work
  /*public void userVerification(String fileName1){
    try (
      FileReader fr = new FileReader(fileName);
      BufferedReader br = new BufferedReader(fr);){ 
      boolean verification = false;
      while (fileName != null ) {
        String file = br.readLine();

        if(file.contains(name) && file.contains(password)){
          verification = true;
          break;
        }
      }
      
      if(verification == true){ 
        System.out.println("right"); //using for testing purposes
      }else {
        System.out.println("wrong");
      }
      }
    catch (IOException e) {
 	    e.printStackTrace();
    }
  }
  */
    public void display (){
        System.out.println(name +"," + password +".");
    }

}