class Cars {
    String brand = new String();

    Cars() {
        this("Ford");
    }

    Cars(String br) {
        this.brand = br;
    }

    void getbrand() {
        System.out.println("The car brand is " + this.brand);
    }
}

class Car {
    public static void main(String[] args) {
        Cars c = new Cars();
        c.getbrand();
        Cars d = new Cars("BMW");
        d.getbrand();
    }
}
