pipeline {
  
  agent any
  
  stages {
    
    stage("code checkout) {
          steps {
           git "https://github.com/teja996/Devops-clgproject-.git"
          }
          }
          
    stage("compile") {
      
      steps {
        echo 'building the appication...'
        bat 'mvn clean'
      }
    }
   
          
    stage("install") {
      
      steps {
        echo 'testing the appication...'
        bat 'mvn install'
      }
    }
          stage("test") {
      
      steps {
        echo 'testing the appication...'
        bat 'test'
      }
    }
  }
}
