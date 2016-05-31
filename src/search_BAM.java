/**
 * Created by ulloav on 5/24/2016.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class search_BAM {

    public static void main(String[] args) throws IOException  {

        //searchGUI s = new searchGUI();
        //s.show();

        //	file objects
        File folder = new File("\\\\stpnascl2n1\\eaiarch\\PRD\\MES_M680_PO.EAI.ARCHIVE\\20160527\\");
        File[] listOfFiles = folder.listFiles();

        // scanner objects
        Scanner user_in = new Scanner(System.in);

        // variables
        int counter = 0;
        String search;

        //  list to hold files found
        List<String> foundFilesList = new ArrayList();

        // runtime
        long startTime = System.currentTimeMillis();

        //	input
        System.out.print("Enter search term: ");
        search = user_in.nextLine().trim();

        //	 output

        System.out.println("\nFolder: " + folder.toString());
        System.out.println("Search term: " + search);

        System.out.println("Searching " + listOfFiles.length + " files.\n");

        for(File file:listOfFiles){

            if(!file.isFile()){
                System.out.println("invalid file: " + file);
            }	else	{
                System.out.print(".");
                counter++;

                if(counter % 50 == 0)	{ System.out.println(); }

                if(readFile(file,search)){
                    //System.out.println(file.getName());
                    foundFilesList.add(file.toString());
                    //break;
                }// end if

            }// end if

        }//end for

        //  runtime
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("\n" + foundFilesList.size() + " files found.");
        System.out.println("Total Run Time: " + (totalTime / 1000) + " seconds\n");

        //  print results list
        for( String x : foundFilesList){
            System.out.println(x);
        }

        System.out.println();

    }// end main

    public static boolean readFile(File file,String search) throws IOException	{
        //	read file for applicable entry
        //	if found break and return true

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while((line = br.readLine()) != null){

            if(line.contains(search)) {
                return true;
            }

        }// end while

        br.close();
        return false;

    }//end readFile()


}
