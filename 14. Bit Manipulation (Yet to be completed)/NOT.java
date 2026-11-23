public class NOT{
    public static void main(String[] args) {
        System.out.println(~5);
    }
}


//This will print -6

// Why -6?

//Step 1: Write 5 in binary (8-bit for simplicity)
//         5 = 00000101
//Step 2: Apply ~ (flip all bits) [1's Complement]
//      ~5 = 11111010
// Step 3: What number is 11111010?

//          Using Two's Complement:

//         00000101
// Step 4 : Add +1
//        00000110 = 6

// 👉 So value = -6

//          Shortcut Rule (Very Important)

//               ~x = -(x + 1)