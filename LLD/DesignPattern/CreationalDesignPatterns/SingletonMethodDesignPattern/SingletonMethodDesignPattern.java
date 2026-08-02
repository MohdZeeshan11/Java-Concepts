package LLD.DesignPattern.CreationalDesignPatterns.SingletonMethodDesignPattern;


class Singleton{

    private static Singleton instance = new Singleton(); // eager initialization, means the instance is created at the time of class loading

    private Singleton() {
        // private constructor to prevent instantiation
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance() {
        // if (instance == null) {
        //     instance = new Singleton(); // lazy initialization, means the instance is created only when it is requested for the first time
        // }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton@" + Integer.toHexString(hashCode());
    }
}

class SingletonMethodDesignPattern{
    public static void main (String[] args) {
        Singleton singleton1 = Singleton.getInstance();

        System.out.println("instance = "+ singleton1);


        // Singleton singleton2 = Singleton.getInstance();

        // if (singleton1 == singleton2) {
        //     System.out.println("Both instances are the same.");
        // } else {
        //     System.out.println("Instances are different.");
        // }
    }
    
}