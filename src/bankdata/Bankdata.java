package bankdata;

/**
 *
 *
 * Java Bankdata Program
 * @author Sheehan Toufiq
 * 
 * Problem:
 * The program needs to take an user input and choose between 10 choices:
 * 
 *  1. Show all records. 
 *      - For this choice, it should output the customer data within the linked list. The customer balance must be a double 
 *        number and have a dollar sign in front of it. The output must be in alphabetical order. If there is no data in the 
 *        linked list, it should show "No records exist".
 *  2. Delete the current record. 
 *      - For this choice, the program should delete the current customer. If there is no current customer selected it will ask to 
 *        select a current customer.
 *  3. Change the first name in the current record. 
 *      - For this choice, the program will change the current customer's first name. If there is no current customer 
 *        selected, it will ask to select a customer. There will be a prompt asking what to change it to if there is a current customer.
 *  4. Change the last name in the current record.
 *      - For this choice, the program will change the current customer's last name. If there is no current customer selected, 
 *        it will ask to select a customer. There will be a prompt asking what to change it to if there is a current customer.
 *  5. Add a new record. 
 *      - For this choice a prompt will come up asking for a new customer's First Name, Last Name, Phone Number, Balance.
 *  6. Change the phone number in the current record. 
 *      - For this choice, the program will change the current customer's phone number. If there is no current customer selected, 
 *        it will ask to select a customer. There will be a prompt asking what to change it to if there is a current customer.
 *  7. Add a deposit to the current balance in the current record. 
 *      - For this choice, the program will ask to input a deposit for the current customer. If there is no current customer selected, it 
 *        will ask to select a customer.
 *  8. Make a withdrawal from the current record if sufficient funds are available. 
 *      - For this choice, the program will ask to input a withdrawal for the current customer. If there is no current customer selected, it 
 *        will ask to select a customer. If there are insufficient funds, it will state so and ask to input a withdrawal amount again.
 *  9. Select a record from the record list to become the current record. 
 *      - For this choice, the program will ask the user for a first name and last name and search the collection of records for the customer
 *        and select the customer as there current customer.
 *  10 (q). Quit.
 *      - This choice will quit the program.
 * 
 * All customer data must be stored in a linked list data structure in alphabetical order. A sort method can not be used. Instead the data 
 * must be inserted in the right place depending on it's alphabetical position.
 * 
 * If there is no data within the linked list, it must output No Records Exist whenever trying to make a choice depending on a user.
 * 
 * Challenges: 
 * The challenges include, using an efficient algorithm to insert data alphabetically without sorting and manipulating the data within
 * the linked list. Other challenges included efficiently withdrawing and depositing money and filtering a phone to print in a specified format.
 * 
 * Algorithms used (method by method):
 * 
 * main() method
 * Step 1: call menu() method
 * 
 * menu() method
 * Step 1:  prompt for input
 * Step 2:  read input
 * Step 3:  switch inputs to run specific methods.
 * Step 4:      case 1: run showRecords() method
 * Step 5:      case 2: run deleteRecord() method   
 * Step 6:      case 3: run changeFirstName() method
 * Step 7:      case 4: run changeLastName() method
 * Step 8:      case 5: run addCustomer() method
 * Step 9:      case 6: run changePhoneNumber() method
 * Step 10:     case 7: run makeDeposit() method
 * Step 11:     case 8: run makeWithdrawal() method
 * Step 12:     case 9: run selectRecord() method
 * Step 13:     case 10: terminate
 * Step 14: if user input = q
 * Step 15:     then terminate
 * 
 * showRecords() method
 * Step 1:  if collection empty
 * Step 2:      then print collection empty and run menu() method
 * Step 3:      else print each record and customer info
 * Step 4:  run menu() method
 * 
 * changeFirstName() method
 * Step 1:  if current empty
 * Step 2:      then print current empty and run menu() method
 * Step 3:      else prompt for new first name
 * Step 4:          run searchRecords() method
 * Step 5:          return index of customer
 * Step 6:          set new first name
 * Step 7:          run updateRecords() method
 * Step 8:  run menu() method
 * 
 * changeLastName() method
 * Step 1:  if current empty
 * Step 2:      then print current empty and run menu() method
 * Step 3:      else prompt for new last name
 * Step 4:          run searchRecords() method
 * Step 5:          return index of customer
 * Step 6:          set new last name
 * Step 7:          run updateRecords() method
 * Step 8:  run menu() method
 * 
 * addCustomer() method
 * Step 1:  prompt for First name, Last name, Phone Number, Balance
 * Step 2:  read input 
 * Step 3:  if phone number illegal rerun
 * Step 4:  if balance illegal rerun
 * Step 5:  use inputs to build Customer object 
 * Step 6:  run insert() method return index position of alphabetical sort
 * Step 7:  add customer object to list
 * Step 8:  run menu() method
 *
 * changePhoneNumber() method
 * Step 1:  if current empty
 * Step 2:      then print current empty and run menu() method
 * Step 3:      else prompt for new Phone Number
 * Step 4:          run searchRecords() method
 * Step 5:          return index of customer
 * Step 6:          run returnPhoneNumber() method
 * Step 7:          set new phone number
 * Step 8:          run updateRecords() method
 * Step 9:  run menu() method
 * 
 * makeDeposit() method
 * Step 1:  if current empty
 * Step 2:      then print current empty and run menu() method
 * Step 3:      else prompt for deposit
 * Step 4:          run searchRecords() method
 * Step 5:          return index of customer
 * Step 6:          add existing balance to deposit
 * Step 7:          set new balance
 * Step 8:          run updateRecords() method
 * Step 9:  run menu() method
 * 
 * makeWithdrawal() method
 * Step 1:  if current empty
 * Step 2:      then print current empty and run menu() method
 * Step 3:      else prompt for withdrawal
 * Step 4:          run searchRecords() method
 * Step 5:          return index of customer
 * Step 6:              if existing balance less than withdrawal
 * Step 7:              then print insufficient funds
 * Step 8:              else subtract withdrawal from existing balance
 * Step 9:                  set new balance
 * Step 10:                 run updateRecords() method
 * Step 11: run menu() method
 * 
 * selectRecord() method
 * Step 1:  prompt for First name and Last name
 * Step 2:  run searchRecords() method
 * Step 3:  if no record exists
 * Step 4:      then print no record exist 
 * Step 5:      else set record as current customer
 * Step 6:  run menu() method
 *
 * updateRecords() method
 * Step 1:  run searchRecords() method
 * Step 2:  if no record exists print no record exists
 * Step 3:      else run insert() method
 * Step 4:  run menu() method
 *
 * searchRecords() method
 * Step 1:  if collection empty return collection empty
 * Step 2:      else compare First Name and Last name to each list index
 * Step 3:      return list index
 * 
 * insert() method 
 * Step 1:  if collection empty return collection empty
 * Step 2:      else compare Last name to each list index
 * Step 3:      return list index
 * 
 * returnPhoneNumbers method()
 * Step 1:  sanitize phone number
 * Step 2:  if illegal phone number return illegal
 * Step 3:      else return phone number
 * 
 * Data Structures used: 
 * LinkedList, Customer Object
 * 
 * 
*/
import java.util.*;
import java.text.*;

