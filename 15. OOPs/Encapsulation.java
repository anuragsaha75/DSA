

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        // acc.password = "1234"; ❌ Not allowed (private)
        acc.setPassword("1234"); // ✅ setting value using setter

        System.out.println(acc.getPassword()); // ✅ getting value using getter
    }
}

class BankAccount {
    private String password;  // hidden data (data hiding)

    // Setter → used to set value
    public void setPassword(String p) {
        password = p;
    }

    // Getter → used to get value
    public String getPassword() {
        return password;
    }
}


/*
==================== 📌 ENCAPSULATION (SHORT NOTES) ====================

1. 🔹 Definition (Easy)
   - Encapsulation = wrapping data + methods into one unit (class)
   - It also means data hiding

   "Encapsulation is defined as the wrapping up of data & methods under a
    single unit. It also implements data hiding."

--------------------------------------------------

2. 🔹 How to achieve?
   ✔ Make variables private
   ✔ Use public getter & setter methods

--------------------------------------------------

3. 🔹 Why use it?
   - Security (protect data)
   - Control access
   - Clean code

--------------------------------------------------

4. 🔹 Key Line (Interview)
   👉 Encapsulation = Data Hiding + Wrapping (data + methods)

--------------------------------------------------

5. 🔹 Real-life Example
   - ATM → cannot access balance directly
   - Use methods like withdraw(), checkBalance()

==================================================
*/