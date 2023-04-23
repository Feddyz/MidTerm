
import members.Member;
import members.SeniorMember;
import members.StandardMember;

import java.util.*;

public class Main {
    public static void main(String[] args) {
String buffer0 = "";
        Society society=new Society();
        Scanner scanner = new Scanner(System.in);
        String buffer = "";
        StringTokenizer tokenizer = new StringTokenizer(buffer, "_");
        int option1 = -1;
        int quit = 0, loop;
        int totalFee = 0;
        for (; quit != 1; ) {
            options();
            option1 = scanner.nextInt();
            switch (option1) {
                case 0 -> {
                    quit = 1;
                    System.out.print(" -- Quit\n");
                    break;
                }
                case 1 -> {
                    Scanner scan1 = new Scanner(System.in);
                    buffer = scan1.nextLine();
                    StringTokenizer tokenizer1 = new StringTokenizer(buffer,"_");
                    society.addMember(tokenizer1.nextToken(),tokenizer1.nextToken());
                    //society.addMember(buffer,buffer0);
                }
                case 2 -> {
                    Scanner scan1 = new Scanner(System.in);
                    buffer = scan1.nextLine();

                    tokenizer = new StringTokenizer(buffer, "_");
                    society.addSeniorMember(tokenizer.nextToken(),tokenizer.nextToken(),
                            Integer.parseInt(tokenizer.nextToken()));
                }
                case 3 -> {
                    Scanner scan1 = new Scanner(System.in);
                    int index = scan1.nextInt();
                    society.addCttMember(society.SeniorList.get(society.SeniorList.size()-1));
                }
                case 4 -> {
                    System.out.println("\nStandard List: \nindex Name Address ");
                    for(int i = 0;i<= society.StandardList.size()-1;i++)
                    {
                        System.out.printf("%d %s %s\n",i+1,
                                society.StandardList.get(i).getName(),
                                society.StandardList.get(i).getAddress());
                    }
                    System.out.println("\nSenior List:\nindex Name Address Fee");
                    for(int i = 0;i<= society.SeniorList.size()-1;i++)
                    {
                        System.out.printf("%d %s %s $ %d\n", i+1,
                                society.SeniorList.get(i).getName(),
                                society.SeniorList.get(i).getAddress(),
                                society.SeniorList.get(i).getfee());
                    }
                    System.out.println("\nCommittee List:\nindex Name Address");
                    for(int i = 0;i<= society.CtteeList.size()-1;i++)
                    {
                        System.out.printf("%d %s %s\n",i+1,
                                society.CtteeList.get(i).getName(),
                                society.CtteeList.get(i).getAddress());
                    }
                    System.out.println("\n");
                }
                case 5 -> {
                    totalFee += 500*society.StandardList.size();
                    for (int i =0; i<= society.SeniorList.size()-1;i++)
                    {
                        totalFee += society.SeniorList.get(i).getfee();
                    }
                    System.out.println("Total fee is : "+totalFee);
                }
                case 6 -> {
                    Scanner scan1 = new Scanner(System.in);
                    int o = scan1.nextInt();
                    society.CtteeList.remove(o-1);
                }


            }
        }
    }
        public static void options(){
            System.out.println("Options:");
            System.out.println("\t[0]Quit\n\t" +
                    "[1]Add Standard Member\n\t" +
                    "[2]Add Senior Member\n\t" +
                    "[3]Add Committee Member\n\t" +
                    "[4]Show all Members\n\t" +
                    "[5]See Total Fee\n\t" +
                    "[6]Remove Committee member(index needed)");
            System.out.print("Next move:\t\n");
        }
}
