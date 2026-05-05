public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.username = "anuragsaha";
        // myAccount.password = "abcd"; 
        // ❌ NOT POSSIBLE because "password" is private (cannot be accessed outside its class)

        myAccount.ChangePassWord("HareKrishna");
    }
}

class BankAccount {
    public String username;
    private String password; // private → only accessible inside this class

    public void ChangePassWord(String new_password) {
        password = new_password;
    }
}

/*
==================== 📌 NOTES ====================

1. 🔹 Access Modifiers in Java
   - They define "who can access what"
   - Types:
        • public    → accessible everywhere
        • private   → accessible only within same class
        • protected → accessible within package + subclasses
        • default   → accessible within same package only

--------------------------------------------------

2. 🔹 public variable (username)
   - Can be accessed from anywhere
   - Example:
        myAccount.username = "anuragsaha"; ✅

--------------------------------------------------

3. 🔹 private variable (password)
   - Cannot be accessed directly outside the class
   - Example:
        myAccount.password = "abcd"; ❌ (Compile-time error)
   - Used for **data hiding (Encapsulation)**

--------------------------------------------------

4. 🔹 Why use private?
   - To protect sensitive data (like password)
   - Prevents unauthorized direct changes
   - Forces controlled access via methods

--------------------------------------------------

5. 🔹 Getter & Setter Concept
   - Instead of direct access, use methods
   - Here:
        ChangePassWord() → Setter method

   Example:
        myAccount.ChangePassWord("HareKrishna"); ✅

--------------------------------------------------

6. 🔹 Encapsulation
   - Wrapping data (variables) + methods together
   - Example:
        class BankAccount {
            private data + public methods
        }

--------------------------------------------------

7. 🔹 Flow of execution
   - Object created using: new BankAccount()
   - username set directly (public)
   - password set indirectly via method

--------------------------------------------------

8. 🔹 Important Interview Point
   - Private variables cannot be accessed directly
   - Must use public methods (get/set)

--------------------------------------------------

9. 🔹 Naming Convention Tip
   - Method name should be camelCase:
        changePassword() (better than ChangePassWord)

==================================================
*/