package oops;


    class Vehiclee{
        String colour;
        private int number;
        void set(int number)
        {
            number=number;
        }
        int get()
        {
            return number;
        }
    }

    class Car extends Vehiclee{
        public static void main(String[] args) {
            Vehiclee v = new Vehiclee();
            v.colour = "white";
            v.set(1010) ;
            System.out.println(v.colour + " " + v.get());
        }
    }
