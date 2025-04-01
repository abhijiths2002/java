class CPU {
    private double price;

    public CPU(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    class Processor {
        private int noOfCores;
        private String manufacturer;

        public Processor(int noOfCores, String manufacturer) {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }

        public int getNoOfCores() {
            return noOfCores;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }

    static class RAM {
        private int memory;
        private String manufacturer;

        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public int getMemory() {
            return memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(25000);
        CPU.Processor processor = cpu.new Processor(6, "Intel");
        CPU.RAM ram = new CPU.RAM(16, "Corsair");



        System.out.println("CPU Price: " + cpu.getPrice());
        System.out.println("Processor Cores: " + processor.getNoOfCores());
        System.out.println("Processor Manufacturer: " + processor.getManufacturer());
        System.out.println("RAM Memory: " + ram.getMemory());
        System.out.println("RAM Manufacturer: " + ram.getManufacturer());
    }
}

