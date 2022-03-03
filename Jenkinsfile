pipeline{
  agent any
  stages{
    stage("some name"){
      when {
        buildingTag()
      }
      
      steps{
        echo "Hello"
      }
    }
  }
}
