class first1 {
    //method overloading and constructor overloading
        // method overloading
        void str(int a) {
            System.out.println("A = " + a);
        }
    
        void str(int a, int b) {
            System.out.println("A + B = " + (a + b));
        }
    
        // contructor overloading
        first1(String n1) {
            System.out.println("n1 = " + n1);
        }
    
        first1(String n1, String n2) {
            System.out.println("n1 + n2 = " + (n1 + n2));
        }
    }
    
    class first {
        public static void main(String[] args) {
            first1 f1 = new first1("Ankit");
            first1 f2 = new first1("jangid", "bro");
    
    
            // first f = new first();
            f1.str(10);
            f1.str(11, 23);
    
        }
    }