/**
  * Bankdata class. It is used to store the linked list and run all
  * methods in the algorithms section above
  * 
*/
public class Bankdata {

    /**
     * These are the global variables for the Bankdata class:
     * globalVariables:
    */
    public static LinkedList<Customer> l1 = new LinkedList();
    public static Customer c1;
    
   /* 
    * Show Records Method
    * @param none
    * @return void
    * Precondition: must come from menu()
    * Postcondition: prints output of data or no data available reruns menu()
    * 
   */
    public static void showRecords() {
        System.out.println("\n[ Show Records ]\n");
        if (l1.isEmpty()) {
            System.out.println("No Records Available.");
        } else {
            System.out.printf("%-25s %-25s %-25s %-25s \n", "First Name", "Last Name", "Phone Number", "Balance");
            System.out.printf("%-25s %-25s %-25s %-25s \n", "----------", "---------", "------------", "-------");
            for (int i = 0; i < l1.size(); i++) {
                System.out.printf("%-25s %-25s %-25s $%-25.2f \n", l1.get(i).getFirstName(), l1.get(i).getLastName(), l1.get(i).getPhoneNumber(), l1.get(i).getBalance());
            }
        }
        menu();
    }
    
   /* 
    * Delete Record Method
    * @param none
    * @return void
    * Precondition: must come from menu()
    * Postcondition: deletes specified data or prints no record selected, reruns menu()
    * 
   */
    public static void deleteRecord() {
        if (c1 == null) {
            System.out.println("\nNo current record selected. Please select a record.");
        } else {
            int k = searchRecords();
            if (k == -1) {
                System.out.println("\nError: Record Removal Failed");
            } else {
                l1.remove(k);
                System.out.println("\nDeleted: " + c1.getFirstName() + " " + c1.getLastName() + " " + c1.getPhoneNumber());
                c1 = null;
            }
        }
        menu();
    }
    
