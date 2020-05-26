import java.io.*;
import java.util.*;

class htmlTemplete{
    public static Scanner userInput = new Scanner(System.in);
    public static void createFile(String fileName){
        fileName = fileName + ".html";
        File newFile = new File(fileName);

        try(PrintStream output = new PrintStream(newFile)){
            
            output.println("<!DOCTYPE html>\n <html>\n<head>\n<title>\n</title>\n</head>\n<body>\n</body>\n</html>");
            

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }


    public static void main(String[] args){
    System.out.print("Please enter the file name: ");
    String fileName = userInput.nextLine();
    createFile(fileName);
    }
}