package bankdata;

/**
 * Customer Class
 * This class builds a customer object and has getters and setters for each global variable
 * @author sheehantoufiq
 */
public class Customer {
       /* 
        * Global Variables for customer object
        * 
        */  
        public String firstName;
        public String lastName;
        public String phoneNumber;
        public double balance;
        
       /* 
        * Customer Object 1-3
        * @param {String} fn: Firstname
        * @param {String} ln: Lastname
        * @param {String} pn: Phone number
        * @param {double} b: balance
        * @return none
        * Precondition: must have parameters from user inputs
        * Postcondition: build customer object
        */  
        public Customer(String fn, String ln) {
            firstName = fn;
            lastName = ln;
            phoneNumber = "";
            balance = 0;
        }
        public Customer(String fn, String ln, String pn) {
            firstName = fn;
            lastName = ln;
            phoneNumber = pn;
            balance = 0;
        }
        public Customer(String fn, String ln, String pn, double b) {
            firstName = fn;
            lastName = ln;
            phoneNumber = pn;
            balance = b;
        }
        
       /* 
        * Override toString Method
        * @param none
        * @return {String} output
        * Precondition: must have a Customer Object initialized.
        * Postcondition: returns customer object as string
        */        
        @Override
        public String toString() {
            String output = firstName + " " + lastName + " " + phoneNumber + " " + balance;            
            return output;
        }
        
       /* 
        * First Name Getter
        * @param none
        * @return {String} firstName: returns customer object firstName
        * Precondition: must have a Customer Object initialized.
        * Postcondition: returns customer object firstName
        */
        public String getFirstName() {
            return firstName;
        }
        
       /* 
        * Last Name Getter
        * @param none
        * @return {String} lastName: returns customer object lastName
        * Precondition: must have a Customer Object initialized.
        * Postcondition: returns customer object lastName
        */
        public String getLastName() {
            return lastName;
        }
        
       /* 
        * Phone Number Getter
        * @param none
        * @return {String} phoneNumber: returns customer object phoneNumber
        * Precondition: must have a Customer Object initialized.
        * Postcondition: returns customer object Phone Number
        */
        public String getPhoneNumber() {
            return phoneNumber;
        }
        
       /* 
        * Balance Getter
        * @param none
        * @return {double} balance: returns customer object balance
        * Precondition: must have a Customer Object initialized.
        * Postcondition: returns customer object balance
        */
        public double getBalance() {
            return balance;
        }
        
       /* 
        * First Name Getter
        * @param {String} String fn: first name to set in customer object
        * @return void
        * Precondition: must have a Customer Object initialized. Must have a String fn parameter
        * Postcondition: sets parameter as firstName
        */
        public void setFirstName(String fn) {
            firstName = fn;
        }
        
       /* 
        * Last Name Getter
        * @param {String} String ln: last name to set in customer object
        * @return void
        * Precondition: must have a Customer Object initialized. Must have a String ln parameter
        * Postcondition: sets parameter as lastName
        */
        public void setLastName(String ln) {
            lastName = ln;
        }
        
       /* 
        * Phone Number Setter
        * @param {String} String pn: phone number to set in customer object
        * @return void
        * Precondition: must have a Customer Object initialized. Must have a String pn parameter
        * Postcondition: sets parameter as phoneNumber
        */
        public void setPhoneNumber(String pn) {
            phoneNumber = pn;
        }
        
       /* 
        * Balance Setter
        * @param {double} double b: balance to set in customer object
        * @return void
        * Precondition: must have a Customer Object initialized. Must have a double b parameter
        * Postcondition: sets parameter as balance
        */
        public void setBalance(double b) {
            balance = b;
        }
        
}
