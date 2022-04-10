packege com.acceleratedskillup;

class Car {
  int numberOfDoors
  String model
  def script
  Car(script) {
    this.script = script
  }
  
  void printOutCar() {
    script.echo "using script.echo"
    script.echo "number of Doors ${numberOfDoors}"
    script.echo "model ${model}"
  }
}