   /* 
    * Change First Name Method
    * @param none
    * @return void
    * Precondition: must come from menu()
    * Postcondition: changes specified first name in collection reruns menu()
    * 
   */
    public static void changeFirstName() {
        System.out.println("\n[ Change First Name ]\n");
        if (c1 == null) {
            System.out.println("No current record selected. Please select a record.");
        } else {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter new first name: ");
            String newFirst = in.next();
            c1.setFirstName(newFirst);
            updateRecords();
        }
        menu();
    }
    
   /* 
    * Change Last Name Method
    * @param none
    * @return void
    * Precondition: must come from menu()
    * Postcondition: changes specified last name in collection reruns menu()
    * 
   */
    public static void changeLastName() {
        System.out.println("\n[ Change Last Name ]\n");
        if (c1 == null) {
            System.out.println("No current record selected. Please select a record.");
        } else {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter new last name: ");
            String newLast = in.next();
            c1.setLastName(newLast);
            updateRecords();
        }
        menu();
    }
    
   /* 
    * Add Customer Method
    * @param none
    * @return void
    * Precondition: must come from menu()
    * Postcondition: creates and add's customer object to list in proper alphabetical order reruns menu()
    * 
   */
    public static void addCustomer() {
        System.out.println("\n[ Add Customer ]\n");
        Scanner in = new Scanner(System.in);
        
        System.out.print("First Name: ");
        String fn = in.next();
        
        System.out.print("Last Name: ");
        String ln = in.next();
        String pn;
        
        while (true) {
            System.out.print("Phone Number: ");
            pn = in.next();
            pn = returnPhoneNumber(pn);
            if (pn.equals("invalid")) {
                System.out.println("Please enter a valid 10 digit phone number.");
                continue;
            } else {
                break;
            }
        }
        while (true) {
            try {
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.print("Balance: ");
                String bInput = in.next();
                double b = Double.parseDouble(bInput);
                b = Double.valueOf(df.format(b));
                c1 = new Customer(fn, ln, pn, b);
                int g = insert();
                l1.add(g, c1);
                System.out.println("\nCurrent record is: " + c1.getFirstName() + " " + c1.getLastName() + " " + c1.getPhoneNumber());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a numerical balance.");
                continue;
            }
        }
        menu();
    }
    
   /* 
    * Change Phone Number Method
    * @param none
    * @return void
    * Precondition: must come from menu()
    * Postcondition: changes specified Phone number in collection reruns menu()
    * 
   */
    public static void changePhoneNumber() {
        System.out.println("\n[ Change Phone Number ]\n");
        if (c1 == null) {
            System.out.println("No current record selected. Please select a record.");
        } else {
            Scanner in = new Scanner(System.in);
            while (true) {
                System.out.print("Enter new phone number: ");
                String newPhone = in.next();
                newPhone = returnPhoneNumber(newPhone);
                if (newPhone.equals("invalid")) {
                    System.out.println("Please enter a valid 10 digit phone number.");
                    continue;
                } else {
                    c1.setPhoneNumber(newPhone);
                    updateRecords();
                    break;
                }
            }
        }
        menu();
    }
    
