package org.azma.enums;

public enum Coffee implements Drink {
     //An enum can even implement an interface
    // you want to define different methods for each enum.
    ESPRESSO (1, "Espresso", true){
        int a;
        @Override
        public void prepare() {System.out.println("Prepare Espresso , Grind coffee beans, extract a shot of espresso and  price :" + price() +"$" );}
        @Override
        public long price() {
            return 50;
        }
        public void  a (){

        }
    },
    AMERICANO (2, "Americano", false){
        @Override
        public void prepare() {
            System.out.println("Prepare Americano , Add hot water to espresso and  price :" + price() +"$" );
        }
        @Override
        public long price() {
            return 40;
        }
    },
    LATTE (3, "Latte", false){
        @Override
        public void prepare() {
            System.out.println("Prepare Latte, steam milk, and add to espresso and  price :" + price() +"$" );
        }
        @Override
        public long price() {
            return 30;
        }
    },
    MOCHA (4, "Mocha", false){
        @Override
        public void prepare() {System.out.println("Prepare Mocha, mix with chocolate syrup, add steamed milk and  price :" + price() +"$");}
        @Override
        public long price() {
            return 20;
        }
    };

    private final int code;
    private final String name;
    private final boolean isStrong;

    Coffee(int code, String name, boolean isStrong) {
        this.code = code;
        this.name = name;
        this.isStrong = isStrong;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public boolean isStrong() {
        return isStrong;
    }

    @Override
    public String toString() {
        return name;
    }

    public static Coffee getByCode(int code) {
        for (Coffee coffee : values()) {
            if (coffee.code == code) {
                return coffee;
            }
        }
        throw new IllegalArgumentException("No coffee found with code: " + code);
    }

}