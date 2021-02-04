package bitlab.askar.module1.project;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Input your account number");
        String accountNumber = in.next();
        System.out.println("Input your pin code");
        String pinCode = in.next();

        BankAccount bankAccount = null;

        boolean b = false;
        for (int i=0;i< Database.allAccounts.length;i++){
            if (Database.allAccounts[i].getAccountNumber().equals(accountNumber)){
                if(Database.allAccounts[i].getPinCode().equals(pinCode)){
                    bankAccount = Database.allAccounts[i];
                    b = true;
                    break;
                }
            }
        }

        if (!b){
            System.out.println("You wrote wrong pin code or account number");
        }

        while (true){

            if (bankAccount instanceof CityBankAccount){

                System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                        "PRESS [2] TO VIEW BALANCE \n" +
                        "PRESS [3] TO CHANGE PIN CODE\n" +
                        "PRESS [4] TO CASH IN ACCOUNT\n" +
                        "PRESS [5] TO VIEW ACCOUNT DATA\n" +
                        "PRESS [6] TO EXIT\n");

                int choice = in.nextInt();

                if (choice==1){
                    System.out.println("Input credit");
                    int credit = in.nextInt();
                    bankAccount.debetBalance(credit);
                }else if (choice==2){
                    System.out.println(bankAccount.totalBalance());
                }else if (choice==3){
                    System.out.println("Input new pincode");
                    String newPinCode = in.next();
                    bankAccount.setPinCode(newPinCode);
                }else if (choice==4){
                    System.out.println("Input debet");
                    int debet = in.nextInt();
                    bankAccount.debetBalance(debet);
                }else if (choice==5){
                    System.out.println(bankAccount.accountData());
                }else break;


            }else if (bankAccount instanceof NationalBankAccount){

                System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                        "PRESS [2] TO VIEW BALANCE \n" +
                        "PRESS [6] TO EXIT\n");

                int choice = in.nextInt();

                if (choice==1){
                    System.out.println("Input credit");
                    int credit = in.nextInt();
                    bankAccount.debetBalance(credit);
                }else if (choice==2){
                    System.out.println(bankAccount.totalBalance());
                } else break;
            }

        }
    }
}