   /* 
    * Make Deposit Method
    * @param none
    * @return void
    * Precondition: must come from menu()
    * Postcondition: adds deposit to specified record in collection, reruns menu()
    * 
   */
    public static void makeDeposit() {
        System.out.println("\n[ Make Deposit ]\n");
        if (c1 == null) {
            System.out.println("No current record selected. Please select a record.");
        } else {
            while (true) {
                try {
                    Scanner in = new Scanner(System.in);
                    DecimalFormat df = new DecimalFormat("#.##");
                    System.out.print("Enter a deposit amount: ");
                    String depositInput = in.next();
                    double deposit = Double.parseDouble(depositInput);
                    deposit = Double.valueOf(df.format(deposit));                    
                    double newBalance = c1.getBalance() + deposit;
                    newBalance = Double.valueOf(df.format(newBalance));
                    c1.setBalance(newBalance);
                    updateRecords();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a numerical balance.");
                    continue;
                }
            }
        }
        menu();
    }
    
   /* 
    * Make Withdrawal Method
    * @param none
    * @return void
    * Precondition: must come from menu()
    * Postcondition: subtracts Withdrawal from specified record in collection, or prints insufficient funds. reruns menu()
    * 
   */
    public static void makeWithdrawal() {
        System.out.println("\n[ Make Withdrawal ]\n");
        if (c1 == null) {
            System.out.println("No current record selected. Please select a record.");
        } else {
            while (true) {
                try {
                    Scanner in = new Scanner(System.in);
                    DecimalFormat df = new DecimalFormat("#.##");
                    System.out.print("Enter a withdrawal amount: ");
                    String withdrawInput = in.next();
                    double withdraw = Double.parseDouble(withdrawInput);
                    withdraw = Double.valueOf(df.format(withdraw));
                    if (c1.getBalance() < withdraw) {
                        System.out.println("Insufficient Funds.");
                        continue;
                    } else {
                        double newBalance = c1.getBalance() - withdraw;
                        newBalance = Double.valueOf(df.format(newBalance));
                        c1.setBalance(newBalance);
                        updateRecords();
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a numerical balance.");
                    continue;
                }
            }
        }
        menu();
    }
    
   /* 
    * Select Record Method
    * @param none
    * @return void
    * Precondition: must come from menu()
    * Postcondition: finds specified record in collection and prints out info. Prints record doesn't exist if not found. reruns menu()
    * 
   */
    public static void selectRecord() {
        System.out.println("\n[ Select a Record ]\n");
        Scanner in = new Scanner(System.in);
        System.out.print("First Name: ");
        String selectFirst = in.next();
        System.out.print("Last Name: ");
        String selectLast = in.next();
        c1 = new Customer(selectFirst, selectLast);
        int m = searchRecords();
        if (m == -1) {
            System.out.println("\nRecord Does Not Exist.");
            c1 = null;
        } else {
            c1 = l1.get(m);
            System.out.println("\nCurrent Record is: " + c1.getFirstName() + " " + c1.getLastName() + " " + c1.getPhoneNumber());
        }
        menu();
    }
    
   /* 
    * Update Records Method
    * @param none
    * @return void
    * Precondition: must have new data for Customer object, Must have existing data in collection to update
    * Postcondition: Updates entire customer object within collection 
    * 
   */
    public static void updateRecords() {
        int j = searchRecords();
        int f = insert();
        if (j == -1) {
            System.out.println("\nRecord Does Not Exist.");
        } else {
            l1.add(f, c1);
            l1.remove(j);
            System.out.println("\nCurrent Record is: " + c1.getFirstName() + " " + c1.getLastName() + " " + c1.getPhoneNumber());
        }
    }
    
   /* 
    * Insert Method
    * @param none
    * @return n: the index location where the new object is to be placed.
    * Precondition: must have new customer object as current to insert.
    * Postcondition: returns n: the index location where the new object is to be placed
    * 
   */
    public static int insert() {
        int n = 0;
        if (l1.isEmpty()) {
            return n;
        } else {
            String p;
            String q;
            while (n < l1.size()) {
                p = l1.get(n).getLastName();
                q = l1.get(n).getFirstName();
                if (p.compareTo(c1.getLastName()) > 0) {
                    break;
                } else {
                    n++;
                    continue;
                }
            }
            return n;
        }   
    }
    
   /* 
    * Search Records Method
    * @param none
    * @return i: returns index location of specified record
    * Precondition: must come from menu()
    * Postcondition: adds deposit to specified record in collection, reruns menu()
    * 
   */
    public static int searchRecords() {
        int i = 0;
        if (l1.isEmpty()) {
            i = -1;
        } else {
            while(i < l1.size()) {
                if (c1.getFirstName().equals(l1.get(i).getFirstName()) && c1.getLastName().equals(l1.get(i).getLastName())) {
                    break;
                } else {
                    if (i == (l1.size() - 1)) {
                        i = -1;
                    } else {
                        i++;
                    }
                }
            }
        }
        return i;
    }
    
   /* 
    * Return Phone Number Method
    * @param {string} pn: user input of phone number
    * @return pn: returns sanitized phone number or "invalid"
    * Precondition: must have a phone number as a parameter
    * Postcondition: returns sanitized phone number or "invalid" to use in Customer Object
    * 
   */
    public static String returnPhoneNumber(String pn) {
        pn = pn.replaceAll(" ", "");
        pn = pn.replaceAll("-", "");
        pn = pn.replaceAll("\\)", "");
        pn = pn.replaceAll("\\(", "");
        pn = pn.replaceAll("\\.", "");
        if (pn.matches("[0-9]+") && pn.length() == 10) {
            pn = pn.substring(0, 3) + "-" + pn.substring(3, 6) + "-" + pn.substring(6, pn.length());
            return pn;
        } else {
            return "invalid";
        }
    }
    
   /* 
    * Menu Method
    * @param none
    * @return void
    * Precondition: must come from main()
    * Postcondition: runs showRecords(), deleteRecord(), changeFirstName(), changeLastName(), addCustomer(), changePhoneNumber(),
    *                makeDeposit(), makeWithdrawal(), selectRecord(), or terminates based on user input. Also recognizes illegal
    *                commands and reruns.
    * 
   */
    public static void menu() {
        // TODO code application logic here
        System.out.println("\n[ Main Menu ]\n");
        System.out.println(
                " 1. Show all records. \n" +
                " 2. Delete the current record. \n" +
                " 3. Change the first name in the current record. \n" +
                " 4. Change the last name in the current record. \n" +
                " 5. Add a new record. \n" +
                " 6. Change the phone number in the current record. \n" +
                " 7. Add a deposit to the current balance in the current record. \n" +
                " 8. Make a withdrawal from the current record if sufficient funds are available. \n" +
                " 9. Select a record from the record list to become the current record. \n" +
                " 10. Quit."
        );
        int menuChoice;
        illegalCommand: while(true) {
            System.out.print("Enter a command from the list above (q to quit): ");
            Scanner in = new Scanner(System.in);
            String input = in.next();
            if (input.equals("q")) {
                menuChoice = 10;
                break;
            } else {
                try {
                    menuChoice = Integer.parseInt(input);
                    if (menuChoice > 10 || menuChoice < 1) {
                        System.out.println("Illegal Command.");
                        continue illegalCommand;
                    } else {
                        break;
                    }
                } catch(NumberFormatException e) {
                    System.out.println("Illegal Command.");
                    continue illegalCommand;
                }
            }
        }
        switch(menuChoice) {
            case 1: showRecords();
                    break;
            case 2: deleteRecord();
                    break;
            case 3: changeFirstName();
                    break;
            case 4: changeLastName();
                    break;
            case 5: addCustomer();
                    break;
            case 6: changePhoneNumber();
                    break;
            case 7: makeDeposit();
                    break;
            case 8: makeWithdrawal();
                    break;
            case 9: selectRecord();
                    break;
            case 10: System.exit(0); 
                     break;
        }
    }
    
   /* 
    * Return Phone Number Method
    * @param none
    * @return void
    * Precondition: none
    * Postcondition: runs menu()
    * 
   */
    public static void main(String[] args) {
        menu();
    }
}
