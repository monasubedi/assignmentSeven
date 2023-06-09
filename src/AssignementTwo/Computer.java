package AssignementTwo;

import java.util.Objects;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processorSpeed;

    Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize(){
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }
    public double computePower(){
        return ramSize * processorSpeed;
    }

    @Override
    public String toString(){

        return "Manufacturer" + manufacturer + " Processor" + processor + " Ramsize" + ramSize + " Processor " + processorSpeed +
                " Power " + computePower();

    }

    @Override
    public boolean equals(Object obj){
       if(this == obj) return true;
       if(obj == null || getClass() != obj.getClass()) return false;
       Computer computer = (Computer) obj;
       return ramSize == computer.ramSize && Double.compare(processorSpeed,computer.processorSpeed) == 0 && Objects.equals(manufacturer,computer.manufacturer) &&
               Objects.equals(processor,computer.processor);

    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacturer,processor,ramSize,processorSpeed);
    }
}
