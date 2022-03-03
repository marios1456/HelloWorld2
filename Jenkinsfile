pipeline{
  agent any
  stages{
    stage("some name"){
      when {
        changelog '.*some_text.*'
      }
      
      steps{
        echo "Hello"
      }
    }
  }
}
