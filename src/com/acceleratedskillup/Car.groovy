packege com.acceleratedskillup;

class Car1 {
  int numberOfDoors
  String model
  def script
    Car1(script) {
      this.script = script
    }

    void printOutCar() {
      script.echo "using script.echo"
      script.echo "number of Doors ${numberOfDoors}"
      script.echo "model ${model}"
    }
}
