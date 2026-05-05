public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();

        p1.SetColour("Red");
        p1.SetThinkness(6);

        System.out.println(p1.GetColour()); // Cannot use p1.colour (private)
        System.out.println(p1.GetThinkness());

        p1.SetColour("Yellow");
        System.out.println(p1.GetColour());
    }
}

class Pen {
    private String colour;
    private int thickness;

    String GetColour() {
        return this.colour;
    }

    int GetThinkness() {
        return this.thickness;
    }

    void SetColour(String colour) {
        this.colour = colour;
    }

    void SetThinkness(int thickness) {
        this.thickness = thickness;
    }
}

/*
==================== 📌 NOTES ====================

1. 🔹 Getters & Setters
   - Getter → used to "get" (return) value
   - Setter → used to "set" (modify) value

   Example:
        GetColour() → returns colour
        SetColour() → sets colour

--------------------------------------------------

2. 🔹 Why we use Getter & Setter?
   - Variables are private (data hiding)
   - Cannot access directly:
        p1.colour ❌
   - So we use methods:
        p1.GetColour() ✅
        p1.SetColour("Red") ✅

--------------------------------------------------

3. 🔹 Encapsulation (VERY IMPORTANT)
   - Data (variables) + methods bundled together
   - Protects data from direct access
   - Improves security & control

--------------------------------------------------

4. 🔹 private keyword
   - Restricts access to same class only
   - Example:
        private String colour;

--------------------------------------------------

5. 🔹 this keyword
   - Refers to current object
   - Used to differentiate instance variable & parameter

   Example:
        this.colour = colour;

   - Left side → instance variable
   - Right side → parameter


            ==================== 📌 "this" KEYWORD NOTES ====================

            1. 🔹 What is "this"?
            - "this" is a reference to the **current object**
            - It refers to the object whose method/constructor is being called

            --------------------------------------------------

            2. 🔹 Why do we need "this"?
            - To avoid confusion between:
                    • instance variables (class variables)
                    • method parameters

            Example:
                    void SetColour(String colour){
                        this.colour = colour;
                    }

            Explanation:
                    this.colour → instance variable
                    colour      → parameter

            --------------------------------------------------

            3. 🔹 Without "this" problem ⚠️

                    void SetColour(String colour){
                        colour = colour; // ❌ WRONG
                    }

            - This assigns parameter to itself
            - Instance variable remains unchanged

            --------------------------------------------------

            4. 🔹 Referring current object explicitly

                    Pen p1 = new Pen();
                    Pen p2 = new Pen();

            - Inside p1 method → this = p1
            - Inside p2 method → this = p2

            --------------------------------------------------

            5. 🔹 Calling methods using "this"

                    this.SetColour("Red");

            - Calls method of current object
            - Mostly optional (Java adds it automatically)

            --------------------------------------------------

            6. 🔹 Calling constructors (Constructor Chaining)

                    class Pen {
                        Pen() {
                            this("Blue"); // calls parameterized constructor
                        }

                        Pen(String colour) {
                            this.colour = colour;
                        }
                    }

            - Must be first statement in constructor

            --------------------------------------------------

            7. 🔹 Returning current object

                    Pen SetColour(String colour){
                        this.colour = colour;
                        return this;
                    }

            - Useful for method chaining:
                    p1.SetColour("Red").SetThinkness(5);

            --------------------------------------------------

            8. 🔹 Passing current object as argument

                    void print(Pen obj){
                        System.out.println(obj.colour);
                    }

                    print(this); // passing current object

            --------------------------------------------------

            9. 🔹 Important Points

            ✅ "this" is only used inside non-static methods/constructors  
            ❌ Cannot use "this" inside static methods  

            --------------------------------------------------

            10. 🔹 Interview Shortcut Definition

            👉 "this" is a reference variable that refers to the current object.

            --------------------------------------------------

            11. 🔹 Real-life Analogy

            - Imagine you say:
                    "this phone is mine"
            - "this" → refers to the current phone you are holding

            ==================================================


--------------------------------------------------

6. 🔹 Flow of Program
   - Object created → p1
   - Values set using setters
   - Values accessed using getters
   - Direct access is not allowed

--------------------------------------------------

7. 🔹 Naming Convention (IMPORTANT)
   - Standard Java naming:
        getColour() ✅
        setColour() ✅

   - Your code uses:
        GetColour(), SetColour() ❌ (not recommended)

--------------------------------------------------

8. 🔹 Spelling Mistake ⚠️
   - "Thinkness" → should be "Thickness"

--------------------------------------------------

9. 🔹 Key Concept (Interview)
   - "Private variables cannot be accessed directly"
   - "Use public getter/setter methods"

--------------------------------------------------

10. 🔹 Advantage of Setters
   - You can add validation later

   Example:
        void setThickness(int t){
            if(t > 0){
                this.thickness = t;
            }
        }

--------------------------------------------------

11. 🔹 Real-life Example
   - Bank Account password
   - Cannot access directly
   - Only change via method → security

==================================================
*/